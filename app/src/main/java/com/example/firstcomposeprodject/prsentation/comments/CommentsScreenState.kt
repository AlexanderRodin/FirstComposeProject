package com.example.firstcomposeprodject.prsentation.comments

import com.example.firstcomposeprodject.domain.entity.FeedPost
import com.example.firstcomposeprodject.domain.entity.PostComment

sealed class CommentsScreenState {

    object Initial : CommentsScreenState()
    data class Comments(
        val feedPost: FeedPost,
        val comments: List<PostComment>
    ) : CommentsScreenState()
}
