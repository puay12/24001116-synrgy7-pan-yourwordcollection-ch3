package com.example.yourwordcollection.domain.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "favorite_word_list")
data class WordEntity(
    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id") val id: Int? = null,
    @ColumnInfo(name = "name") val name: String,
    @ColumnInfo(name = "imgUrl") val imgUrl: String
)
