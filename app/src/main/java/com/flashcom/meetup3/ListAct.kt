package com.flashcom.meetup3

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.flashcom.meetup3.model.ModelItem
import com.flashcom.meetup3.model.Response
import com.flashcom.meetup3.model.TeamsItem
import com.flashcom.meetup3.retrofit.RetrofitAPI
import kotlinx.android.synthetic.main.activity_list.*
import retrofit2.Call
import retrofit2.Callback

class ListAct : AppCompatActivity() {

    val dataItem = arrayListOf<TeamsItem>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_list)
        //setUpList()
        getDataTeams()
    }

    private fun setUpList() {
        val myDataItem = arrayListOf(
            ModelItem("Susu Beruang", "Susu", "https://img.icons8.com/material/4ac144/256/user-male.png"),
            ModelItem("SilverQueen", "Cokelat", "https://img.icons8.com/material/4ac144/256/user-male.png"),
            ModelItem("KitKat", "Cokelat", "https://img.icons8.com/material/4ac144/256/user-male.png")
        )
        rv_list.layoutManager = LinearLayoutManager(this)
        //rv_list.adapter = RVList(myDataItem)
    }

    private fun getDataTeams(){
        val client = RetrofitAPI().baseURL().getLeague()
        client.enqueue(object: Callback<Response>{
            override fun onResponse(call: Call<Response>, response: retrofit2.Response<Response>) {
                dataItem.addAll(response.body()?.teams as ArrayList<TeamsItem>)
                rv_list.layoutManager = LinearLayoutManager(applicationContext)
                rv_list.adapter = RVList(dataItem)

            }
            override fun onFailure(call: Call<Response>, t: Throwable) {}
        })
    }
}

