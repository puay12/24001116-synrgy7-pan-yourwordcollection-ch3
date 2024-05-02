package com.example.yourwordcollection.navigationcomponent.fragment.main.adapter

import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.model.Word

interface AlphabetAdapterListener {
    fun onClickAlphabet(data:Array<Word>)
}