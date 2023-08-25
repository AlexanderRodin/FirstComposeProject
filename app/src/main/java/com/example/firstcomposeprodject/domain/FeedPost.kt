package com.example.firstcomposeprodject.domain

import com.example.firstcomposeprodject.R

data class FeedPost (
   val communityName: String = "/dev/null",
   val publicationDate: String = "14:00",
   val avatarResId: Int = R.drawable.user_img,
   val contentText: String = "Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...",
   val contentImgResId: Int = R.drawable.post_content_image,
   val statistics: List<StatisticItem> = listOf(
        StatisticItem(type = StatisticType.VIEWS, 966),
        StatisticItem(type = StatisticType.SHARES, 7),
        StatisticItem(type = StatisticType.COMMENTS, 8),
        StatisticItem(type = StatisticType.LIKES, 27)
   )
        )