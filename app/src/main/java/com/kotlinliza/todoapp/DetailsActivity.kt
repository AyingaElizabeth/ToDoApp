package com.kotlinliza.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        val image=intent.getIntExtra("image",R.drawable.android)
        val name=intent.getStringExtra("activityname")
        val time=intent.getStringExtra("time")
        val des=intent.getStringExtra("des")

        val icon=findViewById<ImageView>(R.id.imageView)
        icon.setImageResource(image)
        val activity=findViewById<TextView>(R.id.activityname)
        activity.text=name
        val Time=findViewById<TextView>(R.id.time)
        Time.text=time
        val description=findViewById<TextView>(R.id.diescription)
        description.text=des

        val addbtn=findViewById<Button>(R.id.floatingActionButton)
        addbtn.setOnClickListener { startActivity(Intent(this,AddMore::class.java)) }
    }}

