package com.example.meucv.cv

import android.widget.TextView

class CVItem {

    var title: String? = null
     var description: String? = null


    constructor(){

    }

    constructor(title: String?, description: String) {
        this.title = title
        this.description = description
    }


}