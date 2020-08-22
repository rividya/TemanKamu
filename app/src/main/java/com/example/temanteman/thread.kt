package com.example.temanteman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_thread.*

class thread : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_thread)

        threadchat.setOnClickListener {
            val intent = Intent(this, chatroom::class.java)
            startActivity(intent)
        }

        threaddocter.setOnClickListener {
            val intent = Intent(this, doctor::class.java)
            startActivity(intent)
        }

        threadthread.setOnClickListener {
            val intent = Intent(this, thread::class.java)
            startActivity(intent)
        }

        threadnotif.setOnClickListener {
            val intent = Intent(this, Notifikasi::class.java)
            startActivity(intent)
        }

        jawaban1.setOnClickListener {
            val intent = Intent(this, answer::class.java)
            startActivity(intent)
        }

        jawaban2.setOnClickListener {
            val intent = Intent(this, answer::class.java)
            startActivity(intent)
        }

        jawaban3.setOnClickListener {
            val intent = Intent(this, answer::class.java)
            startActivity(intent)
        }

        jawaban4.setOnClickListener {
            val intent = Intent(this, answer::class.java)
            startActivity(intent)
        }
    }
}
