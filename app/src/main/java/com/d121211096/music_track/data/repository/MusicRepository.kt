package com.d121211096.music_track.data.repository

import com.d121211096.music_track.data.response.GetMusicResponse
import com.d121211096.music_track.data.source.remote.ApiService

class MusicRepository(private val apiService: ApiService) {

    suspend fun getMusic(q: String, text_only: Boolean, limit: Int): GetMusicResponse {
        return apiService.getMusic(q, text_only = false, limit = 10)
    }

}
