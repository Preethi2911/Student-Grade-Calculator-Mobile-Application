package com.example.projectcgpa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class home : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home)

        var b3 = findViewById<Button>(R.id.b3)
        var b4 = findViewById<Button>(R.id.b4)

        b3.setOnClickListener {
            val i= Intent(this,log::class.java)
            startActivity(i)
        }
        b4.setOnClickListener {
            val i= Intent(this,sign::class.java)
            startActivity(i)
        }
    }
}