package com.example.firstcomposeprodject.prsentation

import android.app.Application
import com.example.firstcomposeprodject.di.ApplicationComponent
import com.example.firstcomposeprodject.di.DaggerApplicationComponent

class NewsFeedApplication : Application() {
    val component: ApplicationComponent by lazy {
        DaggerApplicationComponent.factory().create(
            this
        )
    }
}