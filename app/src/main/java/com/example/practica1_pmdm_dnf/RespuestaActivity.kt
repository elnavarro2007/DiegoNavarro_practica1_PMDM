package com.example.practica1_pmdm_dnf

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.practica1_pmdm_dnf.databinding.ActivityLoginBinding
import com.example.practica1_pmdm_dnf.databinding.ActivityResultadoBinding
import com.example.practica1_pmdm_dnf.databinding.ActivityTestBinding

class RespuestaActivity : AppCompatActivity() {

    private lateinit var binding : ActivityResultadoBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityResultadoBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val correcto = intent.getBooleanExtra("correcto", false)

        if (correcto){
            var aciertos = 0
            aciertos++
            binding.imageView2.setImageResource(R.drawable.acierto)
            binding.textoRespuestaAnswer.setText("has acertado")

            binding.textoRespuestaAnswer.setText(" llevas :\n" +
                    ""+aciertos + " aciertos")


        }else {
            binding.imageView2.setImageResource(R.drawable.fallo)
            binding.textoRespuestaAnswer.setText("has fallado")



        }

        binding.button.setOnClickListener {


            finish()
        }
    }
}