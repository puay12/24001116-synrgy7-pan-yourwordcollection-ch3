package com.example.yourwordcollection.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.yourwordcollection.R
import com.example.yourwordcollection.navigationcomponent.NavigationComponentActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        NavigationComponentActivity.startActivity(this)
    }
}