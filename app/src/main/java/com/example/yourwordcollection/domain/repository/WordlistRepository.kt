package com.example.yourwordcollection.domain.repository

import com.example.yourwordcollection.data.model.Word
import com.example.yourwordcollection.domain.entities.WordEntity

interface WordlistRepository {
    suspend fun saveWordToFavorite(word: Word)
    suspend fun fetchAllWords() : List<Word>
    suspend fun deleteWordFromFavorite(word: Word)
    suspend fun fetchWordByName(name: String) : Word?
}