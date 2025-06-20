package com.maidas.netflix.NextCard

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.maidas.netflix.R
import java.util.zip.Inflater


class profileViewHolder(inflater: LayoutInflater,parent: ViewGroup):
RecyclerView.ViewHolder(inflater.inflate(R.layout.item_profilemore,parent,false)){

    private var imagen: ImageView=
        itemView.findViewById(R.id.ivProfile)
    private var nombre: TextView=
        itemView.findViewById(R.id.tvProfile)

    fun data(profile: Profile){
        imagen.setImageResource(profile.Imagen)
        nombre.text=profile.Nombre
    }
}