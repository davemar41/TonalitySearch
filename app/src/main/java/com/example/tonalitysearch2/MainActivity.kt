package com.example.tonalitysearch2

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.tonalitysearch2.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val bind= ActivityMainBinding.inflate(layoutInflater)
        setContentView(bind.root)
        bind.boton1.setOnClickListener {
            val intent= Intent(this,Calculador::class.java)
            startActivity(intent)
        }
        bind.boton3.setOnClickListener {
            val intent2= Intent(this,Basedatos::class.java)
            startActivity(intent2)
        }
        bind.boton2.setOnClickListener {
            val intent3= Intent(this,Metronomo::class.java)
            startActivity(intent3)
        }
    }
}