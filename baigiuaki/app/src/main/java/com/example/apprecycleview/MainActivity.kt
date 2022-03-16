package com.example.apprecycleview

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.apprecycleview.databinding.ActivityMainBinding
import com.example.apprecycleview.recyclerview.Book
import com.example.apprecycleview.recyclerview.bookAdapter

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.listBook.run {
            layoutManager = LinearLayoutManager(this@MainActivity)
            setHasFixedSize(true)

            adapter = bookAdapter(Book)

        }
        binding.fabAdd.setOnClickListener {
            val intent = Intent(this@MainActivity, AddActivity::class.java)
            startActivity(intent)
        }
    }
    override fun onResume() {
        super.onResume()
        // binding.listMusics.adapter = MusicAdapter(Musics)
        binding.listBook.adapter?.notifyDataSetChanged()
    }
    companion object {
        val Book = mutableListOf<Book>()
    }
}
