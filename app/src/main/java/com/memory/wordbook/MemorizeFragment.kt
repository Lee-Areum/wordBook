package com.memory.wordbook

import android.os.Bundle
import android.view.View
import com.memory.wordbook.base.BaseFragment
import com.memory.wordbook.databinding.FragmentMemorizeBinding

class MemorizeFragment : BaseFragment<FragmentMemorizeBinding>(
    FragmentMemorizeBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {

        }
    }

}