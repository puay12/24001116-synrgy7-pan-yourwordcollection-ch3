package com.example.yourwordcollection.presentation.viewmodel.favorites

import android.content.Context
import android.os.Bundle
import androidx.lifecycle.*
import androidx.room.Room
import androidx.savedstate.SavedStateRegistryOwner
import com.example.yourwordcollection.data.datasource.local.WordLocalDataSourceImpl
import com.example.yourwordcollection.data.datasource.local.database.room.AppDatabase
import com.example.yourwordcollection.data.model.Word
import com.example.yourwordcollection.data.repository.WordlistRepositoryImpl
import com.example.yourwordcollection.domain.repository.WordlistRepository
import com.example.yourwordcollection.presentation.viewmodel.wordlist.WordlistNavigationViewModel
import kotlinx.coroutines.launch

class FavoritesNavigationViewModel(
    private val wordlistRepository: WordlistRepository
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
                    val roomDatabase = Room.databaseBuilder(
                        context,
                        AppDatabase::class.java,
                        "favorite_word_list"
                    ).build()
                    val wordlistRepository: WordlistRepository = WordlistRepositoryImpl(
                        wordLocalDataSource = WordLocalDataSourceImpl(
                            wordlistDao = roomDatabase.wordlistDao()
                        )
                    )
                    return FavoritesNavigationViewModel(
                        wordlistRepository = wordlistRepository
                    ) as T
                }
            }
    }

    private val _favoriteList: MutableLiveData<List<Word>> = MutableLiveData()
    private val _favoriteWord: MutableLiveData<Word> = MutableLiveData()
    private val _error: MutableLiveData<Throwable> = MutableLiveData<Throwable>()

    fun getFavoriteList() : LiveData<List<Word>>? {
        getAllFavorites()
        return _favoriteList
    }

    fun getAllFavorites() {
        viewModelScope.launch {
            try{
                _favoriteList.value = wordlistRepository.fetchAllWords()
            } catch (error: Throwable) {
                _error.value = error
            }
        }
    }

    fun getFavoriteByName(name: String) : LiveData<Word> {
        viewModelScope.launch {
            try{
                _favoriteWord.value = wordlistRepository.fetchWordByName(name)
                getAllFavorites()
            } catch (error: Throwable) {
                _error.value = error
            }
        }
        return _favoriteWord
    }

    fun deleteFromFavorite(word: Word) {
        viewModelScope.launch {
            wordlistRepository.deleteWordFromFavorite(word)
        }
    }
}