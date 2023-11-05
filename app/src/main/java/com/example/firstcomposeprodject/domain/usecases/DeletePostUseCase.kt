package com.example.firstcomposeprodject.domain.usecases

import com.example.firstcomposeprodject.domain.entity.FeedPost
import com.example.firstcomposeprodject.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.StateFlow

class DeletePostUseCase(
    private val repository: NewsFeedRepository
) {
    suspend operator fun invoke(post: FeedPost) {
         repository.deletePost(post)
    }
}