package com.example.firstcomposeprodject.domain

import com.example.firstcomposeprodject.R

data class PostComment (
    val id: Int,
    val authorName: String = "Author",
    val authorAvatar: Int = R.drawable.comment_author_avatar,
    val commentText: String = "Long comment text",
    val publicationDate: String = "14:00"
)