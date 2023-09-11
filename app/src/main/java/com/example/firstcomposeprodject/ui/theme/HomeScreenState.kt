package com.example.firstcomposeprodject.ui.theme

import com.example.firstcomposeprodject.domain.FeedPost
import com.example.firstcomposeprodject.domain.PostComment

sealed class HomeScreenState{

    object Initial: HomeScreenState()
    data class Posts(val posts: List<FeedPost>): HomeScreenState()
    data class Comments(val feedPost: FeedPost, val comments: List<PostComment>): HomeScreenState()
}
