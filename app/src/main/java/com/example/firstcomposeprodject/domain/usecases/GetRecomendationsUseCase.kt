package com.example.firstcomposeprodject.domain.usecases

import com.example.firstcomposeprodject.domain.entity.FeedPost
import com.example.firstcomposeprodject.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

class GetRecomendationsUseCase @Inject constructor(
    private val repository: NewsFeedRepository
) {
    operator fun invoke(): StateFlow<List<FeedPost>>{
        return repository.getRecomendations()
    }
}