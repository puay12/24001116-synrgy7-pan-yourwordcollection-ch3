package com.example.yourwordcollection.data.datasource.interfaces

interface AuthLocalDataSource {
    suspend fun userLogin(username: String, password: String) : String
    fun setToken(token: String)
    fun getToken(): String?
    fun clearToken()
}