package com.asadullo.bookstore.UI.Download

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.asadullo.bookstore.UI.Download.Adapter.Adapter
import com.asadullo.bookstore.Models.Downloads
import com.asadullo.bookstore.databinding.FragmentDownloadingBinding

class DownloadingFragment : Fragment() {
    private val binding by lazy { FragmentDownloadingBinding.inflate(layoutInflater) }
    private lateinit var adapter: Adapter
    private lateinit var list: ArrayList<Downloads>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        list = ArrayList()
        load()
        adapter = Adapter(list)
        binding.rv.adapter = adapter

        return binding.root
    }

    fun load(){
        list.add(Downloads("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg", "DUNYONING ISHLARI"))
    }

}