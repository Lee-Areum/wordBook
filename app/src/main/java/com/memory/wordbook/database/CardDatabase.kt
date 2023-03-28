package com.memory.wordbook.database

import androidx.room.Database
import androidx.room.RoomDatabase
import com.memory.wordbook.database.dao.CardDAO
import com.memory.wordbook.database.dto.Card

@Database(entities = [Card::class], version = 1)
abstract class CardDatabase : RoomDatabase(){
    abstract fun cardDao() : CardDAO
}