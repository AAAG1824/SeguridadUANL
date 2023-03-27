package com.example.seguridaduanl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class ReporteDetallado : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_reporte_detallado)
        val reporte_Realizado: Button = findViewById(R.id.generar_reporte)
        reporte_Realizado.setOnClickListener {
            val intent: Intent = Intent(this, Reporte_Realizado::class.java)
            startActivity(intent)
        }
    }
}