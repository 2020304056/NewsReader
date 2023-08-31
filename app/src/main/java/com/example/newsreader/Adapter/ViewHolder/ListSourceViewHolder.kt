package com.example.newsreader.Adapter.ViewHolder

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.example.newsreader.Interface.ItemClickListener

class ListSourceViewHolder(itemView: View):RecyclerView.ViewHolder(itemView), View.OnClickListener {

    private lateinit var itemClickListener:ItemClickListener

    var source_title = itemView.source_news_name

    fun setItemClickListener(itemClickListener: ItemClickListener)
    {
        this.itemClickListener = itemClickListener
    }

    override fun onClick(v: View?) {
        itemClickListener.onClick((v!!,adapterPosition))
    }

}