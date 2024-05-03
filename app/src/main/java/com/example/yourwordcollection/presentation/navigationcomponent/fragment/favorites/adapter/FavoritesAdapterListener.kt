package com.example.yourwordcollection.presentation.navigationcomponent.fragment.favorites.adapter

import com.example.yourwordcollection.data.model.Word

interface FavoritesAdapterListener {
    fun onClickWord(data: String)
    fun onClickRemove(data: Word)
}