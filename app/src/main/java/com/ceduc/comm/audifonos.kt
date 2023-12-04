package com.ceduc.comm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class audifonos : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_audifonos)


        val ss = findViewById<Button>(R.id.carrito5)
        ss.setOnClickListener {
            val intencion = Intent(this, Carrito::class.java)
            startActivity(intencion)
        }
    }
}