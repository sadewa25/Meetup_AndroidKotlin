package com.flashcom.meetup3

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.flashcom.meetup3.model.ModelItem
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onLogin(view: View) {
        if (ed_main_email.text.toString() == "admin" && ed_main_password.text.toString() == "admin")
            startActivity(Intent(this, DashboardActivity::class.java))
        else
            Toast.makeText(this, "Gagal", Toast.LENGTH_SHORT).show()
    }
}