package com.example.firstcomposeprodject.di

import androidx.lifecycle.ViewModel
import com.example.firstcomposeprodject.prsentation.comments.CommentsViewModel
import com.example.firstcomposeprodject.prsentation.main.MainViewModel
import com.example.firstcomposeprodject.prsentation.news.NewsFeedViewModel
import dagger.Binds
import dagger.Module
import dagger.multibindings.IntoMap

@Module
interface ViewModelModule {
    @IntoMap
    @ViewModelKey(NewsFeedViewModel::class)
    @Binds
    fun bindNewsFeedViewModel(viewModel: NewsFeedViewModel): ViewModel

    @IntoMap
    @ViewModelKey(MainViewModel::class)
    @Binds
    fun bindMainViewModel(viewModel: MainViewModel): ViewModel
}