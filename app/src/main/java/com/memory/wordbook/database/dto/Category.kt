package com.memory.wordbook.database.dto

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Category (
    @PrimaryKey val categoryid: Int,
    @ColumnInfo(name = "category_name") val categoryName : String,
)