package com.example.firstcomposeprodject.domain.usecases

import com.example.firstcomposeprodject.domain.entity.AuthState
import com.example.firstcomposeprodject.domain.entity.FeedPost
import com.example.firstcomposeprodject.domain.repository.NewsFeedRepository
import kotlinx.coroutines.flow.StateFlow

class GetAuthStateFlowUseCase(
    private val repository: NewsFeedRepository
) {
    operator fun invoke(): StateFlow<AuthState>{
        return repository.getAuthStateFlow()
    }
}