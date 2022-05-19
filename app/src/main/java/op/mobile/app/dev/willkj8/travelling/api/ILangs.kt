package op.mobile.app.dev.willkj8.travelling.api

import op.mobile.app.dev.willkj8.travelling.model.Lang
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST


interface ILangs {
    @POST("/api/v1.5/tr.json/getLangs")
    @FormUrlEncoded
    fun getLangs(
        @Field("key") key: String?,
        @Field("ui") ui: String?
    ): Call<Lang>
}