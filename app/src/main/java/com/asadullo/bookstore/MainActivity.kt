package com.asadullo.bookstore

import android.annotation.SuppressLint
import androidx.activity.result.contract.ActivityResultContracts
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import com.asadullo.bookstore.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)


        binding.tvSingName.setOnClickListener {
        if (binding.tvSingName.text == "Sign in"){
                binding.edtFirstName.visibility = View.GONE
                binding.edtLastName.visibility = View.GONE
                binding.edtPhone.visibility = View.GONE
                binding.card.visibility = View.GONE

                binding.tvSign.text = "Sign in"
                binding.tvSignText.text = "Do not you have an account?"
                binding.tvSingName.text = "Sign up"
        }else{
                binding.edtFirstName.visibility = View.VISIBLE
                binding.edtLastName.visibility = View.VISIBLE
                binding.edtPhone.visibility = View.VISIBLE
                binding.card.visibility = View.VISIBLE

                binding.tvSign.text = "Sign up"
                binding.tvSignText.text = "Already have an account?"
                binding.tvSingName.text = "Sign in"
            }
        }

        binding.imgProfile.setOnClickListener {
            getImage.launch("image/*")
        }

        binding.imgBack.setOnClickListener {
            startActivity(Intent(this, MainActivity2::class.java))
            finish()
        }
        binding.btnSend.setOnClickListener {
            if (binding.edtPhone.text.toString() == "" && binding.edtEmail.text.toString() == "" && binding.edtFirstName.text.toString() == "" && binding.edtLastName.text.toString() == "" && binding.edtPassword.text.toString() == ""){
                Toast.makeText(this, "Barcha ma'lumotni to'ldiring", Toast.LENGTH_SHORT).show()
            }else{
            startActivity(Intent(this, MainActivity2::class.java))
            finish()
            }
        }
    }

    private val getImage = registerForActivityResult(ActivityResultContracts.GetContent()){
        if (it != null){
            binding.imgProfile.setImageURI(it)
        }
    }
}