package com.asadullo.bookstore.UI.Profile

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.asadullo.bookstore.R
import com.asadullo.bookstore.databinding.FragmentProfileBinding

class ProfileFragment : Fragment() {
    private val binding by lazy{ FragmentProfileBinding.inflate(layoutInflater)}
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        binding.switch1.setOnCheckedChangeListener { a, b ->
            if (b){
                binding.switch1.text = "Nightmode"
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_YES)
            }else{
                binding.switch1.text = "Lightmode"
                AppCompatDelegate.setDefaultNightMode(AppCompatDelegate.MODE_NIGHT_NO)
            }
        }

        binding.btnUpdate.setOnClickListener{
            findNavController().navigate(R.id.fragmentUpdate)
        }

        return binding.root
    }


}