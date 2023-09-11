package com.example.firstcomposeprodject.ui.theme

import com.example.firstcomposeprodject.domain.FeedPost

sealed class NewsFeedScreenState {

    object Initial : NewsFeedScreenState()
    data class Posts(val posts: List<FeedPost>) : NewsFeedScreenState()
}
