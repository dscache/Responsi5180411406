package com.dwisatria.responsi5180411406

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_register.*

class register : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        val bundle:Bundle = intent.extras
        val id = bundle.get("id_value")
        val language =  bundle.get("language_value")
        Toast.makeText(applicationContext,id.toString()+""+language, Toast.LENGTH_LONG).show()

        val nama = findViewById<EditText>(R.id.nama)
        val uname = findViewById<EditText>(R.id.username)
        val email = findViewById<EditText>(R.id.email)
        val phone = findViewById<EditText>(R.id.phone)
        val password = findViewById<EditText>(R.id.password)
        val btnproses = findViewById<Button>(R.id.btn_proses)

        //handle button click
        btnproses.setOnClickListener {
            //get text from edittexts
            val nama = nama.text.toString()
            val uname = uname.text.toString()
            val email = email.text.toString()
            val phone= phone.text.toString()
            val password = password.text.toString()

            //intent to start activity
            val intent = Intent(this , previewRegister::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("uname", uname)
            intent.putExtra("email", email)
            intent.putExtra("phone", phone)
            intent.putExtra("password", password)
            startActivity(intent)
        }

        btn_back.setOnClickListener(){
            intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }
    }
}