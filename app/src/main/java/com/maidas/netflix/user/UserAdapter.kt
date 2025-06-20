package com.maidas.netflix.user

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class UserAdapter(val listuser: List<User>):
RecyclerView.Adapter<UserViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UserViewHolder {
        val inflater= LayoutInflater.from(parent.context)
        return UserViewHolder(inflater,parent)
    }

    override fun onBindViewHolder(holder: UserViewHolder, position: Int)
    {
       val user=listuser[position]
        holder.data(user)
    }

    override fun getItemCount(): Int {
        return listuser.size
    }

}