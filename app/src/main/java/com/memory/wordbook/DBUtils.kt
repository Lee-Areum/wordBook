package com.memory.wordbook

import android.content.Context
import androidx.room.Room
import com.memory.wordbook.database.CardDatabase
import com.memory.wordbook.database.CategoryDatabase
import com.memory.wordbook.database.dao.CardDAO
import com.memory.wordbook.database.dao.CategoryDAO

class DBUtils() {
    companion object{
        private var cardDB : CardDAO? = null
        private var categoryDB : CategoryDAO? = null

        fun getCardDB(_context: Context): CardDAO{
            return cardDB ?: synchronized(this){
                cardDB ?: Room.databaseBuilder(_context,CardDatabase::class.java, "card").build().cardDao()
            }
        }
        fun getCategoryDB(context: Context): CategoryDAO{
            return categoryDB ?: synchronized(this){
                categoryDB ?: Room.databaseBuilder(context,CategoryDatabase::class.java, "category").build().categoryDao()
            }
        }
    }
}