package com.example.yourwordcollection.data.datasource.local

import com.example.yourwordcollection.data.datasource.interfaces.WordLocalDataSource
import com.example.yourwordcollection.data.datasource.local.dao.WordlistDao
import com.example.yourwordcollection.data.model.Word
import com.example.yourwordcollection.domain.entities.WordEntity

class WordLocalDataSourceImpl(
    private val wordlistDao: WordlistDao
) : WordLocalDataSource {
    override suspend fun saveWordToFavorite(wordEntity: WordEntity) {
        wordlistDao.insertWord(wordEntity)
    }

    override suspend fun fetchAllWords(): List<WordEntity> {
        return wordlistDao.getAllWords()
    }

    override suspend fun deleteWordFromFavorite(wordEntity: WordEntity) {
        wordlistDao.deleteWord(wordEntity)
    }

    override suspend fun fetchWordByName(name: String): WordEntity? {
        return wordlistDao.getWordByName(name)
    }

}