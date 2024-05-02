package com.example.yourwordcollection.navigationcomponent.fragment.main.viewholder

import androidx.recyclerview.widget.RecyclerView
import com.example.yourwordcollection.databinding.ItemAlphabetBinding
import com.example.yourwordcollection.navigationcomponent.fragment.main.adapter.AlphabetAdapterListener
import com.example.yourwordcollection.navigationcomponent.fragment.main.model.Alphabet

class AlphabetViewHolder(
    private val alphabetAdapterListener: AlphabetAdapterListener,
    private val binding: ItemAlphabetBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun render(data: Alphabet) {
        binding.alphabetText.text = data.name
        binding.root.setOnClickListener { alphabetAdapterListener.onClickAlphabet(data.wordLists!!) }
    }
}