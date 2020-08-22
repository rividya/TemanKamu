package com.example.temanteman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*

class First : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        firstchat1.setOnClickListener {
            val intent = Intent(this, chatroom::class.java)
            startActivity(intent)
        }

        firstchat.setOnClickListener {
            val intent = Intent(this, chatroom::class.java)
            startActivity(intent)
        }

        firstdokter.setOnClickListener {
            val intent = Intent(this, doctor::class.java)
            startActivity(intent)
        }

        firstthread.setOnClickListener {
            val intent = Intent(this, thread::class.java)
            startActivity(intent)
        }

        firstnotif.setOnClickListener {
            val intent = Intent(this, Notifikasi::class.java)
            startActivity(intent)
        }


    }
}
