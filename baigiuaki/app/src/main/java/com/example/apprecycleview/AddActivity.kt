package com.example.apprecycleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.apprecycleview.databinding.ActivityAddBinding
import com.example.apprecycleview.recyclerview.Book

class AddActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        lateinit var binding: ActivityAddBinding
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_add)

        binding = ActivityAddBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.save.setOnClickListener {
            val name = binding.edtName.text.toString()
            val descrip = binding.edtSinger.text.toString()

            val book = Book(name, descrip)

            MainActivity.Book.add(book)


            finish()
        }
    }
}