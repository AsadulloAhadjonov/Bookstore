package com.asadullo.bookstore.UI

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asadullo.bookstore.Models.Authors
import com.asadullo.bookstore.databinding.ItemRvBinding
import com.squareup.picasso.Picasso

class AdapterViewPager(var list: ArrayList<Authors>) : RecyclerView.Adapter<AdapterViewPager.Vh>() {
    inner class Vh(var item: ItemRvBinding) : RecyclerView.ViewHolder(item.root) {
        fun onBind(user: Authors) {
            Picasso.get().load(user.img_link).into(item.imgBookItem)
            item.bookNameItem.text = user.book_name
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