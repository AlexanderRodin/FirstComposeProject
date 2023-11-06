package com.example.firstcomposeprodject.domain.usecases

import com.example.firstcomposeprodject.domain.entity.FeedPost
import com.example.firstcomposeprodject.domain.entity.PostComment
import com.example.firstcomposeprodject.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class GetCommentsUseCase @Inject constructor(
    private val repository: NewsFeedRepository
) {
    operator fun invoke(feedPost: FeedPost): StateFlow<List<PostComment>>{
        return repository.getComments(feedPost)
    }
}