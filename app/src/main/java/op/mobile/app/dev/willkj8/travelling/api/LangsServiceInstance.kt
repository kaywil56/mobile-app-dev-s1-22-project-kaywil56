package op.mobile.app.dev.willkj8.travelling.api

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

private const val BASE_URL = "https://translate.yandex.net"

object LangsServiceInstance {
    private val retrofit by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
    }

    val retrofitServiceLangs: ILangs by lazy {
        retrofit.create(ILangs::class.java)
    }

}