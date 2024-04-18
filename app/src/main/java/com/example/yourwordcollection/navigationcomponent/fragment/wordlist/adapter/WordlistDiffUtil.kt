package com.example.yourwordcollection.navigationcomponent.fragment.wordlist.adapter

import androidx.recyclerview.widget.DiffUtil
import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.data.Word

class WordlistDiffUtil : DiffUtil.ItemCallback<Word>() {
    override fun areItemsTheSame(oldItem: Word, newItem: Word): Boolean {
        return oldItem.name == newItem.name
    }

    override fun areContentsTheSame(oldItem: Word, newItem: Word): Boolean {
        return oldItem.hashCode() == newItem.hashCode()
    }
}