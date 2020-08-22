package com.example.temanteman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_doctor.*
import kotlinx.android.synthetic.main.activity_first.*

class doctor : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_doctor)

        doctor1.setOnClickListener {
            val intent = Intent(this, konsultasi::class.java)
            startActivity(intent)
        }

        doctor2.setOnClickListener {
            val intent = Intent(this, konsultasi::class.java)
            startActivity(intent)
        }

        doctor3.setOnClickListener {
            val intent = Intent(this, konsultasi::class.java)
            startActivity(intent)
        }

        doctor4.setOnClickListener {
            val intent = Intent(this, konsultasi::class.java)
            startActivity(intent)
        }

        docterchat.setOnClickListener {
            val intent = Intent(this, chatroom::class.java)
            startActivity(intent)
        }

        docterdokter.setOnClickListener {
            val intent = Intent(this, doctor::class.java)
            startActivity(intent)
        }

        docterthread.setOnClickListener {
            val intent = Intent(this, thread::class.java)
            startActivity(intent)
        }

        docternotif.setOnClickListener {
            val intent = Intent(this, Notifikasi::class.java)
            startActivity(intent)
        }
    }


}
