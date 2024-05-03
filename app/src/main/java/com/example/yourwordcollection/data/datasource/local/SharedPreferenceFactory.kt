package com.example.yourwordcollection.data.datasource.local

import android.content.Context
import android.content.SharedPreferences

class SharedPreferenceFactory {
    companion object {
        const val SHARED_PREFERENCES_NAME = "ajshsjshjshsha"
    }

    fun createSharedPreferences(context: Context): SharedPreferences {
        return context.getSharedPreferences(SHARED_PREFERENCES_NAME, Context.MODE_PRIVATE)
    }
}