package com.flashcom.meetup3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.activity_list.*

class ListAct : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        setUpList()
    }

    private fun setUpList(){
        val myDataItem = arrayListOf("Biskuit", "Susu", "Sereal", "nugget")
        rv_list.layoutManager = LinearLayoutManager(this)
        rv_list.adapter = RVList(myDataItem)
    }
}

