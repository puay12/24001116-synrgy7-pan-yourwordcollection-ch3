package com.example.yourwordcollection.presentation.viewmodel.login

import android.content.Context
import androidx.lifecycle.*
import androidx.savedstate.SavedStateRegistryOwner
import com.example.yourwordcollection.data.datasource.local.AuthLocalDataSourceImpl
import com.example.yourwordcollection.data.datasource.local.SharedPreferenceFactory
import com.example.yourwordcollection.data.repository.AuthRepositoryImpl
import com.example.yourwordcollection.domain.repository.AuthRepository
import kotlinx.coroutines.launch

class LoginViewModel(
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
                    return LoginViewModel(
                        authRepository = authRepository
                    ) as T
                }
            }
    }

    private val _loading: MutableLiveData<Boolean> = MutableLiveData<Boolean>()
    private val _error: MutableLiveData<Throwable> = MutableLiveData<Throwable>()
    private val _success: MutableLiveData<Boolean> = MutableLiveData<Boolean>()

    fun userLogin(username: String, password: String) {
        viewModelScope.launch {
            try {
                _loading.value = true
                val token = authRepository.userLogin(username, password)
                authRepository.setToken(token)
                _loading.value = false
                _success.value = true
            } catch (error: Throwable) {
                _error.value = error
                _loading.value = false
            }
        }
    }

    fun getError() : LiveData<Throwable> {
        return _error
    }

    fun getSuccess() : LiveData<Boolean> {
        return _success
    }

    fun getLoading() : LiveData<Boolean> {
        return _loading
    }
}