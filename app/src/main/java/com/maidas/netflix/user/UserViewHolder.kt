package com.maidas.netflix.user

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.maidas.netflix.R

class UserViewHolder(inflater: LayoutInflater,parent: ViewGroup):
RecyclerView.ViewHolder(inflater.inflate(R.layout.item_netflix_user,parent,false))
{


    private var ivAvatar: ImageView=
        itemView.findViewById(R.id.ivUser)

    private var tvname: TextView=
        itemView.findViewById(R.id.tvNameUser)

    fun data(user: User){
        tvname.text=user.nombre
        ivAvatar.setImageResource(user.imagen)

    }
}