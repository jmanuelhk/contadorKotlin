package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast

private var total: Int = 0

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun sumar(){
            total++
        }

        fun restar(){
            total--
        }

        // se creo una variable para el texto que se encuentra en el centro de la
        // pantalla ya que esta debemos de asignarle el valor de inicio que este es
        // el cero
        val Contador : TextView = findViewById<TextView>(R.id.textoContador)
        Contador.text = "0"

        //En esta seccion creamos una varible para el boton SUMAR
        //esto nos va a permitir que interactuemos con los componentes
        // de la aplicacion.
        val btnSumar : Button = findViewById(R.id.botonSumar)
        btnSumar.setOnClickListener {
            Toast.makeText(this@MainActivity, "a sumado", Toast.LENGTH_SHORT).show()
            //sumar()
            //Contador.text = total.toString()
        }

        //En esta seccion creamos una varible para el boton Restar
        //esto nos va a permitir que interactuemos con los componentes
        // de la aplicacion.
        val btnRestar : Button = findViewById(R.id.botonRestar)
        btnRestar.setOnClickListener {
            Toast.makeText(this@MainActivity, "a restado ", Toast.LENGTH_SHORT).show()
            restar()
            Contador.text = total.toString()
        }
    }
}