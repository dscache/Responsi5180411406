package com.dwisatria.responsi5180411406

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import org.json.JSONException
import java.io.IOException

class MainActivity : AppCompatActivity() {
    val id:Int=1
    val language:String = "toRegister"
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val email = findViewById<EditText>(R.id.email)
        val password = findViewById<EditText>(R.id.password)
        val btnprologin = findViewById<Button>(R.id.btn_prologin)

        btnprologin.setOnClickListener(){
            val email = email.text.toString()
            val password = password.text.toString()

            intent = Intent(this,dashboard::class.java)
            intent.putExtra("email", email)
            intent.putExtra("password", password)
            startActivity(intent)
        }

        btn_torgstr.setOnClickListener(){
            intent = Intent(this,register::class.java)
            intent.putExtra("id_value", id)
            intent.putExtra("language_value", language)
            startActivity(intent)
        }
    }
}

