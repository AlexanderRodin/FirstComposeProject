package com.example.firstcomposeprodject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.firstcomposeprodject.domain.FeedPost
import com.example.firstcomposeprodject.domain.PostComment
import com.example.firstcomposeprodject.ui.theme.CommentsScreenState

class CommentsViewModel(
    feedPost: FeedPost
): ViewModel() {

    private val _screenState = MutableLiveData<CommentsScreenState>(CommentsScreenState.Initial)
    val screenState: LiveData<CommentsScreenState> = _screenState

    init {
        loadComets(feedPost)
    }

    private fun loadComets (
        feedPost: FeedPost
    ) {
        val comments = mutableListOf<PostComment>().apply {
            repeat(10){
                add(PostComment(id = it))
            }
        }
        _screenState.value = CommentsScreenState.Comments(
            feedPost = feedPost,
            comments = comments
        )
    }
}