package com.asadullo.bookstore.UI.Profile.Update

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.asadullo.bookstore.R
import com.asadullo.bookstore.databinding.FragmentUpdateBinding

class FragmentUpdate : Fragment() {
    private val binding by lazy { FragmentUpdateBinding.inflate(layoutInflater) }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {



        return binding.root
    }
}