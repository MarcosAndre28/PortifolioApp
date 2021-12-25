package com.example.meucv

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.meucv.cv.CvFragment
import com.example.meucv.home.HomeFragment

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.hide()
        setCVFragment()
       // setHomeFragment()

    }
    fun setCVFragment(){
       supportFragmentManager.beginTransaction().replace(R.id.container,CvFragment()).commit()
    }
    fun setHomeFragment(){
        supportFragmentManager.beginTransaction().replace(R.id.container,HomeFragment()).commit()
    }
}