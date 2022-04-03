package op.mobile.app.dev.willkj8.travelling

import retrofit2.http.GET

interface ICountry {
    @GET("raw")
    suspend fun getResponse(): List<Country>
}