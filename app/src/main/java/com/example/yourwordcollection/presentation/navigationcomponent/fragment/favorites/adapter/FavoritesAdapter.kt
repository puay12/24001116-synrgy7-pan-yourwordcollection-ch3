package com.example.yourwordcollection.presentation.navigationcomponent.fragment.favorites.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.yourwordcollection.data.model.Alphabet
import com.example.yourwordcollection.data.model.Word
import com.example.yourwordcollection.databinding.ItemAlphabetBinding
import com.example.yourwordcollection.databinding.ItemWordFavBinding
import com.example.yourwordcollection.presentation.navigationcomponent.fragment.favorites.viewholder.FavoritesViewHolder
import com.example.yourwordcollection.presentation.navigationcomponent.fragment.main.adapter.AlphabetAdapterListener
import com.example.yourwordcollection.presentation.navigationcomponent.fragment.main.adapter.AlphabetDiffUtil
import com.example.yourwordcollection.presentation.navigationcomponent.fragment.main.viewholder.AlphabetViewHolder

class FavoritesAdapter(
    private val favoritesAdapterListener: FavoritesAdapterListener,
) : ListAdapter<Word, FavoritesViewHolder>(FavoritesDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): FavoritesViewHolder {
        return FavoritesViewHolder(
            binding = ItemWordFavBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            favoritesAdapterListener = favoritesAdapterListener
        )
    }

    override fun getItemCount(): Int {
        return currentList.size
    }

    override fun onBindViewHolder(holder: FavoritesViewHolder, position: Int) {
        holder.render(getItem(position))
    }
}