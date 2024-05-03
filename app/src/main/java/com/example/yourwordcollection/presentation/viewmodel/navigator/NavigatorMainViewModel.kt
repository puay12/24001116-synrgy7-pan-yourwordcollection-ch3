package com.example.yourwordcollection.presentation.viewmodel.navigator

import android.content.Context
import androidx.lifecycle.AbstractSavedStateViewModelFactory
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.savedstate.SavedStateRegistryOwner
import com.example.yourwordcollection.data.datasource.local.AuthLocalDataSourceImpl
import com.example.yourwordcollection.data.datasource.local.SharedPreferenceFactory
import com.example.yourwordcollection.data.repository.AuthRepositoryImpl
import com.example.yourwordcollection.domain.repository.AuthRepository
import com.example.yourwordcollection.presentation.viewmodel.login.LoginViewModel

class NavigatorMainViewModel(
    private val authRepository: AuthRepository
) : ViewModel() {
    companion object {
        fun provideFactory(
            owner: SavedStateRegistryOwner,
            context: Context,
        ) =
            object : AbstractSavedStateViewModelFactory(owner, null) {
                @Suppress("UNCHECKED_CAST")
                override fun <T : ViewModel> create(
                    key: String,
                    modelClass: Class<T>,
                    handle: SavedStateHandle,
                ): T {
                    val authRepository: AuthRepository = AuthRepositoryImpl(
                        authLocalDataSource = AuthLocalDataSourceImpl(
                            sharedPreference = SharedPreferenceFactory().createSharedPreferences(context),
                        ),
                    )
                    return NavigatorMainViewModel(
                        authRepository = authRepository
                    ) as T
                }
            }
    }

    fun checkUser() : Boolean {
        return !authRepository.getToken().isNullOrEmpty()
    }
}