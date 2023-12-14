package com.d121211096.music_track.data.source.remote

import com.d121211096.music_track.data.response.GetMusicResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("lyrics/search")
    suspend fun getMusic(
        @Query("q") q: String,
        @Query("text_only") text_only: Boolean,
        @Query("limit") limit: Int,
    ): GetMusicResponse
}