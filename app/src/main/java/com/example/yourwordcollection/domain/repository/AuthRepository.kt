package com.example.yourwordcollection.domain.repository

interface AuthRepository {
    suspend fun userLogin(username: String, password: String): String
    fun setToken(token: String)
    fun getToken(): String?
    fun clearToken()
}