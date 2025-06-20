package com.maidas.netflix.SecondCard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.maidas.netflix.R

class SeriesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_maincard)

      val recyclerView =findViewById<RecyclerView>(R.id.rvSecondMovie)

        var serieList= arrayListOf(
            Series(R.drawable.img_black3),
            Series(R.drawable.img_black3),
            Series(R.drawable.img_black3),
            Series(R.drawable.img_black3),
            Series(R.drawable.img_black3)
        )
        val adapter2= SeriesAdapter(serieList)
        recyclerView.adapter=adapter2
        recyclerView.layoutManager= LinearLayoutManager(this,LinearLayoutManager.HORIZONTAL,false)
    }
}