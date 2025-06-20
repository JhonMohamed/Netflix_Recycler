package com.maidas.netflix.MoviesName

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.maidas.netflix.R

class MoviesActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movie)

        val r1=findViewById<RecyclerView>(R.id.rvBuscarMovie)

        val listMovies=arrayListOf(
            Movies(R.drawable.img_evangelion,"Evangelion"),
            Movies(R.drawable.img_fmab,"Full Metal Achemist Brotherhood"),
            Movies(R.drawable.img_tokyorevengers,"Tokyo Revenger"),
            Movies(R.drawable.img_naruto,"Naruto"),
            Movies(R.drawable.img_evangelion,"Evangelion"),
            Movies(R.drawable.img_fmab,"Full Metal Achemist Brotherhood"),
            Movies(R.drawable.img_tokyorevengers,"Tokyo Revenger"),
            Movies(R.drawable.img_naruto,"Naruto"),
            Movies(R.drawable.img_evangelion,"Evangelion"),
            Movies(R.drawable.img_fmab,"Full Metal Achemist Brotherhood"),
            Movies(R.drawable.img_tokyorevengers,"Tokyo Revenger"),
            Movies(R.drawable.img_naruto,"Naruto")
        )
        val adapter= MoviesAdapter(listMovies)
        r1.adapter=adapter
        r1.layoutManager=GridLayoutManager(this,1)
    }
}