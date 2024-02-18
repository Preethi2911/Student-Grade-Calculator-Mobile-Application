package com.example.projectcgpa

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_log.*

class log : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_log)

        var e=findViewById<EditText>(R.id.e)
        var p=findViewById<EditText>(R.id.p)

        signin.setOnClickListener {
            signin_signup_txt.text = "Sign In"
            bt.text = "Sign In"
            forgot_password.visibility = View.VISIBLE


        }
        signup.setOnClickListener {
            signin_signup_txt.text = "Sign Up"
            bt.text = "Sign Up"
            forgot_password.visibility = View.INVISIBLE
        }
        bt.setOnClickListener {

            Toast.makeText(this,"SignIn Successful", Toast.LENGTH_LONG).show()
            val i= Intent(this,MainActivity::class.java)
            startActivity(i)
        }
        }
    }
