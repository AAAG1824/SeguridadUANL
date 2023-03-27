package com.example.seguridaduanl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class InicioSeguridad : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_seguridad)
        val ir_Historial: Button = findViewById(R.id.historial)
        ir_Historial.setOnClickListener {
            val his: Intent = Intent(this, Historial::class.java)
            startActivity(his)
        }
    }
}