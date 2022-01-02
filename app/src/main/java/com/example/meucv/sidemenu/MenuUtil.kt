package com.example.meucv.sidemenu

import com.example.meucv.sidemenu.MenuUtil.companio.Companion.CV_FRAGMENT_CODE
import com.example.meucv.sidemenu.MenuUtil.companio.Companion.HOME_FRAGMENT_CODE
import com.example.meucv.sidemenu.MenuUtil.companio.Companion.PORTIFOLIO_FRAGMENT_CODE
import com.example.meucv.sidemenu.MenuUtil.companio.Companion.TEAM_FRAGMENT_CODE


class MenuUtil() {

    class companio{
        companion object {
            const val HOME_FRAGMENT_CODE = 0
            const val CV_FRAGMENT_CODE = 1
            const val PORTIFOLIO_FRAGMENT_CODE = 2
            const val TEAM_FRAGMENT_CODE = 3

        }
    }
    class  MenuList() {
        fun getList() : MutableList<MenuItem>{
            val list: MutableList<MenuItem> = mutableListOf()
            list.add(MenuItem(com.example.meucv.R.drawable.ic_baseline_home_24, HOME_FRAGMENT_CODE,true))
            list.add(MenuItem(com.example.meucv.R.drawable.ic_baseline_school_24, CV_FRAGMENT_CODE,false))
            list.add(MenuItem(com.example.meucv.R.drawable.ic_baseline_library_books_24, TEAM_FRAGMENT_CODE,false))
            list.add(MenuItem(com.example.meucv.R.drawable.ic_baseline_dashboard_24, PORTIFOLIO_FRAGMENT_CODE,false))

            return list
        }

    }

}

