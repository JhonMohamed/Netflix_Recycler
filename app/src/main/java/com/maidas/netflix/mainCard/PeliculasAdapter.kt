package com.maidas.netflix.mainCard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class PeliculasAdapter(val listmovie: List<Peliculas>):
RecyclerView.Adapter<PeliculasViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PeliculasViewHolder
    {
        val inflater= LayoutInflater.from(parent.context)
        return PeliculasViewHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: PeliculasViewHolder, position: Int)
    {
       val movie=listmovie[position]
        holder.data(movie)
    }

    override fun getItemCount(): Int
    {
        return listmovie.size
    }
}