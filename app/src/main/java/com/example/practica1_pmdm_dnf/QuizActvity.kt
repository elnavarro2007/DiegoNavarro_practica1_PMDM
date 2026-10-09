package com.example.practica1_pmdm_dnf

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.practica1_pmdm_dnf.databinding.ActivityDetailBinding
import com.example.practica1_pmdm_dnf.databinding.ActivityLoginBinding
import com.example.practica1_pmdm_dnf.databinding.ActivityTestBinding

class QuizActvity : AppCompatActivity() {

    private lateinit var binding: ActivityTestBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityTestBinding.inflate(layoutInflater)
        setContentView(binding.root)

        var textoProgression = 0
        var indice = 0
        var textoPregunta = listOf(Pregunta("mejor sistema operativo linux","redStar os","AmongOS",1),
            Pregunta("mejor rpg de la historia","secret of mana","dragon quest",2),
            Pregunta("peor consola de la historia","la del colacao","la del lidl",1))

        var preguntaActual = textoPregunta[indice]
        binding.preguntaActual.setText(preguntaActual.pregunta)
        binding.opcion1.setText(preguntaActual.respuesta1)
        binding.opcion2.setText(preguntaActual.respuesta2)




        binding.buttonSiguiente.setOnClickListener {

            var seleccion = binding.radioGroup.checkedRadioButtonId
            var idBoton =0


                if (seleccion !=-1 ){

                    if (preguntaActual.correcto == 1){
                        idBoton = binding.opcion1.id
                    }else{
                        idBoton = binding.opcion2.id
                    }

                    var esCorrecto = (seleccion == idBoton)

                    indice++
                    textoProgression++




                    if (indice < textoPregunta.size){
                        preguntaActual = textoPregunta[indice]

                        binding.preguntaActual.setText(preguntaActual.pregunta)
                        binding.opcion1.setText(preguntaActual.respuesta1)
                        binding.opcion2.setText(preguntaActual.respuesta2)

                        binding.radioGroup.clearCheck()
                    }



                    val intent = Intent(this, RespuestaActivity :: class.java)
                    intent.putExtra("correcto",esCorrecto)

                    startActivity(intent)






                }else{
                    Toast.makeText(this, "Selecciona opcion", Toast.LENGTH_SHORT).show()
                }











        }
    }

}