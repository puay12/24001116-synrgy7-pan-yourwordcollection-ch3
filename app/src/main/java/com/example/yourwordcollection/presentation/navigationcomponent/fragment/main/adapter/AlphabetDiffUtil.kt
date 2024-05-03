package com.example.yourwordcollection.presentation.navigationcomponent.fragment.main.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.yourwordcollection.data.model.Alphabet

class AlphabetDiffUtil : DiffUtil.ItemCallback<Alphabet>() {
    override fun areItemsTheSame(oldItem: Alphabet, newItem: Alphabet): Boolean {
        return oldItem.name == newItem.name
    }
    override fun areContentsTheSame(oldItem: Alphabet, newItem: Alphabet): Boolean {
        return oldItem.hashCode() == newItem.hashCode()
    }
}