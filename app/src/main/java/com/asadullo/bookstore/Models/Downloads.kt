package com.asadullo.bookstore.Models

class Downloads {
    var img_link:String? = null
    var book_name:String? = null

    constructor(img_link: String?, book_name: String?) {
        this.img_link = img_link
        this.book_name = book_name
    }

    constructor()
}