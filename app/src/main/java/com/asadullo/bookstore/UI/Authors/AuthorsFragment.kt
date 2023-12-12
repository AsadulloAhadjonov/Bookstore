package com.asadullo.bookstore.UI.Authors

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.asadullo.bookstore.UI.Authors.fragmentPager.CustomAdapterAuthor
import com.asadullo.bookstore.UI.Authors.fragmentPager.FragmentCustomAuthors
import com.asadullo.bookstore.databinding.FragmentAuthorsBinding

class AuthorsFragment : Fragment() {
    private val binding by lazy { FragmentAuthorsBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val item = arrayListOf<String>(
            "O'zbek adiblar",
            "Jahon adiblari"
        )

        val customAdapter = CustomAdapterAuthor(childFragmentManager,item)
        customAdapter.addFragment(FragmentCustomAuthors(), "O'zbek adiblar")
        customAdapter.addFragment(FragmentCustomAuthors(), "Jahon adiblar")
        binding.myViewPagerAuthors.adapter= customAdapter


        binding.tableLayoutAuthors.setupWithViewPager(binding.myViewPagerAuthors)

        return binding.root
    }


}