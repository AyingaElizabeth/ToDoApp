package com.kotlinliza.todoapp.data

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.kotlinliza.todoapp.DetailsActivity
import com.kotlinliza.todoapp.R

class ActivityAdapter(var context: Context,var list:ArrayList<ActivityModel>):RecyclerView.Adapter<ActivityAdapter.ActivityViewHolder>() {

    inner class ActivityViewHolder(itemView:View):ViewHolder(itemView){
        val image=itemView.findViewById<ImageView>(R.id.image)
        val name=itemView.findViewById<TextView>(R.id.activity)
        val time=itemView.findViewById<TextView>(R.id.time)
        val cardview=itemView.findViewById<CardView>(R.id.cardView)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ActivityViewHolder {
        val view=LayoutInflater.from(context).inflate(R.layout.list_item_layout,parent,false)
        return ActivityViewHolder(view)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: ActivityViewHolder, position: Int) {
    holder.image.setImageResource(list[position].image)
        holder.name.text=list[position].activityname
        holder.time.text=list[position].activitytime

        holder.cardview.setOnClickListener {
           var intent=Intent(context,DetailsActivity::class.java)

            intent.putExtra("image",list[position].image)
            intent.putExtra("activityName",list[position].activityname)
            intent.putExtra("activityStatus", list[position].activitystatus)
            intent.putExtra("activityDescription",list[position].activityDes)
            intent.putExtra("activityTime",list[position].activitytime)
            context.startActivity(intent)
        }
    }
}