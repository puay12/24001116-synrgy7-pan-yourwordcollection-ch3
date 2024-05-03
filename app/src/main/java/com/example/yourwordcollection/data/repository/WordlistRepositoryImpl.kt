package com.example.yourwordcollection.data.repository

import com.example.yourwordcollection.data.datasource.interfaces.WordLocalDataSource
import com.example.yourwordcollection.data.model.Word
import com.example.yourwordcollection.domain.entities.WordEntity
import com.example.yourwordcollection.domain.repository.WordlistRepository

class WordlistRepositoryImpl(
    private val wordLocalDataSource: WordLocalDataSource
) : WordlistRepository {
    override suspend fun saveWordToFavorite(word: Word) {
        wordLocalDataSource.saveWordToFavorite(word.toEntity())
    }

    override suspend fun fetchAllWords(): List<Word> {
        return wordLocalDataSource.fetchAllWords().toWordlist()
    }

    override suspend fun deleteWordFromFavorite(word: Word) {
        wordLocalDataSource.deleteWordFromFavorite(word.toEntity())
    }

    override suspend fun fetchWordByName(name: String): Word? {
        return wordLocalDataSource.fetchWordByName(name)?.toWord()
    }

    private fun WordEntity.toWord() : Word {
        return Word(
            id = id,
            name = name,
            imgUrl = imgUrl
        )
    }

    private fun Word.toEntity() : WordEntity {
        return WordEntity(
            id = id,
            name = name,
            imgUrl = imgUrl
        )
    }

    private fun List<WordEntity>.toWordlist() : List<Word> {
        return map { word -> word.toWord() }
    }
}