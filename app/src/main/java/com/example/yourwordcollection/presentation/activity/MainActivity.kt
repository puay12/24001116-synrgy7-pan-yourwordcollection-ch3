package com.example.yourwordcollection.presentation.activity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.viewModels
import com.example.yourwordcollection.R
import com.example.yourwordcollection.presentation.activity.login.LoginActivity
import com.example.yourwordcollection.presentation.navigationcomponent.NavigationComponentActivity
import com.example.yourwordcollection.presentation.viewmodel.navigator.NavigatorMainViewModel

class MainActivity : AppCompatActivity() {
    private val viewModel by viewModels<NavigatorMainViewModel> {
        NavigatorMainViewModel.provideFactory(this, this)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (viewModel.checkUser()) {
            NavigationComponentActivity.startActivity(this)
        } else {
            startActivity(Intent(this, LoginActivity::class.java))
        }
    }
}