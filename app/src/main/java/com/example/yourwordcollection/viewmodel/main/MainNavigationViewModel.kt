package com.example.yourwordcollection.viewmodel.main

import androidx.lifecycle.*
import androidx.savedstate.SavedStateRegistryOwner
import com.example.yourwordcollection.navigationcomponent.fragment.main.model.Alphabet

class MainNavigationViewModel(
    private val model: Alphabet
) : ViewModel() {
    companion object {
        fun provideFactory(
            owner: SavedStateRegistryOwner,
        ): AbstractSavedStateViewModelFactory =
            object : AbstractSavedStateViewModelFactory(owner, null) {
                @Suppress("UNCHECKED_CAST")
                override fun <T : ViewModel> create(
                    key: String,
                    modelClass: Class<T>,
                    handle: SavedStateHandle,
                ): T {
                    val model = Alphabet()
                    return MainNavigationViewModel(model = model) as T
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
}