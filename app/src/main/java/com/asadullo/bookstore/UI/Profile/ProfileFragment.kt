package com.asadullo.bookstore.UI.Profile

import android.content.SharedPreferences
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.app.AppCompatDelegate
import androidx.fragment.app.Fragment
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

        return binding.root
    }


}