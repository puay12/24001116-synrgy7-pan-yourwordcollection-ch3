package com.example.yourwordcollection.navigationcomponent.fragment.wordlist.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.yourwordcollection.databinding.ItemWordBinding
import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.data.Word
import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.viewholder.WordlistViewHolder

class WordlistAdapter(
    private val wordlistAdapterListener: WordlistAdapterListener,
) : ListAdapter<Word, WordlistViewHolder>(WordlistDiffUtil()) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WordlistViewHolder {
        return WordlistViewHolder(
            binding = ItemWordBinding.inflate(
                LayoutInflater.from(parent.context),
                parent,
                false
            ),
            wordlistAdapterListener = wordlistAdapterListener
        )
    }

    override fun getItemCount(): Int {
        return currentList.size
    }

    override fun onBindViewHolder(holder: WordlistViewHolder, position: Int) {
        holder.render(getItem(position))
    }
}