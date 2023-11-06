package com.example.firstcomposeprodject.di

import android.content.Context
import com.example.firstcomposeprodject.data.network.ApiFactory
import com.example.firstcomposeprodject.data.network.ApiService
import com.example.firstcomposeprodject.data.repository.NewsFeedRepositoryImpl
import com.example.firstcomposeprodject.domain.repository.NewsFeedRepository
import com.vk.api.sdk.VKPreferencesKeyValueStorage
import dagger.Binds
import dagger.Module
import dagger.Provides

@Module
interface DataModule {

    @ApplicationScope
    @Binds
    fun bindRepository(impl: NewsFeedRepositoryImpl): NewsFeedRepository

    companion object {
        @ApplicationScope
        @Provides
        fun providesApiService(): ApiService {
            return ApiFactory.apiService
        }
        @ApplicationScope
        @Provides
        fun provideVkStorage(context: Context): VKPreferencesKeyValueStorage {
            return VKPreferencesKeyValueStorage(context)
        }
    }
}