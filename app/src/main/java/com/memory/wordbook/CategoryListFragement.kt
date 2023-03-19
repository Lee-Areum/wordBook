package com.memory.wordbook

import android.os.Bundle
import android.view.View
import androidx.navigation.Navigation
import com.memory.wordbook.base.BaseFragment
import com.memory.wordbook.databinding.FragmentCategoryListFragementBinding

class CategoryListFragement : BaseFragment<FragmentCategoryListFragementBinding>(
    FragmentCategoryListFragementBinding::inflate
) {
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.apply {
            toMemorize.setOnClickListener {
                categoryListToMemorize()
            }
        }
    }

    private fun categoryListToMemorize(){
        Navigation.findNavController(requireView()).navigate(R.id.action_categoryListFragement_to_memorizeFragment)
    }
}