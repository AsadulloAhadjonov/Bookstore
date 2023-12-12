package com.asadullo.bookstore.UI.book.fragmentPager

import com.asadullo.bookstore.Models.Books

interface RecycleViewListener{
    fun onItemClicked(position: Int, book: Books)
}