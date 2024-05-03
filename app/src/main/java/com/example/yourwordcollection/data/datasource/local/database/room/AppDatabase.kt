package com.example.yourwordcollection.data.datasource.local.database.room

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.yourwordcollection.data.datasource.local.dao.WordlistDao
import com.example.yourwordcollection.domain.entities.WordEntity

@Database(entities = [WordEntity::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun wordlistDao() : WordlistDao
}