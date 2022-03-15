package com.example.buttonclickbackhome


import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast


class NewActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_new)

        supportActionBar!!.setDisplayHomeAsUpEnabled(true)
        supportActionBar!!.setTitle("This is New Activity")

        val btnBack = findViewById<Button>(R.id.btnBack)
        btnBack.setOnClickListener {
            val bIntent = Intent(this, MainActivity::class.java)
            startActivity(bIntent)
            Toast.makeText(this, "Back home", Toast.LENGTH_SHORT).show()
        }

        }

        override fun onSupportNavigateUp(): Boolean {
            onBackPressed()
            return super.onSupportNavigateUp()
        }

}