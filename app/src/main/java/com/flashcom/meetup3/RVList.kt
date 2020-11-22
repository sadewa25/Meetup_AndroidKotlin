package com.flashcom.meetup3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RVList(private val myDataset: ArrayList<String>) :
    RecyclerView.Adapter<RVList.MyViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_list, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindData(myDataset[position])
    }

    override fun getItemCount() = myDataset.size

    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        val itemText = itemView.findViewById<TextView>(R.id.tv_item_list)

        fun bindData(data: String){
            itemText.text = data
        }
    }

}