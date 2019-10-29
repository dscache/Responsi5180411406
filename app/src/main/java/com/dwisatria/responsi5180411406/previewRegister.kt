package com.dwisatria.responsi5180411406

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class previewRegister : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_preview)

        //get data from intent
        val intent = intent
        val nama = intent.getStringExtra("nama")
        val uname = intent.getStringExtra("uname")
        val email = intent.getStringExtra("email")
        val phone = intent.getStringExtra("phone")
        val password = intent.getStringExtra("password")

        //textview
        val result = findViewById<TextView>(R.id.result)
        //setText
        result.text = "Nama : "+nama+"\nUsername : "+uname+"\nemail : "+email+"\nphone : "+phone+"\npassword : "+password

    }
}