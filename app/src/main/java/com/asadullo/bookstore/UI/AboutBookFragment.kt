package com.asadullo.bookstore.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.asadullo.bookstore.Models.Books
import com.asadullo.bookstore.R
import com.asadullo.bookstore.databinding.FragmentAboutBookBinding
import com.squareup.picasso.Picasso

class AboutBookFragment : Fragment() {

    private val binding by lazy { FragmentAboutBookBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val img_link = arguments?.getSerializable("img_link") as Books

        Picasso.get().load(img_link.img_link).error(R.drawable.x).into(binding.bookImage)
        binding.bookName.text = img_link.book_name
        binding.bookAuthorName.text = img_link.author_name
        binding.bookAbout.text = img_link.book_about

        return binding.root
    }
}