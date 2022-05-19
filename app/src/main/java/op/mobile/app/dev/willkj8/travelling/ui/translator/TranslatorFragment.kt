package op.mobile.app.dev.willkj8.travelling.ui.translator

import android.content.ContentValues.TAG
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.fragment.app.Fragment
import op.mobile.app.dev.willkj8.travelling.R
import op.mobile.app.dev.willkj8.travelling.api.TranslateServiceInstance.retrofitServiceTranslator
import op.mobile.app.dev.willkj8.travelling.model.Translate
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


class TranslatorFragment : Fragment() {
    private val apiKey = "trnsl.1.1.20200329T025311Z.37f6897b8a99dbd9.bb42d876c007fde0812c365015625fde8c0f0163"
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View =  inflater.inflate(R.layout.fragment_translator, container, false)

        val inputText: EditText = view.findViewById(R.id.et_translate)
        val translatedText: TextView = view.findViewById(R.id.tv_translated)
        val translateBtn: Button = view.findViewById(R.id.btn_submit)

        translateBtn.setOnClickListener {
            val key: String = apiKey
            val text = inputText.text.toString().trim()
            val lang = "en-ru"

            retrofitServiceTranslator.savePost(key, text, lang).enqueue(object : Callback<Translate> {
                override fun onResponse(call: Call<Translate>, response: Response<Translate>) {
                    if (response.isSuccessful) {
                        translatedText.text = response.body().toString()
                        Log.i(TAG, "post submitted to API." + response.body().toString())
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



