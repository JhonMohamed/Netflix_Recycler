package com.maidas.netflix.user

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.maidas.netflix.R

class UserActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_users)

        val recyclerView =findViewById<RecyclerView>(R.id.recyclerUser)

        val userList= arrayListOf(
            User(R.drawable.img_avatar_ntx,"Jhon"),
            User(R.drawable.img_avatar_ntx,"Wilson"),
            User(R.drawable.img_avatar_ntx,"Maidas"),
            User(R.drawable.img_avatar_ntx,"Juany"),
            User(R.drawable.img_avatar_ntx,"Brisa")
        )
        val adapter= UserAdapter(userList)
        recyclerView.adapter=adapter
        recyclerView.layoutManager=GridLayoutManager(this,2)
    }
}