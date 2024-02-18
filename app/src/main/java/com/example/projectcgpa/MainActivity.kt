package com.example.projectcgpa

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var b1 = findViewById<Button>(R.id.b1)
        var b2 = findViewById<Button>(R.id.b2)
//        var b3 = findViewById<Button>(R.id.b3)
        b1.setOnClickListener {
            val i= Intent(this,mark::class.java)
            startActivity(i)
        }
        b2.setOnClickListener {
            val e= Intent(this,save::class.java)
            startActivity(e)
        }

    }
}