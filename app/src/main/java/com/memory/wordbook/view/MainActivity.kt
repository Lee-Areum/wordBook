package com.memory.wordbook.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.memory.wordbook.DBUtils
import com.memory.wordbook.R
import com.memory.wordbook.database.dto.Category
import com.memory.wordbook.databinding.ActivityMainBinding
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

class MainActivity : AppCompatActivity() {
    private lateinit var binding:ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        binding = ActivityMainBinding.inflate(layoutInflater)
        CoroutineScope(Dispatchers.IO).launch {
            DBUtils.getCategoryDB(applicationContext).insert(
                Category(0, "test")
            )
        }
    }
}