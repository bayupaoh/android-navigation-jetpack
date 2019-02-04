package com.suitmedia.bayunavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    var appBarConfiguration : AppBarConfiguration ?= null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolBar)

        setSupportActionBar(toolBar)
        appBarConfiguration = AppBarConfiguration(navOverMainActivity.findNavController().graph, drawer_layout)
        setupActionBarWithNavController(navOverMainActivity.findNavController(), appBarConfiguration!!)

        bottomNavMainActivity.setupWithNavController(navOverMainActivity.findNavController())
        navigation_view.setupWithNavController(navOverMainActivity.findNavController())
    }

    override fun onSupportNavigateUp(): Boolean {
        return navOverMainActivity.findNavController().navigateUp(appBarConfiguration!!) || super.onSupportNavigateUp()
    }

}
