package com.example.meucv.team

import android.widget.ImageView

class TeamItem {
     var name: String? = null
     var desc: String? = null
     var img: Int? = null




    constructor(name: String?,desc: String?, img: Int?) {
        this.name = name
        this.desc = desc
        this.img = img
    }

    constructor(){

    }

}