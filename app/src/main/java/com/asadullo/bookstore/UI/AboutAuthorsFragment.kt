package com.asadullo.bookstore.UI

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.asadullo.bookstore.Models.Authors
import com.asadullo.bookstore.UI.AdapterViewPager
import com.asadullo.bookstore.databinding.FragmentAboutAuthorsBinding

class AboutAuthorsFragment : Fragment() {
    private val binding by lazy { FragmentAboutAuthorsBinding.inflate(layoutInflater) }
    private lateinit var adapterViewPager: AdapterViewPager
    private lateinit var arrayList: ArrayList<Authors>
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        load()
        adapterViewPager = AdapterViewPager(arrayList)
        binding.viewPager.adapter = adapterViewPager

        return binding.root
    }

    fun load(){
        arrayList = ArrayList()
        arrayList.add(Authors("https://cdn.pixabay.com/photo/2015/04/23/22/00/tree-736885_1280.jpg", "Dunyoning ishlari"))
        arrayList.add(Authors("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTYOrBblqRsySBBKa4ZiT6UWEXq4D_UgQ7ibiUIzXtL&s", "Xamsa"))
        arrayList.add(Authors("https://media.istockphoto.com/id/1146517111/photo/taj-mahal-mausoleum-in-agra.jpg?s=612x612&w=0&k=20&c=vcIjhwUrNyjoKbGbAQ5sOcEzDUgOfCsm9ySmJ8gNeRk=", "Salom"))
        arrayList.add(Authors("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcQ3o-4GCcROl4MjYjWS76bqF1adLnoxFtnKFmlz8KCX&s", "Besh bolali yigitcha"))
        arrayList.add(Authors("https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTgH7UpbEFAJw2tMHfBK0z6c_KsgoYhJaBuvUI7Av_F&s", "Choliqushi"))
        arrayList.add(Authors("https://images.unsplash.com/photo-1575936123452-b67c3203c357?ixlib=rb-4.0.3&ixid=M3wxMjA3fDB8MHxzZWFyY2h8Mnx8aW1hZ2V8ZW58MHx8MHx8fDA%3D&w=1000&q=80", "Boburnoma"))
    }

}