package com.ceduc.comm

import android.content.Context
import android.content.Intent
import android.database.sqlite.SQLiteDatabase
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageButton
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    class MainActivity : AppCompatActivity() {
        private lateinit var db: SQLiteDB

        override fun onCreate(savedInstanceState: Bundle?) {
            super.onCreate(savedInstanceState)
            setContentView(R.layout.activity_main)


            val ingrese = findViewById<ImageButton>(R.id.drone)
            ingrese.setOnClickListener {
                val intencion = Intent(this, drone::class.java)
                startActivity(intencion)
            }
            val trafere = findViewById<ImageButton>(R.id.computadora)
            trafere.setOnClickListener {
                val intencion = Intent(this, computadora::class.java)
                startActivity(intencion)
            }

            val ff = findViewById<ImageButton>(R.id.audifonos)
            ff.setOnClickListener {
                val intencion = Intent(this, audifonos::class.java)
                startActivity(intencion)
            }
            val rr = findViewById<ImageButton>(R.id.vr)
            rr.setOnClickListener {
                val intencion = Intent(this, vr::class.java)
                startActivity(intencion)
            }
            val ss = findViewById<Button>(R.id.carrito)
            ss.setOnClickListener {
                val intencion = Intent(this, Carrito::class.java)
                startActivity(intencion)
            }
        }

    }
}