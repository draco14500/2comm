package com.ceduc.comm

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class vr : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_vr)




        val ss = findViewById<Button>(R.id.carrito1)
        ss.setOnClickListener {
            val intencion = Intent(this, Carrito::class.java)
            startActivity(intencion)
        }
    }
}