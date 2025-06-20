package com.maidas.netflix.NextCard

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ProfileAdapter(val listProfile: List<Profile>):
RecyclerView.Adapter<profileViewHolder>(){
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): profileViewHolder {
     val inflater= LayoutInflater.from(parent.context)
        return profileViewHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: profileViewHolder, position: Int)
    {
       val profile=listProfile[position]
        holder.data(profile)
    }

    override fun getItemCount(): Int {
       return listProfile.size
    }

}