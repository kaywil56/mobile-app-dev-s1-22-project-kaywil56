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


class TranslatorFragment : Fragment() {
    private val apiKey = "trnsl.1.1.20200329T025311Z.37f6897b8a99dbd9.bb42d876c007fde0812c365015625fde8c0f0163"
    private lateinit var langsAdapter: ArrayAdapter<String>
    private lateinit var items: Map<String, String>
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View =  inflater.inflate(R.layout.fragment_translator, container, false)

        val inputText: EditText = view.findViewById(R.id.et_translate)
        val translatedText: TextView = view.findViewById(R.id.tv_translated)
        val translateBtn: Button = view.findViewById(R.id.btn_submit)

        val key: String = apiKey
        val ui = "en"

        val spinner: Spinner = view.findViewById(R.id.planets_spinner)

        fun <K, V> getKey(map: Map<K, V>, target: V): K? {
            for ((key, value) in map)
            {
                if (target == value) {
                    return key
                }
            }
            return null
        }

        retrofitServiceLangs.getLangs(key, ui).enqueue(object : Callback<Lang> {
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

            override fun onFailure(call: Call<Lang>, t: Throwable) {
                Log.e(TAG, "Unable to submit post to API.")
                Log.e(TAG, t.cause.toString())
            }
        })

        translateBtn.setOnClickListener {
            val langSelected: String? = langsAdapter.getItem(spinner.selectedItemPosition)
            val code = getKey(items, langSelected)
            val lang = "en-$code"
            val text = inputText.text.toString().trim()
            Log.d("lang", lang)
            retrofitServiceTranslator.savePost(key, text, lang).enqueue(object : Callback<Translate> {
                override fun onResponse(call: Call<Translate>, response: Response<Translate>) {
                    if (response.isSuccessful) {
                        translatedText.text = response.body().toString()
                        Log.i(TAG, "post submitted to API." + response.body().toString())
                    }
                    else{
                        Log.d(TAG, "Was not successful" + response.body().toString())
                    }
                }

                override fun onFailure(call: Call<Translate>, t: Throwable) {
                    Log.e(TAG, "Unable to submit post to API.")
                    Log.e(TAG, t.cause.toString())
                }
            })
        }

        return view
    }
}



