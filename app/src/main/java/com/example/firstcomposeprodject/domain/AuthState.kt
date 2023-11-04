package com.example.firstcomposeprodject.domain

sealed class AuthState{
    object Authorized: AuthState()
    object NotAuthorized: AuthState()
    object Initial: AuthState()
}
