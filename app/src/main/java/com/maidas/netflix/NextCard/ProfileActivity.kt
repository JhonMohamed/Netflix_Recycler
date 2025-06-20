package com.maidas.netflix.NextCard

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.maidas.netflix.R
import com.maidas.netflix.more.More
import com.maidas.netflix.more.MoreAdapter

class ProfileActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_profiles_more)

        val recycler=findViewById<RecyclerView>(R.id.rvProfilesMore)
        val RView=findViewById<RecyclerView>(R.id.rvConfig)

        val profileList=arrayListOf(
            Profile(R.drawable.img_avatar_ntx,"JHON"),
            Profile(R.drawable.img_avatar_ntx,"Maidas"),
            Profile(R.drawable.img_avatar_ntx,"Wilson"),
            Profile(R.drawable.img_avatar_ntx,"Kira"),
            Profile(R.drawable.img_avatar_ntx,"Ikarizz")
        )
        val listMore=arrayListOf(
            More(R.drawable.ic_info,"Notifications",R.drawable.ic_back),
            More(R.drawable.ic_info,"My List",R.drawable.ic_back),
            More(R.drawable.ic_info,"App Settings",R.drawable.ic_back),
            More(R.drawable.ic_info,"Account",R.drawable.ic_back),
            More(R.drawable.ic_info,"Help",R.drawable.ic_back)
        )
        val adapter2= MoreAdapter(listMore)
        RView.adapter=adapter2
        RView.layoutManager=GridLayoutManager(this,1)
        val adapter= ProfileAdapter(profileList)
        recycler.adapter=adapter
        recycler.layoutManager=GridLayoutManager(this,5)
    }
}