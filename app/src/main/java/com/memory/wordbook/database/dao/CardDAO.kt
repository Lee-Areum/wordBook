package com.memory.wordbook.database.dao

import androidx.room.Dao
import androidx.room.Query
import com.memory.wordbook.database.dto.Card

@Dao
interface CardDAO {
    @Query("SELECT * FROM card")
    fun getAll() : List<Card>


}