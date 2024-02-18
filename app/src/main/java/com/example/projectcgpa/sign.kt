package com.example.projectcgpa

import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_sign.*

class sign : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign)

        signin.setOnClickListener {
            signin_signup_txt.text = "Sign In"
            b1.text = "Sign In"
            forgot_password.visibility = View.VISIBLE


        }
        signup.setOnClickListener {
            signin_signup_txt.text = "Sign Up"
            b1.text = "Sign Up"
            forgot_password.visibility = View.INVISIBLE
        }
        b1.setOnClickListener{
            Toast.makeText(this,"SignUp Successful", Toast.LENGTH_LONG).show()
            val i= Intent(this,student::class.java)
            startActivity(i)
        }
    }
}