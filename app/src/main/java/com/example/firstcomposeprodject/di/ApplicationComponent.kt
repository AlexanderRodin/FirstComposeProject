package com.example.firstcomposeprodject.di

import android.content.Context
import com.example.firstcomposeprodject.domain.entity.FeedPost
import com.example.firstcomposeprodject.prsentation.main.MainActivity
import dagger.BindsInstance
import dagger.Component

@ApplicationScope
@Component(
    modules = [
        DataModule::class,
        ViewModelModule::class
    ]
)
interface ApplicationComponent {

    fun inject(mainActivity: MainActivity)

    fun getCommentsScreenComponentFactory(): CommentsScreenComponent.Factory

    @Component.Factory
    interface Factory {
        fun create(
            @BindsInstance context: Context,
        ): ApplicationComponent
    }
}