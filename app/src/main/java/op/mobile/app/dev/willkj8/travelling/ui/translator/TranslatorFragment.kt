package op.mobile.app.dev.willkj8.travelling.ui.translator

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import androidx.fragment.app.Fragment
import op.mobile.app.dev.willkj8.travelling.R
import op.mobile.app.dev.willkj8.travelling.api.LangsServiceInstance.retrofitServiceLangs
import op.mobile.app.dev.willkj8.travelling.api.TranslateServiceInstance.retrofitServiceTranslator
import op.mobile.app.dev.willkj8.travelling.model.Lang
import op.mobile.app.dev.willkj8.travelling.model.Translate
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

/**
 * A Fragment for the *Translator*.
 *
 * This class handles logic for the translator feature.
 */
class TranslatorFragment : Fragment() {
    private var apiKey = "trnsl.1.1.20200329T025311Z.37f6897b8a99dbd9.bb42d876c007fde0812c365015625fde8c0f0163"
    private lateinit var langsAdapter: ArrayAdapter<String>
    private lateinit var items: Map<String, String>

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View =  inflater.inflate(R.layout.fragment_translator, container, false)
        val currentLangCode = TranslatorFragmentArgs.fromBundle(requireArguments()).lang

        val inputText: EditText = view.findViewById(R.id.et_translate)
        val translatedText: TextView = view.findViewById(R.id.tv_translated)
        val translateBtn: Button = view.findViewById(R.id.btn_submit)
        val speechBtn: Button = view.findViewById(R.id.btn_speech)

        val key: String = apiKey
        val ui = "en"

        val spinner: Spinner = view.findViewById(R.id.planets_spinner)
        spinner.prompt = "Select a language"

        requestLanguages(key, ui, spinner)

        translateBtn.setOnClickListener {
            val langSelected: String? = langsAdapter.getItem(spinner.selectedItemPosition)
            val code = getKey(items, langSelected)
            val lang = "$code-$currentLangCode"
            Log.d("lang", lang)

            when {
                inputText.text.isEmpty() ->
                    inputText.error = "Input is required."
                else -> {
                    Toast.makeText(context, "Attempting to translate text...", Toast.LENGTH_SHORT).show()
                    requestTranslation(key, lang, translatedText, inputText)
                }
            }
        }

        speechBtn.setOnClickListener{
            val txt = inputText.text.toString()
            when {
                txt.isEmpty() ->
                    inputText.error = "Input is required."
                else -> {
                    TxtToSpeech(requireContext(), translatedText.text.toString(), currentLangCode)
                }
            }
        }

        return view
    }

    /**
     * Requests a list of available languages and adds them to a list adapter.
     *
     * @param key Api key to authorize access for the request
     * @param ui The base language for the data to be returned in
     * @param spinner The spinner item that will display the available languages
     */
    private fun requestLanguages(key: String, ui: String, spinner: Spinner){
        retrofitServiceLangs.getLangs(key, ui).enqueue(object : Callback<Lang> {

            /**
             * Handles the request response and applys the data to a list adapter.
             *
             * @param call The post request
             * @param response The request response to be handled
             */
            override fun onResponse(call: Call<Lang>, response: Response<Lang>) {
                if (response.isSuccessful) {
                    items = response.body()!!.getLangs()!!
                    val langsList:Array<String> = items.values.toTypedArray()

                    langsAdapter = LangsAdapter(
                        requireContext(),
                        R.layout.spinner_item,
                        langsList
                    )

                    langsAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)
                    spinner.adapter = langsAdapter

                    Log.i(TAG, "post submitted to API." + response.body().toString())
                }
            }

            /**
             * Handles A request failure.
             *
             * @param call The post request
             * @param t error exception
             */
            override fun onFailure(call: Call<Lang>, t: Throwable) {
                Log.e(TAG, "Unable to submit post to API.")
                Log.e(TAG, t.cause.toString())
            }
        })
    }

    /**
     * Requests a translation of a given word to a given language.
     *
     * @param key Api key to authorize access for the request
     * @param lang A combination of the selected language code to the current country language code e.g. en-es
     * @param translatedText A Text view to display the translated text
     * @param inputText A Edit text to input the word you want to be translated
     */
    private fun requestTranslation(key: String, lang: String, translatedText: TextView, inputText: EditText){
        val text = inputText.text.toString().trim()
        retrofitServiceTranslator.savePost(key, text, lang).enqueue(object : Callback<Translate> {

            /**
             * Handles the request response and applys the data to a list adapter.
             *
             * @param call The post request
             * @param response The request response to be handled
             */
            override fun onResponse(call: Call<Translate>, response: Response<Translate>) {
                if (response.isSuccessful) {
                    translatedText.text = response.body().toString()
                    Log.i(TAG, "post submitted to API." + response.body().toString())
                }
                else{
                    Log.d(TAG, "Was not successful" + response.body().toString())
                    inputText.error = "Invalid input."
                }
            }

            /**
             * Handles A request failure.
             *
             * @param call The post request
             * @param t error exception
             */
            override fun onFailure(call: Call<Translate>, t: Throwable) {
                Log.e(TAG, "Unable to submit post to API.")
                Log.e(TAG, t.cause.toString())
            }
        })
    }

    private fun <K, V> getKey(map: Map<K, V>, target: V): K? {
        for ((key, value) in map)
        {
            if (target == value) {
                return key
            }
        }
        return null
    }
}