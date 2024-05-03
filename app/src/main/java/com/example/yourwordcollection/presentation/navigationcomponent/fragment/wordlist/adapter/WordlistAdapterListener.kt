package com.example.yourwordcollection.presentation.navigationcomponent.fragment.wordlist.adapter

import com.example.yourwordcollection.data.model.Word

interface WordlistAdapterListener {
    fun onClickWord(data: String)
    fun onClickFavorite(data: Word)
}