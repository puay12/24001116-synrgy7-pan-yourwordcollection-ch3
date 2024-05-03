package com.example.yourwordcollection.data.datasource.interfaces

import com.example.yourwordcollection.data.model.Word
import com.example.yourwordcollection.domain.entities.WordEntity

interface WordLocalDataSource {
    suspend fun saveWordToFavorite(wordEntity: WordEntity)
    suspend fun fetchAllWords() : List<WordEntity>
    suspend fun deleteWordFromFavorite(wordEntity: WordEntity)
    suspend fun fetchWordByName(name: String) : WordEntity?
}