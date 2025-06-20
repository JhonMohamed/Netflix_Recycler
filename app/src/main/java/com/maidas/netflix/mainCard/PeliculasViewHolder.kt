package com.maidas.netflix.mainCard

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.maidas.netflix.R

class PeliculasViewHolder(inflater: LayoutInflater, parent: ViewGroup) :
RecyclerView.ViewHolder(inflater.inflate(R.layout.item_netflix_maincard,parent,false)){

    private var movie1: ImageView=
        itemView.findViewById(R.id.ivFirstMovie)

    fun data(peliculas: Peliculas){
        movie1.setImageResource(peliculas.image)
    }
}