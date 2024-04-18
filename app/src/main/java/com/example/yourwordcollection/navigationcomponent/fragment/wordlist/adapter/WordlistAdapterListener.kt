package com.example.yourwordcollection.navigationcomponent.fragment.wordlist.adapter

import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.data.Word

interface WordlistAdapterListener {
    fun onClickWord(data: String)
}