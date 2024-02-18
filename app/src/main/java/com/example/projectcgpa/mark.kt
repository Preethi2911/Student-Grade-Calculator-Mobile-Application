package com.example.projectcgpa


import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.math.round

class mark : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_mark)
        val t1=findViewById<EditText>(R.id.e5)
        val t2=findViewById<EditText>(R.id.e6)
        val t3=findViewById<EditText>(R.id.e7)
        val t4=findViewById<EditText>(R.id.e8)
        val t5=findViewById<EditText>(R.id.e9)
        val b1=findViewById<Button>(R.id.b1)
        val b2=findViewById<Button>(R.id.save)
        val tv=findViewById<TextView>(R.id.t)
        b1.setOnClickListener {
            var a=t1.text.toString().trim().toInt()
            var b=t2.text.toString().trim().toInt()
            var c=t3.text.toString().trim().toInt()
            var d=t4.text.toString().trim().toInt()
            var e=t5.text.toString().trim().toInt()
            when (a) {
                in 91..100 -> a=10
                in 81..90 -> a=9
                in 71..80 -> a=8
                in 61..70 -> a=7
                in 51..60 -> a=6
                in 41..50 -> a=5
                in 33..40 -> a=4
                in 21..32 -> a=0
                in 0..21 -> a=0
            }



            when (b) {
                in 91..100 -> b =10
                in 81..90 -> b =9
                in 71..80 -> b =8
                in 61..70 -> b =7
                in 51..60 -> b =6
                in 41..50 -> b =5
                in 33..40 -> b =4
                in 21..32 -> b =0
                in 0..21 -> b =0
            }


            when (c) {
                in 91..100 -> c  =10
                in 81..90 -> c  =9
                in 71..80 -> c  =8
                in 61..70 -> c  =7
                in 51..60 -> c  =6
                in 41..50 -> c  =5
                in 33..40 -> c  =4
                in 21..32 -> c  =0
                in 0..21 -> c  =0
            }


            when (d) {
                in 91..100 -> d  =10
                in 81..90 -> d  =9
                in 71..80 -> d  =8
                in 61..70 -> d  =7
                in 51..60 -> d  =6
                in 41..50 -> d  =5
                in 33..40 -> d  =4
                in 21..32 -> d  =0
                in 0..21 -> d  =0
            }



            when {
                e in 91..100 -> e =10
                e in 81..90 -> e=9
                e in 71..80 -> e =8
                e in 61..70 -> e=7
                e in 51..60 -> e=6
                e in 41..50 -> e=5
                e in 33..40 -> e=4
                e in 21..32 -> e=0
                b in 0..21 -> e=0
            }

            val sum=(a+b+c+d+e)/5.0
            val s=sum.toString()
            tv.text = "CGPA: $s"

            b2.setOnClickListener(View.OnClickListener {

                val i= Intent(this,save::class.java)
                startActivity(i)
            })
        }



    }
}
