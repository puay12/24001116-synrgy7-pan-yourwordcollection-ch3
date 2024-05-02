package com.example.yourwordcollection.navigationcomponent.fragment.main.logic

import android.os.Bundle
import com.example.yourwordcollection.navigationcomponent.fragment.wordlist.model.Word

class MainNavigationLogic {
    fun putBundle(data: Array<Word>) : Bundle {
        val bundle = Bundle()
        bundle.putParcelableArray("wordList", data)

        return bundle
    }
}