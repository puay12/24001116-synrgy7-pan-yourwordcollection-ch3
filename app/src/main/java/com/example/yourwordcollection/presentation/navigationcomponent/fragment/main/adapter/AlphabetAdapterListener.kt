package com.example.yourwordcollection.presentation.navigationcomponent.fragment.main.adapter

import com.example.yourwordcollection.data.model.Word

interface AlphabetAdapterListener {
    fun onClickAlphabet(data:Array<Word>)
}