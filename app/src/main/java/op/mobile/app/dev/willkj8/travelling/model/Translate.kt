package op.mobile.app.dev.willkj8.travelling.model
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

class Translate {
    @SerializedName("text")
    @Expose
    private var text: List<String>? = null

    // Return the first option in the text array e.g. text[0] -> "здравствуйте"
    override fun toString(): String {
        return text!![0]
    }
}