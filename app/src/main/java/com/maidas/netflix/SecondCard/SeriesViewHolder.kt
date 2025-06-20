package com.maidas.netflix.SecondCard

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import androidx.recyclerview.widget.RecyclerView
import com.maidas.netflix.R

class SeriesViewHolder(inflater: LayoutInflater,parent: ViewGroup):
RecyclerView.ViewHolder(inflater.inflate(R.layout.item_card,parent,false))
{
    private var Secondmovie1: ImageView=
        itemView.findViewById(R.id.ivSecondMovie)

    fun data(series: Series){
        Secondmovie1.setImageResource(series.images)
    }
}