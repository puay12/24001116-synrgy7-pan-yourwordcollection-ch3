package com.example.yourwordcollection.presentation.navigationcomponent

import android.content.Context
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.navigation.findNavController
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
        setContentView(binding.root)
        setupNavigationComponentWithAppbar()
        supportActionBar?.title = "Your Word Collection"
    }

    override fun onSupportNavigateUp(): Boolean {
        val host: NavHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container) as NavHostFragment
        return host.navController.navigateUp() || super.onSupportNavigateUp()
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.menu_main, menu)
        return true
    }

//    private fun onFavoriteAction(item: MenuItem) {
//
//    }

    private fun setupNavigationComponentWithAppbar() {
        val host:NavHostFragment = supportFragmentManager.findFragmentById(R.id.nav_host_fragment_container)
                as NavHostFragment? ?: return
        setupActionBarWithNavController(host.navController)
    }
}