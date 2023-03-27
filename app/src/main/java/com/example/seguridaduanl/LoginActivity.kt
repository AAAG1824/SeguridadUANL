package com.example.seguridaduanl

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        val iniciar:Button = findViewById(R.id.btn_start)
        iniciar.setOnClickListener {
            val user = findViewById<EditText>(R.id.usuario)
            val verificar = user.text.toString()
            if (verificar == "1866566") {
                val intent: Intent = Intent(this, InicioUsuario::class.java)
                startActivity(intent)
            } else {
                val intent: Intent = Intent(this, InicioSeguridad::class.java)
                startActivity(intent)
            }
        }
    }
}