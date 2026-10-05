package com.example.practica1_pmdm_dnf

import android.os.Bundle
import android.widget.RatingBar
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.example.practica1_pmdm_dnf.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {
    private lateinit var binding: ActivityDetailBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_detail)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // recibir los datos

        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val bundle = intent.extras!!
        val superHeroName = bundle.getString("Nombre SuperHeroe") ?: "No hay nombre"
        val alter_ego = bundle.getString("Alter ego") ?: "No hay alter"
        val bio = bundle.getString("Biografia") ?: "No hay bio"
        val poder = bundle.getFloat("poder") ?: "No hay estrellas"

        // pintar los campos con los valores recibidos

        binding.textView.text = superHeroName
        binding.textView2.text = alter_ego
        binding.textView5.text = bio
        binding.ratingBar3.rating = poder as Float


    }
}