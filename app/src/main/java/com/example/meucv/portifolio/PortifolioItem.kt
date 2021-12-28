package com.example.meucv.portifolio

class PortifolioItem {
     var img: Int? = null
     var title: String? = null
     var description: String? = null

    constructor(){

    }

    constructor(img: Int?, title: String?) {
         this.img = img
         this.title = title
    }

    constructor(img: Int?, title: String?, description: String?) {
        this.img = img
        this.title = title
        this.description = description
    }




}