package com.example.yourwordcollection.presentation.navigationcomponent.fragment.wordlist.viewholder

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.yourwordcollection.R
import com.example.yourwordcollection.databinding.ItemWordBinding
import com.example.yourwordcollection.presentation.navigationcomponent.fragment.wordlist.adapter.WordlistAdapterListener
import com.example.yourwordcollection.data.model.Word
import com.example.yourwordcollection.presentation.viewmodel.wordlist.WordlistNavigationViewModel

class WordlistViewHolder(
    private val wordlistAdapterListener: WordlistAdapterListener,
    private val binding: ItemWordBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun render(data: Word) {
        binding.wordText.text = data.name
        binding.wordImage.load(data.imgUrl)
        binding.root.setOnClickListener { wordlistAdapterListener.onClickWord(data.name) }
        binding.addToFavBtn.setOnClickListener {
            wordlistAdapterListener.onClickFavorite(data)
        }
    }
}