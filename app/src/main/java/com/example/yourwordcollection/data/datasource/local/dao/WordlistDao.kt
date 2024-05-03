package com.example.yourwordcollection.data.datasource.local.dao

import androidx.room.*
import com.example.yourwordcollection.domain.entities.WordEntity

@Dao
interface WordlistDao {
    @Query("SELECT DISTINCT * FROM favorite_word_list")
    suspend fun getAllWords(): List<WordEntity>

    @Query("SELECT DISTINCT * FROM favorite_word_list WHERE name = :name")
    suspend fun getWordByName(name: String) : WordEntity?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertWord(wordEntity: WordEntity)

    @Delete
    suspend fun deleteWord(wordEntity: WordEntity)
}