package com.example.yourwordcollection.presentation.navigationcomponent.fragment.favorites.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.yourwordcollection.data.model.Word

class FavoritesDiffUtil : DiffUtil.ItemCallback<Word>() {
    override fun areItemsTheSame(oldItem: Word, newItem: Word): Boolean {
        return oldItem.name == newItem.name
    }
    override fun areContentsTheSame(oldItem: Word, newItem: Word): Boolean {
        return oldItem.hashCode() == newItem.hashCode()
    }
}