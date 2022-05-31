package op.mobile.app.dev.willkj8.travelling.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

/**
 * A model class for Lang.
 *
 * This class is a model for the get languages request.
 */
class Lang {
    @SerializedName("langs")
    @Expose
    private var langs: Map<String, String>? = null

    /**
     * This function gets the available languages.
     *
     * @return The available languages as a map
     */
    fun getLangs(): Map<String, String>? {
        return langs
    }
}