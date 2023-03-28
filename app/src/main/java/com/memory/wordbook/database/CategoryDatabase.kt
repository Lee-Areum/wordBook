package com.memory.wordbook.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.memory.wordbook.database.dao.CategoryDAO
import com.memory.wordbook.database.dto.Category

@Database(entities = [Category::class], version = 1)
abstract class CategoryDatabase : RoomDatabase(){
    abstract fun categoryDao() : CategoryDAO
}