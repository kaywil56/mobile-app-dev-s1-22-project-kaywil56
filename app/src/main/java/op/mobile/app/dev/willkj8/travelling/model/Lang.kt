package op.mobile.app.dev.willkj8.travelling.model

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Lang {
    @SerializedName("langs")
    @Expose
    private var langs: Map<String, String>? = null

    fun getLangs(): Map<String, String>? {
        return langs
    }
}