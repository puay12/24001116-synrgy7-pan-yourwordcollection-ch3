package com.example.yourwordcollection.navigationcomponent.fragment.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.yourwordcollection.databinding.ItemAlphabetBinding
import com.example.yourwordcollection.navigationcomponent.fragment.main.data.Alphabet
import com.example.yourwordcollection.navigationcomponent.fragment.main.viewholder.AlphabetViewHolder

class AlphabetAdapter(
        private val alphabetAdapterListener: AlphabetAdapterListener,
) : ListAdapter<Alphabet, AlphabetViewHolder>(AlphabetDiffUtil()) {

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): AlphabetViewHolder {
                return AlphabetViewHolder(
                        binding = ItemAlphabetBinding.inflate(
                                LayoutInflater.from(parent.context),
                                parent,
                                false
                        ),
                        alphabetAdapterListener = alphabetAdapterListener
                )
        }

        override fun getItemCount(): Int {
                return currentList.size
        }

        override fun onBindViewHolder(holder: AlphabetViewHolder, position: Int) {
                holder.bind(getItem(position))
        }
}