package com.maidas.netflix.SecondCard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class SeriesAdapter(val listserie: List<Series>):
    RecyclerView.Adapter<SeriesViewHolder>()
{
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): SeriesViewHolder {
        val inflater= LayoutInflater.from(parent.context)
        return SeriesViewHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: SeriesViewHolder, position: Int
    ) {
        val serie=listserie[position]
        holder.data(serie)
    }

    override fun getItemCount(): Int {
        return listserie.size
    }

}