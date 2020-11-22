package com.flashcom.meetup3

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class RvAdapterDashboard(private val myDataset: ArrayList<String>) :
    RecyclerView.Adapter<RvAdapterDashboard.MyViewHolder>() {

    // Create new views (invoked by the layout manager)
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        // create a new view
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_dashboard, parent, false)
        // set the view's size, margins, paddings and layout parameters
        return MyViewHolder(view)
    }

    // Replace the contents of a view (invoked by the layout manager)
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bindData(myDataset[position])
    }

    // Return the size of your dataset (invoked by the layout manager)
    override fun getItemCount() = myDataset.size

    // Provide a reference to the views for each data item
    // Complex data items may need more than one view per item, and
    // you provide access to all the views for a data item in a view holder.
    // Each data item is just a string in this case that is shown in a TextView.
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){
        //Connecting the variable to layout item
        val itemText = itemView.findViewById<TextView>(R.id.tv_item_dashboard)
        val itemContent = itemView.findViewById<TextView>(R.id.tv_item_content)
        fun bindData(data: String){
            // - get element from your dataset at this position
            // - replace the contents of the view with that element
            itemText.text = data
            itemContent.text = data
        }
    }

}