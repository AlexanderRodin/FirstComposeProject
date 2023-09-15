package com.example.firstcomposeprodject.prsentation.main

sealed class AuthState{
    object Authorized: AuthState()
    object NotAuthorized: AuthState()
    object Initial: AuthState()
}
