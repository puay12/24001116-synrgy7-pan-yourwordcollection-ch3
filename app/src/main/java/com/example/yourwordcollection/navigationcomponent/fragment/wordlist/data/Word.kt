package com.example.yourwordcollection.navigationcomponent.fragment.wordlist.data

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Word(
    val name:String,
    val imgUrl:String
) : Parcelable
