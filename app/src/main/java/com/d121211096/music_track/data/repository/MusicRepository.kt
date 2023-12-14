package com.d121211096.music_track.data.repository

import com.d121211096.music_track.data.response.GetMusicResponse
import com.d121211096.music_track.data.source.remote.ApiService

class MusicRepository(retrofitService: ApiService) {

    suspend fun getMusic(q: String, from: String, sortBy: String, apiKey: String): GetMusicResponse {
        return ApiService.getMusic(q, from, sortBy, apiKey)
    }

}
