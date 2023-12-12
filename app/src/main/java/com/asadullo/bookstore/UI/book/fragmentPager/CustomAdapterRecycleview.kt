package com.asadullo.bookstore.UI.book.fragmentPager

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.asadullo.bookstore.Models.Books
import com.asadullo.bookstore.R
import com.asadullo.bookstore.databinding.ItemListAuthorsBinding
import com.squareup.picasso.Picasso

class CustomAdapterRecycleview(val list: List<Books>):RecyclerView.Adapter<CustomAdapterRecycleview.MyViewHolder>() {
    private var recyclerView: RecycleViewListener? = null
    inner class MyViewHolder(val binding: ItemListAuthorsBinding): RecyclerView.ViewHolder(binding.root) {
        fun bind(book: Books) {
            Picasso.get().
            load(book.img_link)
                .resize(150, 150)
                .error(android.R.drawable.stat_notify_error)
                .centerCrop().into(binding.imageView)

            binding.tvBookName.text = book.book_name
            binding.tvAuthorName.text = book.author_name

            binding.root.setOnClickListener {
                recyclerView?.onItemClicked(adapterPosition, book)
            }
        }
    }

    fun recyclerView(listener: RecycleViewListener){
        recyclerView = listener
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val itemView= LayoutInflater.from(parent.context).inflate(R.layout.item_list,parent,false)
        return MyViewHolder(ItemListAuthorsBinding.bind(itemView))

    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(list[position])
    }
}