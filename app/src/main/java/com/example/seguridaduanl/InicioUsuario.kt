package com.example.seguridaduanl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class InicioUsuario : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_inicio_usuario)
        val reporte_Realizado: Button = findViewById(R.id.reporte_instantaneo)
        reporte_Realizado.setOnClickListener {
            val intent: Intent = Intent(this, Reporte_Realizado::class.java)
            startActivity(intent)
        }
        val reporte_Detallado: Button = findViewById(R.id.reporte_detallado)
        reporte_Detallado.setOnClickListener {
            val ir: Intent = Intent(this, ReporteDetallado::class.java)
            startActivity(ir)
        }
        val ir_Historial: Button = findViewById(R.id.historial)
        ir_Historial.setOnClickListener {
            val his: Intent = Intent(this, Historial::class.java)
            startActivity(his)
        }

    }
}