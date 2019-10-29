package com.dwisatria.responsi5180411406

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class dashboard : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_dashboard)

        //get data from intent
        val intent = intent
        val email = intent.getStringExtra("email")
        val password = intent.getStringExtra("password")

        //textview
        val result = findViewById<TextView>(R.id.result)
        //setText
        result.text = "email : "+email+"\npassword : "+password

    }
}