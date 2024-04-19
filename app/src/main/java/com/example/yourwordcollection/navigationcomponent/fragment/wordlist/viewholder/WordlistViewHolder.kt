package com.example.yourwordcollection.navigationcomponent.fragment.wordlist.viewholder

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.yourwordcollection.databinding.ItemWordBinding
import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.adapter.WordlistAdapterListener
import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.data.Word

class WordlistViewHolder(
    private val wordlistAdapterListener: WordlistAdapterListener,
    private val binding: ItemWordBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun render(data: Word) {
        binding.wordText.text = data.name
        binding.wordImage.load(data.imgUrl)
        binding.root.setOnClickListener { wordlistAdapterListener.onClickWord(data.name) }
    }
}