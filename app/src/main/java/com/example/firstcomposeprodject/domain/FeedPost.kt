package com.example.firstcomposeprodject.domain

data class FeedPost(
    val id: String,
    val communityName: String,
    val publicationDate: String,
    val communityImageUrl: String,
    val contentText: String,
    val contentImgUrl: String?,
    val statistics: List<StatisticItem>
)