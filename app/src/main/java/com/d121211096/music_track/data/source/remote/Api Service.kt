package com.d121211096.music_track.data.source.remote

import com.d121211096.music_track.data.response.GetMusicResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("lyrics/search")
    suspend fun getMusic(
        @Query("q") q: String,
        @Query("from") from: String,
        @Query("sortBy") sortBy: String,
        @Query("apiKey") apiKey: String = "b20c0ec3d33f4ed599f61e82a2a7484e"
    ): GetMusicResponse
}