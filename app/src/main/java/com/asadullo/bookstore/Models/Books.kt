package com.asadullo.bookstore.Models

import java.io.Serializable

class Books:Serializable {
    var img_link:String? = null
    var book_name:String? = null
    var author_name:String?= null
    var book_about:String? = null
    var audio:String? = null
    var pdf:String? = null

    constructor(
        img_link: String?,
        book_name: String?,
        author_name: String?,
        book_about: String?,
        audio: String?,
        pdf: String?
    ) {
        this.img_link = img_link
        this.book_name = book_name
        this.author_name = author_name
        this.book_about = book_about
        this.audio = audio
        this.pdf = pdf
    }

    constructor()
    constructor(img_link: String?, book_name: String?, author_name: String?, book_about: String?) {
        this.img_link = img_link
        this.book_name = book_name
        this.author_name = author_name
        this.book_about = book_about
    }
}