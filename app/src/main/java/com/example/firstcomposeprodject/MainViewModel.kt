package com.example.firstcomposeprodject

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class MainViewModel: ViewModel() {
    private val _isFollowing = MutableLiveData<Boolean>()
    val isFollowing: LiveData<Boolean> = _isFollowing

    fun changeFollowingStatus(){
        val wasFallowing = _isFollowing.value ?: false
        _isFollowing.value = !wasFallowing
    }
}