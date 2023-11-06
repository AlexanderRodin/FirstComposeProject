package com.example.firstcomposeprodject.di

import com.example.firstcomposeprodject.domain.entity.FeedPost
import com.example.firstcomposeprodject.prsentation.ViewModelFactory
import dagger.BindsInstance
import dagger.Subcomponent

@Subcomponent(
    modules = [
        CommentsViewModelModule::class
    ]
)
interface CommentsScreenComponent {

    fun getViewModelFactory(): ViewModelFactory
    @Subcomponent.Factory
    interface Factory{
        fun create(
            @BindsInstance feedPost: FeedPost
        ): CommentsScreenComponent
    }
}