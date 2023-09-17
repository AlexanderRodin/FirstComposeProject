package com.example.firstcomposeprodject.data.model

import com.google.gson.annotations.SerializedName

data class PhotoDto(
    @SerializedName("sizes") val photoUrl: List<PhotoUrlDto>
)
