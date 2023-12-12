package com.asadullo.bookstore.UI.Download.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asadullo.bookstore.Models.Downloads
import com.asadullo.bookstore.databinding.ItemRvBinding
import com.squareup.picasso.Picasso

class Adapter(var list: ArrayList<Downloads>) : RecyclerView.Adapter<Adapter.Vh>() {
    inner class Vh(var item: ItemRvBinding) : RecyclerView.ViewHolder(item.root) {
        fun onBind(downloads: Downloads) {
            Picasso.get().load(downloads.img_link).into(item.imgBookItem)
            item.bookNameItem.text = downloads.book_name
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): Vh {
        return Vh(ItemRvBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int = list.size

    override fun onBindViewHolder(holder: Vh, position: Int) {
        holder.onBind(list[position])
    }

}