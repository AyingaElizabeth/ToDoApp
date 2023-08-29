package com.kotlinliza.todoapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kotlinliza.todoapp.data.ActivityAdapter
import com.kotlinliza.todoapp.data.ActivityModel
import com.kotlinliza.todoapp.data.ActivityStatus

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val list=ArrayList<ActivityModel>()
        list.add(ActivityModel(R.drawable.android,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.android,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.android,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.android,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.android,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.android,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.android,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.android,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.android,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.android,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))


        val activityAdapter= ActivityAdapter(this,list)
        val recyclerView=findViewById<RecyclerView>(R.id.Recyclerview)

        recyclerView.adapter=activityAdapter
        recyclerView.layoutManager=LinearLayoutManager(this)
    }
}