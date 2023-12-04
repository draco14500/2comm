package com.ceduc.comm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class computadora : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_computadora)

        val ff = findViewById<Button>(R.id.carrito7)
        ff.setOnClickListener {
            val intencion = Intent(this, Carrito::class.java)
            startActivity(intencion)
        }
    }
}