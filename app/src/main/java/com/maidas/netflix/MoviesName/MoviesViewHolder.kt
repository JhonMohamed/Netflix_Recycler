package com.maidas.netflix.MoviesName

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.maidas.netflix.R

class MoviesViewHolder(inflater: LayoutInflater,parent: ViewGroup):
RecyclerView.ViewHolder(inflater.inflate(R.layout.item_buscar_peli,parent,false))
{
    private var ivMovie: ImageView=
        itemView.findViewById(R.id.ivMovie)
    private var tvmovie: TextView=
        itemView.findViewById(R.id.tvMovie)

    fun data(movies: Movies){
        ivMovie.setImageResource(movies.imagen)
        tvmovie.text=movies.nombre

    }

}