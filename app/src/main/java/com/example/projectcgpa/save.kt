package com.example.projectcgpa

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity

class save : AppCompatActivity() {
    lateinit var editTextMail: EditText
    lateinit var editTextSubject: EditText
    lateinit var editTextMessage: EditText
    lateinit var buttonSend: Button
    lateinit var email: String
    lateinit var subject: String
    lateinit var message: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_save)

        title = "MARK TRACKER"
        editTextMail = findViewById(R.id.e1)
        editTextSubject = findViewById(R.id.e2)
        editTextMessage = findViewById(R.id.e3)
        buttonSend = findViewById(R.id.b1)
        buttonSend.setOnClickListener {
            getData()
            val intent = Intent(Intent.ACTION_SEND)
            intent.putExtra(Intent.EXTRA_EMAIL, arrayOf(email))
            intent.putExtra(Intent.EXTRA_SUBJECT, subject)
            intent.putExtra(Intent.EXTRA_TEXT, message)
            intent.type = "message/rfc822"
            startActivity(Intent.createChooser(intent, "Select email"))
        }
    }
    private fun getData() {
        email = editTextMail.text.toString()
        subject = editTextSubject.text.toString()
        message = editTextMessage.text.toString()

    }
}