package com.asadullo.bookstore.Retrofit

import com.asadullo.bookstore.Models.Books
import retrofit2.Call
import retrofit2.http.GET

interface Service {
    @GET("plan")
    fun get(): Call<List<Books>>
}