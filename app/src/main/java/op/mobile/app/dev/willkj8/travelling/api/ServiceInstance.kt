package op.mobile.app.dev.willkj8.travelling.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://gist.githubusercontent.com/Kaywil56/ce3ee63ffdf15a7f7e07193ba7c4a77c/"

object ServiceInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val retrofitService: ICountry by lazy {
        retrofit.create(ICountry::class.java)
    }
}