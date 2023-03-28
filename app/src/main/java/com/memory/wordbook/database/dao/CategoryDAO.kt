package com.memory.wordbook.database.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.memory.wordbook.database.dto.Category

@Dao
interface CategoryDAO {
    @Query("SELECT * FROM category")
    fun getAll() : List<Category>

    @Insert
    fun insert(category: Category)
}