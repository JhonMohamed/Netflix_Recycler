package com.maidas.netflix.more

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MoreAdapter(var listMore: List<More>):
RecyclerView.Adapter<MoreViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MoreViewHolder {
        var inflater= LayoutInflater.from(parent.context)
        return MoreViewHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: MoreViewHolder, position: Int) {
        var mora=listMore[position]
        holder.data(mora)
    }

    override fun getItemCount(): Int {
       return listMore.size
    }
}