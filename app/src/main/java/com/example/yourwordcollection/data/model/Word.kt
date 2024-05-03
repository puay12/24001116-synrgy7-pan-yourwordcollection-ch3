package com.example.yourwordcollection.data.model

import android.os.Parcelable
import com.example.yourwordcollection.domain.entities.WordEntity
import kotlinx.parcelize.Parcelize

@Parcelize
data class Word(
    val id: Int? = null,
    val name:String,
    val imgUrl:String
) : Parcelable
