package com.example.yourwordcollection.presentation.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.yourwordcollection.R
import com.example.yourwordcollection.presentation.navigationcomponent.NavigationComponentActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NavigationComponentActivity.startActivity(this)
    }
}