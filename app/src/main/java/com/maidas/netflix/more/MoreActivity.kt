package com.maidas.netflix.more

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.maidas.netflix.R

class MoreActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profiles_more)

        val RView=findViewById<RecyclerView>(R.id.rvConfig)

        val listMore=arrayListOf(
            More(R.drawable.ic_info,"Notifications",R.drawable.ic_back),
            More(R.drawable.ic_info,"My List",R.drawable.ic_back),
            More(R.drawable.ic_info,"App Settings",R.drawable.ic_back),
            More(R.drawable.ic_info,"Account",R.drawable.ic_back),
            More(R.drawable.ic_info,"Help",R.drawable.ic_back)
        )
        val adapter= MoreAdapter(listMore)
        RView.adapter=adapter
        RView.layoutManager=GridLayoutManager(this,1)
    }
}