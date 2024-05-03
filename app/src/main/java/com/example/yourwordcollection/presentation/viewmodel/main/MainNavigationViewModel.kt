package com.example.yourwordcollection.presentation.viewmodel.main

import android.content.Context
import androidx.lifecycle.*
import androidx.savedstate.SavedStateRegistryOwner
import com.example.yourwordcollection.data.datasource.local.AuthLocalDataSourceImpl
import com.example.yourwordcollection.data.datasource.local.SharedPreferenceFactory
import com.example.yourwordcollection.data.model.Alphabet
import com.example.yourwordcollection.data.repository.AuthRepositoryImpl
import com.example.yourwordcollection.domain.repository.AuthRepository

class MainNavigationViewModel(
    private val model: Alphabet,
    private val authRepository: AuthRepository
) : ViewModel() {
    companion object {
        fun provideFactory(
            owner: SavedStateRegistryOwner,
            context: Context
        ): AbstractSavedStateViewModelFactory =
            object : AbstractSavedStateViewModelFactory(owner, null) {
                @Suppress("UNCHECKED_CAST")
                override fun <T : ViewModel> create(
                    key: String,
                    modelClass: Class<T>,
                    handle: SavedStateHandle,
                ): T {
                    val model = Alphabet()
                    val authRepository: AuthRepository = AuthRepositoryImpl(
                        authLocalDataSource = AuthLocalDataSourceImpl(
                            sharedPreference = SharedPreferenceFactory().createSharedPreferences(context),
                        ),
                    )
                    return MainNavigationViewModel(
                        model = model,
                        authRepository = authRepository
                    ) as T
                }
            }
    }

    private val liveAlphabetData: MutableLiveData<List<Alphabet>> = MutableLiveData()

    fun getAlphabetLists(): LiveData<List<Alphabet>> {
        loadData()
        return liveAlphabetData
    }

    private fun loadData(){
        liveAlphabetData.value = model.getAlphabetData()
    }

    fun logout() {
        authRepository.clearToken()
    }
}