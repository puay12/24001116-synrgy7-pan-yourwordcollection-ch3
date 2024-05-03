package com.example.yourwordcollection.data.repository

import com.example.yourwordcollection.data.datasource.interfaces.AuthLocalDataSource
import com.example.yourwordcollection.domain.repository.AuthRepository
import kotlinx.coroutines.delay

class AuthRepositoryImpl(
    private val authLocalDataSource: AuthLocalDataSource
) : AuthRepository {
    override suspend fun userLogin(username: String, password: String): String {
        return authLocalDataSource.userLogin(username, password)
    }

    override fun setToken(token: String) {
        authLocalDataSource.setToken(token)
    }

    override fun getToken(): String? {
        return authLocalDataSource.getToken()
    }

    override fun clearToken() {
        authLocalDataSource.clearToken()
    }

}