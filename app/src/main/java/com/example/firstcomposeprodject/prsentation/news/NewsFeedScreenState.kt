package com.example.firstcomposeprodject.prsentation.news

import com.example.firstcomposeprodject.domain.FeedPost

sealed class NewsFeedScreenState {

    object Initial : NewsFeedScreenState()
    data class Posts(val posts: List<FeedPost>) : NewsFeedScreenState()
}