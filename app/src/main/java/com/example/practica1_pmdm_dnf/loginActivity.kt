package com.example.practica1_pmdm_dnf

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.practica1_pmdm_dnf.databinding.ActivityLoginBinding
import com.example.practica1_pmdm_dnf.databinding.ActivityMainBinding

class loginActivity : AppCompatActivity() {


    private lateinit var binding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.buttonLogin.setOnClickListener {
            val user = binding.textLogin.text.toString()
            val contrasenia = binding.textLogin.text.toString().trim()

            if(user.isNotEmpty() && contrasenia.isNotEmpty()){
                val intent = Intent(this, MainActivity:: class.java)

                intent.putExtra("usuario",user)

                startActivity(intent)
            }else{
                Toast.makeText(this, "Rellena todos los campos", Toast.LENGTH_SHORT).show()
            }


        }


    }


}