package com.example.yourwordcollection.presentation.navigationcomponent.fragment.wordlist.logic

class WordlistNavigationLogic {
    fun getGoogleUrl(keyword: String) : String {
        return "https://www.google.com/search?q=${keyword} adalah"
    }
}