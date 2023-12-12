package com.asadullo.bookstore.UI.book

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.asadullo.bookstore.UI.book.fragmentPager.CustomAdapter
import com.asadullo.bookstore.UI.book.fragmentPager.FragmentCustom
import com.asadullo.bookstore.databinding.FragmentBooksBinding


class BooksFragment : Fragment() {

    private val binding by lazy { FragmentBooksBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val item = arrayListOf<String>(
            "Barcha kitoblar",
            "She'r",
            "Asar",
            "Ertak",
            "Roman"
        )

        val customAdapter = CustomAdapter(childFragmentManager,item)
        customAdapter.addFragment(FragmentCustom(),"Barcha kitoblar")
        customAdapter.addFragment(FragmentCustom(),"She'r")
        customAdapter.addFragment(FragmentCustom(),"Asar")
        customAdapter.addFragment(FragmentCustom(),"Ertak")
        customAdapter.addFragment(FragmentCustom(),"Roman")
        binding.myViewPager.adapter= customAdapter


        binding.tableLayout.setupWithViewPager(binding.myViewPager)

    }



}