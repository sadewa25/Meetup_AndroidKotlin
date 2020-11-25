package com.flashcom.meetup3

import android.content.Intent
import android.os.Bundle
import android.view.DragEvent
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.flashcom.meetup3.model.ModelItem
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
    //, View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        setupRvAdapter()
        btn_list.setOnClickListener { startActivity(Intent(this, ListAct::class.java)) }
        //btn_list.setOnClickListener(this)
    }

    private fun setupRvAdapter() {
        val myDataItem = arrayListOf(
            ModelItem("Susu Beruang","Susu", "https://img.icons8.com/material/4ac144/256/user-male.png"),
            ModelItem("SilverQueen","Cokelat", "https://img.icons8.com/material/4ac144/256/user-male.png"),
            ModelItem("Kitkat","Cokelat", "https://img.icons8.com/material/4ac144/256/user-male.png"),
        )
        //rv_dashboard.layoutManager = GridLayoutManager(this,2)
        rv_dashboard.layoutManager = LinearLayoutManager(this)
        rv_dashboard.adapter = RvAdapterDashboard(myDataItem)
    }

    fun calculate(view: View) {
        val result =
            ed_db_panjang.text.toString().toDouble() * ed_db_lebar.text.toString().toDouble()
        Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
    }

    /*override fun onClick(p0: View?) {
        startActivity(Intent(this, ListAct::class.java))
    }*/
}