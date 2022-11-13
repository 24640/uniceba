package com.example.menu_lateral

import android.content.res.Configuration
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.PersistableBundle
import android.view.MenuItem
import android.widget.Toast
import androidx.appcompat.app.ActionBarDrawerToggle
import androidx.appcompat.widget.Toolbar
import androidx.core.view.GravityCompat
import androidx.drawerlayout.widget.DrawerLayout
import com.example.menu_lateral.databinding.ActivityMainBinding
import com.google.android.material.navigation.NavigationView


class MainActivity : AppCompatActivity(), NavigationView.OnNavigationItemSelectedListener {
    private lateinit var drawer: DrawerLayout
    private lateinit var toggle: ActionBarDrawerToggle

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)


        binding = ActivityMainBinding.inflate(layoutInflater)
        val view = binding.root
        setContentView(view)

        val toolbar: Toolbar = findViewById(R.id.toolbar_main)
        setSupportActionBar(toolbar)

        drawer= findViewById(R.id.drawer_layout)
        toggle= ActionBarDrawerToggle(this,drawer, toolbar, R.string.navigation_drawer_open,R.string.navigation_drawer_close)

        drawer.addDrawerListener(toggle)
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
        supportActionBar?.setHomeButtonEnabled(true)

        binding.navView.setNavigationItemSelectedListener(this)

    }

    override fun onNavigationItemSelected(item: MenuItem): Boolean {



        when(item.itemId){
            R.id.item1 ->{
        Toast.makeText(this, "hola1", Toast.LENGTH_SHORT).show()
                val  transactions = supportFragmentManager.beginTransaction()
                val fragmented = info_Aalumnos()
                transactions.replace(R.id.contenedordefragmentos,fragmented)

                transactions.commit()
            }
            R.id.item2 ->{
        Toast.makeText(this, "hola2", Toast.LENGTH_SHORT).show()
                val  transactions = supportFragmentManager.beginTransaction()
                val fragmented = prueba()
                transactions.replace(R.id.contenedordefragmentos,fragmented)

                transactions.commit()
            }


        }

        drawer.closeDrawer(GravityCompat.START)
        return true
    }

    override fun onPostCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        super.onPostCreate(savedInstanceState, persistentState)
        toggle.syncState()
    }

    override fun onConfigurationChanged(newConfig: Configuration) {
        super.onConfigurationChanged(newConfig)
        toggle.onConfigurationChanged(newConfig)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if (toggle.onOptionsItemSelected(item)){
            return true
        }
        return super.onOptionsItemSelected(item)
    }


}