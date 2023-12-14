package com.d121211096.music_track.data

import com.jakewharton.retrofit2.converter.kotlinx.serialization.asConverterFactory
import com.d121211096.music_track.data.repository.MusicRepository
import com.d121211096.music_track.data.source.remote.ApiService
import kotlinx.serialization.json.Json
import okhttp3.MediaType.Companion.toMediaType
import retrofit2.Retrofit

interface AppContainer {
    val musicRepository: MusicRepository
}

class DefaultAppContainer: AppContainer {

    private val BASE_URL = "https://api.ksoft.si"

    private val retrofit = Retrofit.Builder()
        .addConverterFactory(Json.asConverterFactory("application/json".toMediaType()))
        .baseUrl(BASE_URL)
        .build()

    private val retrofitService : ApiService by lazy {
        retrofit.create(ApiService::class.java)
    }

    override val musicRepository: MusicRepository
        get() = MusicRepository(retrofitService)

}