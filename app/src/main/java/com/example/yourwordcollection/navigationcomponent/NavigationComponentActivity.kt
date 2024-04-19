package com.example.yourwordcollection.navigationcomponent

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.navigation.fragment.NavHostFragment
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.yourwordcollection.R
import com.example.yourwordcollection.databinding.ActivityNavigationComponentBinding

class NavigationComponentActivity : AppCompatActivity() {
    companion object {
        fun startActivity(context: Context) {
            context.startActivity(Intent(context, NavigationComponentActivity::class.java))
        }
    }

    private val binding by lazy { ActivityNavigationComponentBinding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.i("somethin", "MASUK")
        setContentView(binding.root)
        setupNavigationComponentWithAppbar()
    }

    override fun onSupportNavigateUp(): Boolean {
        val host: NavHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        return host.navController.navigateUp() || super.onSupportNavigateUp()
    }

    private fun setupNavigationComponentWithAppbar() {
        val host:NavHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container)
                as NavHostFragment? ?: return
        setupActionBarWithNavController(host.navController)
    }
}