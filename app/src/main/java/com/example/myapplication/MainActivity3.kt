package com.example.myapplication

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import com.google.firebase.auth.FirebaseAuth

class MainActivity3 : AppCompatActivity() {
    lateinit var button1: Button
    lateinit var button2 : Button
    lateinit var button3 : Button
    private lateinit var auth: FirebaseAuth
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        button1 = findViewById(R.id.Maps)
        button2 = findViewById(R.id.To)
        button3 = findViewById(R.id.signout)
        auth = FirebaseAuth.getInstance()
        button1.setOnClickListener {
            val intent = Intent(this@MainActivity3,MapsActivity2::class.java)
            startActivity(intent)
        }
        button2.setOnClickListener {
            val intent = Intent(this@MainActivity3,MainActivity5::class.java)
            startActivity(intent)
        }
        button3.setOnClickListener{
            auth.signOut()
            val intent = Intent(this@MainActivity3,MainActivity::class.java)
            startActivity(intent)

        }
    }
}