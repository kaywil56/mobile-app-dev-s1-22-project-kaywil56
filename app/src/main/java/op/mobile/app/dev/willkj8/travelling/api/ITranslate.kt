package op.mobile.app.dev.willkj8.travelling.api


import op.mobile.app.dev.willkj8.travelling.model.Translate
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * A interface used to translate the given text
 */
interface ITranslate {
    @POST("/api/v1.5/tr.json/translate")
    @FormUrlEncoded
            /**
             * This functions is used to post to the translate api
             *
             * @param key api key
             * @param text text to be translated
             * @param lang language code
             * */
    fun savePost(
        @Field("key") key: String?,
        @Field("text") text: String?,
        @Field("lang") lang: String?
    ): Call<Translate>
}