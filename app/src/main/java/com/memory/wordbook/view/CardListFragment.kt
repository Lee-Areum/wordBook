package com.memory.wordbook.view

import android.os.Bundle
import android.view.View
import com.memory.wordbook.view.base.BaseFragment
import com.memory.wordbook.databinding.FragmentCardListBinding

class CardListFragment : BaseFragment<FragmentCardListBinding>(
    FragmentCardListBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
        }
    }
}