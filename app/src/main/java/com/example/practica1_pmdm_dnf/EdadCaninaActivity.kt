package com.example.practica1_pmdm_dnf

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class EdadCaninaActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_edadcanina)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        // Aqui la pantalla esta creada

        // 1 - Tomamos el control de todos los elementos de la parte de la UI
        val resultTExt = findViewById<TextView>(R.id.textoRespuesta)
        val calcularBoton = findViewById<Button>(R.id.boton)
        val ageEdit = findViewById<EditText>(R.id.edad)

        // 2 los botones tienen la propiedad setOnCLickable al pulsarlo
        calcularBoton.setOnClickListener {
            // meter lo que quermeos que haga el boton cuando lo pulsemos
            val edadString = ageEdit.text.toString()

            if (edadString.isEmpty()){
                val mensaje =  Toast.makeText(this, "Introduce la edad",
                    Toast.LENGTH_LONG)
                mensaje.show()
            }else{
                val edadInt = edadString.toInt()
                val edadPerro = edadInt * 7
                resultTExt.text = getString(    R.string.hola, edadPerro)


            }



        }
    }
}