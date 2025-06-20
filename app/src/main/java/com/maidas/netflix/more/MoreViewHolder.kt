package com.maidas.netflix.more

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.maidas.netflix.R

class MoreViewHolder(inflater: LayoutInflater,parent: ViewGroup):
RecyclerView.ViewHolder(inflater.inflate(R.layout.item_more,parent,false)){
    private var FirstImagen: ImageView=
        itemView.findViewById(R.id.iv1)
    private var scondImagen: ImageView=
        itemView.findViewById(R.id.iv2)
    private var textN: TextView=
        itemView.findViewById(R.id.tvText)

    fun data(more: More){
        FirstImagen.setImageResource(more.image1)
        scondImagen.setImageResource(more.image2)
        textN.text=more.texto
    }
}