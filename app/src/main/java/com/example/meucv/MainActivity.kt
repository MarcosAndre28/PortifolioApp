package com.example.meucv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.meucv.cv.CvFragment
import com.example.meucv.home.HomeFragment
import com.example.meucv.portifolio.PortifolioFragment
import com.example.meucv.sidemenu.MenuAdapter
import com.example.meucv.sidemenu.MenuItem
import com.example.meucv.sidemenu.MenuUtil
import com.example.meucv.team.TeamFragment

class MainActivity : AppCompatActivity() {

    lateinit var menuRv : RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        //Menu
        setupSideMenu()






        setPortifolioFragment()
        //setCVFragment()
        //setHomeFragment()
       /// setTeamFragment()

    }

    fun setupSideMenu() {
        menuRv = findViewById(R.id.rv_side_menu)
        val menuItems : List<MenuItem>
        menuItems = MenuUtil.MenuList().getList().toList()
        val adapter  : MenuAdapter = MenuAdapter(menuItems)
        menuRv.setLayoutManager( LinearLayoutManager(this))
        menuRv.setAdapter(adapter)
    }


    fun setPortifolioFragment(){
        supportFragmentManager.beginTransaction().replace(R.id.container,PortifolioFragment()).commit()
    }
    fun setTeamFragment(){
        supportFragmentManager.beginTransaction().replace(R.id.container,TeamFragment()).commit()
    }
    fun setCVFragment(){
       supportFragmentManager.beginTransaction().replace(R.id.container,CvFragment()).commit()
    }
    fun setHomeFragment(){
        supportFragmentManager.beginTransaction().replace(R.id.container,HomeFragment()).commit()
    }
}

