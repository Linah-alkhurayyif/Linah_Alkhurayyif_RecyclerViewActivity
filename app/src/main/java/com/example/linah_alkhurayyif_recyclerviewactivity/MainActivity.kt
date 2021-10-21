package com.example.linah_alkhurayyif_recyclerviewactivity

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        submitbtn.setOnClickListener {
            val myIntent = Intent(this, InfoActivity::class.java)
            myIntent.putExtra("name", name_et.text.toString())
            myIntent.putExtra("age", age_et.text.toString())
            myIntent.putExtra("num", num_et.text.toString())
            myIntent.putExtra("email", email_et.text.toString())
            startActivity(myIntent)
        }
    }
}