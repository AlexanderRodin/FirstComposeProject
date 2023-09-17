package com.example.firstcomposeprodject.data.network

import com.example.firstcomposeprodject.data.model.NewsFeedResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("newsfeed.getRecommended?v=5.131")
    suspend fun loadNews(
        @Query("access_token") token: String
        ): NewsFeedResponse
}