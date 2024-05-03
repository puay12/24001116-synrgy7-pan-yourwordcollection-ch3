package com.example.yourwordcollection.data.datasource.local

import android.content.SharedPreferences
import com.example.yourwordcollection.data.datasource.interfaces.AuthLocalDataSource
import kotlinx.coroutines.delay

class AuthLocalDataSourceImpl(
    private val sharedPreference: SharedPreferences
) : AuthLocalDataSource {
    companion object {
        const val KEY_TOKEN = "uwaw"
    }

    private val user = mapOf(
        "username" to "puay124",
        "password" to "Puay1244"
    )

    override suspend fun userLogin(username: String, password: String): String {
        delay(1000)
        if ((username == user.get("username")) && (password == user.get("password"))) {
            return "cuakssssssa6wadidawjiwa"
        } else {
            throw UnsupportedOperationException("Maaf, user ini tidak ditemukan")
        }
    }

    override fun setToken(token: String) {
        sharedPreference.edit().putString(KEY_TOKEN, token).apply()
    }

    override fun getToken(): String? {
        return sharedPreference.getString(KEY_TOKEN, null)
    }

    override fun clearToken() {
        sharedPreference.edit().remove(KEY_TOKEN).apply()
    }

}