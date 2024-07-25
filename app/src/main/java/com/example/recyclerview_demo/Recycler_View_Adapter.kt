package com.example.recyclerview_demo

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.animation.AlphaAnimation
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.example.recyclerview_demo.databinding.RecyclerViewItemBinding

class Recycler_View_Adapter(var dataList: ArrayList<Recycler_View_Model>, var context : Context ) : RecyclerView.Adapter<Recycler_View_Adapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        var binding = RecyclerViewItemBinding.inflate(LayoutInflater.from(context),parent,false)
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return dataList.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {

        anim(holder.itemView)
        holder.binding.profile.setImageResource(dataList.get(position).profile)
        holder.binding.name.text = dataList.get(position).name
        holder.itemView.setOnClickListener {
            Toast.makeText(context, dataList.get(position).name, Toast.LENGTH_SHORT).show()
        }
    }

    inner class MyViewHolder(var binding: RecyclerViewItemBinding): RecyclerView.ViewHolder(binding.root)

    fun anim(view:View){
        var animation = AlphaAnimation(0.0f,1.0f)
        animation.duration=1000
        view.startAnimation(animation)
    }
}