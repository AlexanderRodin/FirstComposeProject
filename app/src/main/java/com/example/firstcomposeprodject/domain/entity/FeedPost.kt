package com.example.firstcomposeprodject.domain.entity


data class FeedPost(
    val id: Long,
    val communityId: Long,
    val communityName: String,
    val publicationDate: String,
    val communityImageUrl: String,
    val contentText: String,
    val contentImgUrl: String?,
    val statistics: List<StatisticItem>,
    val isLiked: Boolean
)