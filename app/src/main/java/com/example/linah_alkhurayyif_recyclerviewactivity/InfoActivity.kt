package com.example.linah_alkhurayyif_recyclerviewactivity

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_info.*
import kotlinx.android.synthetic.main.activity_main.*

class InfoActivity : AppCompatActivity() {
    var userinfo = arrayListOf<String>()
    var userinfotitle = arrayListOf<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_info)
       val name = intent.getStringExtra("name")
        val age = intent.getStringExtra("age")
        val num = intent.getStringExtra("num")
        val email = intent.getStringExtra("email")
        userinfo.add(name.toString())
        userinfo.add(age.toString())
        userinfo.add(num.toString())
        userinfo.add(email.toString())
        userinfotitle.add("Name")
        userinfotitle.add("Age")
        userinfotitle.add("Phone Number")
        userinfotitle.add("Email")
        recyclerView.adapter= InfoRV_Adapter(userinfo,userinfotitle)
        recyclerView.layoutManager= LinearLayoutManager(this)
    }
}