package com.example.practica1_pmdm_dnf

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practica1_pmdm_dnf.databinding.ActivityMainBinding
import android.content.Intent

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val usuario = intent.getStringExtra("usuario") ?: "user"


        binding.textoBienvenida.text = "Hola $usuario"



        // actionLiseners

        binding.tarjetacanina.setOnClickListener {
            val intent = Intent(this, EdadCaninaActivity:: class.java)

            startActivity(intent)
        }

        binding.tarjetaSuperheroe.setOnClickListener {
            val intent = Intent (this, SuperHeroActivity :: class.java)
            startActivity(intent)
        }

        binding.tarjetaQuiz.setOnClickListener {
            val intent = Intent(this, QuizActvity :: class.java)
            startActivity(intent)
        }







    }
}