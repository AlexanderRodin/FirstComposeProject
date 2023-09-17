package com.example.firstcomposeprodject.data.model

import com.google.gson.annotations.SerializedName

data class NewsFeedResponse(
    @SerializedName("response") val newsFeedContent: NewsFeedContentDto
)
