package com.example.projectcgpa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class student : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_student)


        var b1 = findViewById<Button>(R.id.b1)
        var b2 = findViewById<Button>(R.id.b2)
        var b3 = findViewById<Button>(R.id.b3)
        b1.setOnClickListener {
            val i= Intent(this,calculate::class.java)
            startActivity(i)
        }
        b2.setOnClickListener {
            val i= Intent(this,grade::class.java)
            startActivity(i)
        }
        b3.setOnClickListener {
            val i= Intent(this,percentage::class.java)
            startActivity(i)
        }
    }
}