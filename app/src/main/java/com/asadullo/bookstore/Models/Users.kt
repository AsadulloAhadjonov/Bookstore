package com.asadullo.bookstore.Models

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
class Users {
    @PrimaryKey(autoGenerate = true)
    var id:Int? = null
    var boolean:Boolean? = null


    constructor(boolean: Boolean) {
        this.boolean = boolean
    }

    constructor()
}