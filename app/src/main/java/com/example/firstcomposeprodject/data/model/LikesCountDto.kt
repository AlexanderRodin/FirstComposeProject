package com.example.firstcomposeprodject.data.model

import com.google.gson.annotations.SerializedName

data class LikesCountDto(
    @SerializedName("likes") val count: Int
)
