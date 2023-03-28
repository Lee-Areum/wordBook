package com.memory.wordbook.view

import android.os.Bundle
import android.view.View
import com.memory.wordbook.DBUtils
import com.memory.wordbook.view.base.BaseFragment
import com.memory.wordbook.databinding.FragmentMemorizeBinding
import kotlinx.coroutines.*

class MemorizeFragment : BaseFragment<FragmentMemorizeBinding>(
    FragmentMemorizeBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        CoroutineScope(Dispatchers.IO).launch {
            val cardlist = async(Dispatchers.IO){
                DBUtils.getCategoryDB(requireContext()).getAll()
            }
            launch(Dispatchers.Main) {
                binding.tvMemorize.text = cardlist.await().toString()
            }
        }
        binding.apply {
        }
    }

}