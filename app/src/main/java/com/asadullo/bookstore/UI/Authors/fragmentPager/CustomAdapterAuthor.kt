package com.asadullo.bookstore.UI.Authors.fragmentPager

import android.os.Bundle
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class CustomAdapterAuthor(fragment: FragmentManager, private val list: List<String>) : FragmentPagerAdapter(fragment) {
    override fun getCount(): Int {
        return list.size
    }

    override fun getItem(position: Int): Fragment {
        return FragmentCustomAuthors().apply {
            arguments = Bundle().apply {
                putInt("key_authors", position)
            }
        }
    }

    private val fragmentList = mutableListOf<Fragment>()
    private val fragmentTitleList = mutableListOf<String>()

    fun addFragment(fragment: Fragment, title: String) {
        fragmentList.add(fragment)
        fragmentTitleList.add(title)
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return fragmentTitleList[position]
    }

}