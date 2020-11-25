package com.flashcom.meetup3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.flashcom.meetup3.model.ModelItem
import com.flashcom.meetup3.model.TeamsItem
import com.squareup.picasso.Picasso

class RVList(private val myDataset: ArrayList<TeamsItem>) :
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
        val itemContent = itemView.findViewById<TextView>(R.id.tv_item_listcontent)
        val itemImage = itemView.findViewById<ImageView>(R.id.tv_image)

        fun bindData(data: TeamsItem){
            itemText.text = data.strTeam
            itemContent.text = data.strAlternate
            //itemImage.setImageResource(data.img)
            Picasso.get().load(data.strTeamBanner).into(itemImage)
        }
    }

}