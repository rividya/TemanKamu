package com.example.temanteman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_first.*
import kotlinx.android.synthetic.main.activity_notifikasi.*

class Notifikasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_notifikasi)

        notifchat.setOnClickListener {
            val intent = Intent(this, chatroom::class.java)
            startActivity(intent)
        }

        notifdocter.setOnClickListener {
            val intent = Intent(this, doctor::class.java)
            startActivity(intent)
        }

        notifthread.setOnClickListener {
            val intent = Intent(this, thread::class.java)
            startActivity(intent)
        }

        notifnotif.setOnClickListener {
            val intent = Intent(this, Notifikasi::class.java)
            startActivity(intent)
        }
    }
}
