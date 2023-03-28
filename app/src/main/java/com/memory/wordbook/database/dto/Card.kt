package com.memory.wordbook.database.dto

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Card (
    @PrimaryKey val cardid: Int,
    @ColumnInfo(name = "category_id") val categoryID : Int,
    @ColumnInfo(name = "card_front_main") val cardFrontMain : String,
    @ColumnInfo(name = "card_back_main") val cardBackMain : String,
    @ColumnInfo(name = "card_back_sub") val cardBackSub : String?,
    @ColumnInfo(name = "is_favorite") val isFavorite : Boolean = false,
    @ColumnInfo(name = "memory_cnt") val memoryCnt : Int = 0,
)