package com.d121211096.music_track.data.response

import com.d121211096.music_track.data.models.Article
import kotlinx.serialization.SerialName
import kotlinx.serialization.Serializable
@Serializable
data class GetMusicResponse(
    @SerialName("total")
    val total: Int?,
    @SerialName("took")
    val took: Int?,
    @SerialName("data")
    val data: Article?
)