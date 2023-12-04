package com.ceduc.comm

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class drone : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_drone)



        val ss = findViewById<Button>(R.id.carrito9)
        ss.setOnClickListener {
            val intencion = Intent(this, Carrito::class.java)
            startActivity(intencion)
        }
    }
}