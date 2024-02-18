package com.example.projectcgpa

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.RadioButton
import android.widget.TextView

class percentage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_percentage)

        val t1 = findViewById<EditText>(R.id.editTextNumberDecimal)
        val b1 = findViewById<Button>(R.id.b1)
        val tv = findViewById<TextView>(R.id.res)
        val rb1 = findViewById<RadioButton>(R.id.radioButton)
        val rb2 = findViewById<RadioButton>(R.id.radioButton2)
        b1.setOnClickListener {
            val msg = t1.text.toString().trim().toDouble()

            if (rb1.isChecked)
                tv.text = (msg * 9.5).toString()
            else if (rb2.isChecked)
                if(msg/9.5>10.0)
                    tv.text= (10).toString()
                else
                    tv.text = (msg / 9.5).toString()
        }
    }
}