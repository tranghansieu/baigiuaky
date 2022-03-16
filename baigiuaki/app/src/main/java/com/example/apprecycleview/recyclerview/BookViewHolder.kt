package com.example.apprecycleview.recyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.apprecycleview.databinding.ItemBookBinding

class BookViewHolder private constructor(
    private val binding: ItemBookBinding
) : RecyclerView.ViewHolder(binding.root) {

    companion object {
        fun from(parent: ViewGroup): BookViewHolder {
            val binding = ItemBookBinding.inflate(LayoutInflater.from(parent.context), parent, false)
            return BookViewHolder(binding)
        }
    }

    fun bind(music: Book) {
        binding.music.text = music.name
        binding.des.text = music.descrip
    }
}