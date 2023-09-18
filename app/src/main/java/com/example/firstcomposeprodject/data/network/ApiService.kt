package com.example.firstcomposeprodject.data.network

import com.example.firstcomposeprodject.data.model.LikesCountResponseDto
import com.example.firstcomposeprodject.data.model.NewsFeedResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("newsfeed.getRecommended?v=5.131")
    suspend fun loadNews(
        @Query("access_token") token: String
    ): NewsFeedResponse



    @GET("likes.add?v=5.131&type=post")
    suspend fun addLike(
        @Query("access_token") token: String,
        @Query("owner_id") ownerId: Long,
        @Query("item_id") postId: Long
    ) : LikesCountResponseDto

    @GET("likes.delete?v=5.131&type=post")
    suspend fun deleteLike(
        @Query("access_token") token: String,
        @Query("owner_id") ownerId: Long,
        @Query("item_id") postId: Long
    ) : LikesCountResponseDto
}