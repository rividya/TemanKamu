package com.example.temanteman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_doctor.*
import kotlinx.android.synthetic.main.activity_konsultasi.*

class konsultasi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_konsultasi)

        konsulback.setOnClickListener {
            val intent = Intent(this, doctor::class.java)
            startActivity(intent)
        }

        konsultasibtn.setOnClickListener {
            val intent = Intent(this, form::class.java)
            startActivity(intent)
        }
    }
}
