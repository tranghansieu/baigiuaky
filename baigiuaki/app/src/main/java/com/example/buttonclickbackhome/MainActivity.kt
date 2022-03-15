package com.example.buttonclickbackhome

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnHome = findViewById<Button>(R.id.btnHome)
        btnHome.setOnClickListener {
            val bIntent = Intent(this, NewActivity::class.java)
            startActivity(bIntent)
            Toast.makeText(this, "New activity", Toast.LENGTH_SHORT).show()

        }
    }
}