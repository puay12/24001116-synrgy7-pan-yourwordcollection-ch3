package com.example.yourwordcollection.navigationcomponent.fragment.main.adapter

import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.data.Word

interface AlphabetAdapterListener {
    fun onClickAlphabet(data:Array<Word>)
}