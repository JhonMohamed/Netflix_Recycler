package com.maidas.netflix.MoviesName

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class MoviesAdapter(val listMovie:List<Movies>):
RecyclerView.Adapter<MoviesViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoviesViewHolder {
        val inflater= LayoutInflater.from(parent.context)
        return MoviesViewHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: MoviesViewHolder, position: Int)
    {
        val movie=listMovie[position]
        holder.data(movie)
    }

    override fun getItemCount(): Int {
        return listMovie.size
    }
}