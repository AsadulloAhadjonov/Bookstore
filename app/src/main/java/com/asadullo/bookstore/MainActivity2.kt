package com.asadullo.bookstore

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.GravityCompat
import androidx.navigation.findNavController
import androidx.navigation.ui.AppBarConfiguration
import androidx.navigation.ui.navigateUp
import androidx.navigation.ui.setupActionBarWithNavController
import androidx.navigation.ui.setupWithNavController
import com.asadullo.bookstore.databinding.ActivityMain2Binding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationView

class MainActivity2 : AppCompatActivity() {
    private lateinit var appBarConfigurationNavView: AppBarConfiguration
    private lateinit var appBarConfigurationBottomNav: AppBarConfiguration
    private val binding by lazy { ActivityMain2Binding.inflate(layoutInflater) }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        setSupportActionBar(binding.toolbar)  // ActionBar ni Toolbar bilan o'rnatish

        val navView: NavigationView = binding.navView
        val bottomNavigationView: BottomNavigationView = binding.bottomNavigation

        val navController = findNavController(R.id.nav_host_fragment_content_main)

        val fragmentSet = setOf(
            R.id.booksFragment, R.id.authorsFragment, R.id.worldFragment,
            R.id.uzbekFragment, R.id.downloadingFragment, R.id.aboutBookFragment
        )

        appBarConfigurationNavView = AppBarConfiguration(fragmentSet)

        setupActionBarWithNavController(navController, binding.drawerLayout)
        navView.setupWithNavController(navController)

        bottomNavigationView.setupWithNavController(navController)

        binding.menu.setOnClickListener {
            binding.drawerLayout.openDrawer(GravityCompat.START)
        }

        binding.search.setOnClickListener {
            Toast.makeText(this, "${binding.edtSearch.text}", Toast.LENGTH_SHORT).show()
        }
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = findNavController(R.id.nav_host_fragment_content_main)
        return navController.navigateUp(appBarConfigurationNavView) || super.onSupportNavigateUp()
    }
}
