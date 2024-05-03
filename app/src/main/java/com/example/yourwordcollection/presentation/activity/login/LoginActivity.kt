package com.example.yourwordcollection.presentation.activity.login

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import com.example.yourwordcollection.R
import com.example.yourwordcollection.databinding.ActivityLoginBinding
import com.example.yourwordcollection.presentation.activity.MainActivity
import com.example.yourwordcollection.presentation.navigationcomponent.NavigationComponentActivity
import com.example.yourwordcollection.presentation.viewmodel.login.LoginViewModel
import com.example.yourwordcollection.presentation.viewmodel.wordlist.WordlistNavigationViewModel
import com.google.android.material.snackbar.Snackbar

class LoginActivity : AppCompatActivity() {
    private val binding by lazy { ActivityLoginBinding.inflate(layoutInflater) }
    private val viewModel : LoginViewModel by viewModels<LoginViewModel>() {
        LoginViewModel.provideFactory(this, applicationContext)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            if (binding.usernameInput.text.isNullOrEmpty()) {
                binding.usernameInput.error = "Username harus diisi"
            } else if (binding.passwordInput.text.isNullOrEmpty()) {
                binding.passwordInput.error = "Password harus diisi"
            } else {
                binding.usernameInput.error = null
                binding.passwordInput.error = null

                viewModel.userLogin(
                    username = binding.usernameInput.text.toString(),
                    password = binding.passwordInput.text.toString()
                )
            }
        }

        viewModel.getLoading().observe(this) { isLoading ->
            if (isLoading) {
                binding.flipperLogin.displayedChild = 1
            } else {
                binding.flipperLogin.displayedChild = 0
            }
        }

        viewModel.getSuccess().observe(this) { isSuccess ->
            if (isSuccess) {
                Snackbar.make(
                    binding.root,
                    "Login berhasil!",
                    Snackbar.LENGTH_LONG
                ).show()
//                startActivity(Intent(this, MainActivity::class.java))
                NavigationComponentActivity.startActivity(this)
            }
        }

        viewModel.getError().observe(this) { throwable ->
            Snackbar.make(
                binding.root,
                throwable.message.toString(),
                Snackbar.LENGTH_SHORT
            ).show()
        }
    }
}