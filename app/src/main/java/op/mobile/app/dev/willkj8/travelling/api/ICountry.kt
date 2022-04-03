package op.mobile.app.dev.willkj8.travelling.api

import op.mobile.app.dev.willkj8.travelling.model.Country
import retrofit2.http.GET

interface ICountry {
    @GET("raw")
    suspend fun getResponse(): List<Country>
}