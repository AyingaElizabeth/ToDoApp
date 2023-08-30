package com.kotlinliza.todoapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.kotlinliza.todoapp.data.ActivityAdapter
import com.kotlinliza.todoapp.data.ActivityModel
import com.kotlinliza.todoapp.data.ActivityStatus
import com.kotlinliza.todoapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.floatingActionButton.setOnClickListener { view ->
            //Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
            //  .setAction("Action", null).show()
            startActivity(Intent(this,AddMore::class.java))
        }

        val list=ArrayList<ActivityModel>()

        list.add(ActivityModel(R.drawable.img,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.img,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.img,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.img,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.img,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.img,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.img,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.img,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.img,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))
        list.add(ActivityModel(R.drawable.img,"walking","12.30pm","check and reply",
            ActivityStatus.Pending))


      /*  val activityAdapter= ActivityAdapter(this,list)
        val recyclerView=findViewById<RecyclerView>(R.id.Recyclerview)

        recyclerView.adapter=activityAdapter
        recyclerView.layoutManager=LinearLayoutManager(this)*/
        val activityAdapter= ActivityAdapter(this,list)
        val recyclerView= findViewById<RecyclerView>(R.id.Recyclerview)
        recyclerView.adapter= activityAdapter

        //  recyclerView.layoutManager=GridLayoutManager(this,2)
        recyclerView.layoutManager= LinearLayoutManager(this)
    }
}
