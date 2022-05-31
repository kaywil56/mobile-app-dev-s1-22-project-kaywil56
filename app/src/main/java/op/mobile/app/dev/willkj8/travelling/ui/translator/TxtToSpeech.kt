package op.mobile.app.dev.willkj8.travelling.ui.translator

import android.content.ContentValues.TAG
import android.content.Context
import android.speech.tts.TextToSpeech
import android.util.Log
import android.widget.Toast
import java.util.*

/**
 * A Class for *TTS*.
 *
 * This class handles logic for the TTS feature.
 *
 * @param context The Translator fragment context
 * @param text The text to be played
 * @param lang The language for the text to be played in
 */
class TxtToSpeech(val context: Context, val text: String, val lang: String) : TextToSpeech.OnInitListener {
    private val txtToSpeech: TextToSpeech = TextToSpeech(context, this)

    /**
     * Logic for when the TTS is initialized.
     *
     * @param status if the tts was created successfully
     */
    override fun onInit(status: Int) {
        if (status == TextToSpeech.SUCCESS) {
            val result: Int = txtToSpeech.setLanguage(Locale(lang))
            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED)
            {
                Toast.makeText(context, "Language not available.", Toast.LENGTH_LONG ).show();
            }
            else{
                speakOut(text)
            }
        }
        else{
            Log.d(TAG, "Something went wrong")
        }
    }

    /**
     * Triggers the tts to play the given text.
     *
     * @param text the text to be played
     */
    private fun speakOut(text: String) {
        Log.d(TAG, "Current lang is: " + txtToSpeech.language.displayLanguage)
        txtToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null, null)
    }
}