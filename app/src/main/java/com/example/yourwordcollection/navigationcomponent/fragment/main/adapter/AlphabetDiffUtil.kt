package com.example.yourwordcollection.navigationcomponent.fragment.main.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.yourwordcollection.navigationcomponent.fragment.main.data.Alphabet

class AlphabetDiffUtil : DiffUtil.ItemCallback<Alphabet>() {
    override fun areItemsTheSame(oldItem: Alphabet, newItem: Alphabet): Boolean {
        return oldItem.name == newItem.name
    }
    override fun areContentsTheSame(oldItem: Alphabet, newItem: Alphabet): Boolean {
        return oldItem.hashCode() == newItem.hashCode()
    }
}