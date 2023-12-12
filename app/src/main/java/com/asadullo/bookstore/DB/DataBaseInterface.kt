package com.asadullo.bookstore.DB

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.asadullo.bookstore.Models.Users

@Dao
interface DataBaseInterface {
    @Insert
    fun add(users: Users)

    @Query("select * from users")
    fun get():List<Users>
}