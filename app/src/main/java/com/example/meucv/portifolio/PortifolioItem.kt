package com.example.meucv.portifolio

import java.io.Serializable

class PortifolioItem : Serializable {
     var img: Int? = null
     var title: String? = null
     var description: String? = null

    constructor(img: Int?, title: String?, description: String?) {
        this.img = img
        this.title = title
        this.description = description
    }

}