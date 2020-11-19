package com.flashcom.meetup3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_dashboard.*

class DashboardActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)
    }

    fun calculate(view: View) {
        val result = ed_db_panjang.text.toString().toDouble() * ed_db_lebar.text.toString().toDouble()
        Toast.makeText(this, "$result", Toast.LENGTH_SHORT).show()
    }
}