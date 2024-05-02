package com.example.yourwordcollection.viewmodel.wordlist

import android.os.Build
import android.os.Bundle
import androidx.annotation.RequiresApi
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.example.yourwordcollection.navigationcomponent.fragment.main.model.Alphabet
import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.model.Word


class WordlistNavigationViewModel : ViewModel() {
    private val liveWordlistData: MutableLiveData<List<Word>> = MutableLiveData()

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    fun getWordList(arguments: Bundle) : LiveData<List<Word>>? {
        loadData(arguments)
        return liveWordlistData
    }

    @RequiresApi(Build.VERSION_CODES.TIRAMISU)
    private fun loadData(arguments: Bundle) {
        liveWordlistData.value = arguments.getParcelableArray("wordList", Word::class.java)?.toList()
    }
}