package com.example.meucv.portifolio

class PortifolioItem {
    private var img: Int? = null
    private var title: String? = null
    private var description: String? = null

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