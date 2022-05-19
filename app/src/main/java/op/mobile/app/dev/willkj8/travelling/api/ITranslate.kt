package op.mobile.app.dev.willkj8.travelling.api


import op.mobile.app.dev.willkj8.travelling.model.Translate
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST


interface ITranslate {
    @POST("/api/v1.5/tr.json/translate")
    @FormUrlEncoded
    fun savePost(
        @Field("key") key: String?,
        @Field("text") text: String?,
        @Field("lang") lang: String?
    ): Call<Translate>
}