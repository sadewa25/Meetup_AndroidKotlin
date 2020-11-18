package com.flashcom.meetup3

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    fun onLogin(view: View) {
        Toast.makeText(this, "Terima Kasih", Toast.LENGTH_SHORT).show()
    }
}