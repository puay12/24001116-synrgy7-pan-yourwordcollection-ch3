package com.example.yourwordcollection.activity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.yourwordcollection.R
import com.example.yourwordcollection.navigationcomponent.NavigationComponentActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        supportActionBar?.hide()
        setContentView(R.layout.activity_main)
        Log.i("somethin1", "INSIDE")
        NavigationComponentActivity.startActivity(this)
    }
}