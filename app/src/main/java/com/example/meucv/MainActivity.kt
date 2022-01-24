package com.example.meucv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Switch
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.meucv.cv.CvFragment
import com.example.meucv.home.HomeFragment
import com.example.meucv.portifolio.PortifolioFragment
import com.example.meucv.sidemenu.CallBack
import com.example.meucv.sidemenu.MenuAdapter
import com.example.meucv.sidemenu.MenuItem
import com.example.meucv.sidemenu.MenuUtil
import com.example.meucv.team.TeamFragment


class MainActivity : AppCompatActivity() , CallBack{

    lateinit var menuRv : RecyclerView
    lateinit var menuItems: List<MenuItem>
    lateinit var adapter: MenuAdapter
    var  selectedMenuPos : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        supportActionBar?.hide()

        //Menu
        setupSideMenu()

        setHomeFragment()

    }

    fun setupSideMenu() {
        menuRv = findViewById(R.id.rv_side_menu)
        menuItems = MenuUtil.MenuList().getList().toList()
         adapter   = MenuAdapter(menuItems,this)
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

    override fun onSideMenuItemClick(int: Int) {

        when(menuItems.get(int).code){
            MenuUtil.companio.HOME_FRAGMENT_CODE -> setHomeFragment()
            MenuUtil.companio.CV_FRAGMENT_CODE -> setCVFragment()
            MenuUtil.companio.PORTIFOLIO_FRAGMENT_CODE -> setPortifolioFragment()
            MenuUtil.companio.TEAM_FRAGMENT_CODE -> setTeamFragment()
            else -> setHomeFragment()
        }
        menuItems.get(selectedMenuPos).isSelected = false
        menuItems.get(int).isSelected = true
        selectedMenuPos = int
        adapter.notifyDataSetChanged()
    }
}





