package com.example.apprecycleview.recyclerview

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class bookAdapter(  private val listBoos: List<Book>
) : RecyclerView.Adapter<BookViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = BookViewHolder.from(parent)

    override fun onBindViewHolder(holder: BookViewHolder, position: Int) {
        holder.bind(listBoos[position])
    }

    override fun getItemCount() = listBoos.size
}