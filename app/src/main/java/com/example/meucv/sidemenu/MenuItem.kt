package com.example.meucv.sidemenu

class MenuItem {

     var icon: Int? = null
     var code: Int? = null
     var isSelected: Boolean? = null

    constructor(icon: Int?, code: Int?, isSelected: Boolean?) {
        this.icon = icon
        this.code = code
        this.isSelected = isSelected
    }


}