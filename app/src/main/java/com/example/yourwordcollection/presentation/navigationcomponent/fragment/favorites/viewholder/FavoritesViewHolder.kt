package com.example.yourwordcollection.presentation.navigationcomponent.fragment.favorites.viewholder

import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.example.yourwordcollection.data.model.Alphabet
import com.example.yourwordcollection.data.model.Word
import com.example.yourwordcollection.databinding.ItemAlphabetBinding
import com.example.yourwordcollection.databinding.ItemWordFavBinding
import com.example.yourwordcollection.presentation.navigationcomponent.fragment.favorites.adapter.FavoritesAdapterListener
import com.example.yourwordcollection.presentation.navigationcomponent.fragment.main.adapter.AlphabetAdapterListener

class FavoritesViewHolder(
    private val favoritesAdapterListener: FavoritesAdapterListener,
    private val binding: ItemWordFavBinding,
) : RecyclerView.ViewHolder(binding.root) {
    fun render(data: Word) {
        binding.wordText.text = data.name
        binding.wordImage.load(data.imgUrl)
        binding.root.setOnClickListener { favoritesAdapterListener.onClickWord(data.name) }
        binding.removeFromFavBtn.setOnClickListener { favoritesAdapterListener.onClickRemove(data) }
    }
}