package com.example.yourwordcollection.presentation.navigationcomponent.fragment.main.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.ListAdapter
import com.example.yourwordcollection.databinding.ItemAlphabetBinding
import com.example.yourwordcollection.data.model.Alphabet
import com.example.yourwordcollection.presentation.navigationcomponent.fragment.main.viewholder.AlphabetViewHolder

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
                holder.render(getItem(position))
        }
}