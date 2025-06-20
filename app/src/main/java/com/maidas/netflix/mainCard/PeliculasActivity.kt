package com.maidas.netflix.mainCard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.maidas.netflix.R
import com.maidas.netflix.SecondCard.Series
import com.maidas.netflix.SecondCard.SeriesAdapter

class PeliculasActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maincard)

        val recyclerV =findViewById<RecyclerView>(R.id.reciclerMovie)
        val rv2 = findViewById<RecyclerView>(R.id.rvSecondMovie)
        val rv3=findViewById<RecyclerView>(R.id.rvthirty)

        var movieList= arrayListOf(
            Peliculas(R.drawable.img_piky),
            Peliculas(R.drawable.img_blackclover),
            Peliculas(R.drawable.img_black2),
            Peliculas(R.drawable.img_piky),
            Peliculas(R.drawable.img_piky)
        )
        val lista2 = arrayListOf(
            Peliculas(R.drawable.img_black2),
            Peliculas(R.drawable.img_black2),
            Peliculas(R.drawable.img_black2),
            Peliculas(R.drawable.img_black2),
            Peliculas(R.drawable.img_black2)
        )
        val lista3=arrayListOf(
            Peliculas(R.drawable.img_black3),
            Peliculas(R.drawable.img_black3),
            Peliculas(R.drawable.img_black3),
            Peliculas(R.drawable.img_black3),
            Peliculas(R.drawable.img_black3)
        )

        val adapter= PeliculasAdapter(movieList)
        val adapter2= PeliculasAdapter(lista2)
        val adapter3= PeliculasAdapter(lista3)

        recyclerV.adapter=adapter
        rv2.adapter = adapter2
        rv3.adapter = adapter3

        rv2.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rv3.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        recyclerV.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
    }
    }