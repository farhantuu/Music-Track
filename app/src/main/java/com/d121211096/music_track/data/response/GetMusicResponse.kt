package com.d121211096.music_track.data.response

import com.d121211096.music_track.data.models.Article
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable

@Serializable
data class GetNewsResponse(
    @SerialName("articles")
    val articles: List<Article>?,
    @SerialName("status")
    val status: String?,
    @SerialName("totalResults")
    val totalResults: Int?
) {


    class GetMusicResponse {

    }
