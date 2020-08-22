package com.example.temanteman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_form.*
import kotlinx.android.synthetic.main.activity_konsultasi.*

class form : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_form)

        formback.setOnClickListener {
            val intent = Intent(this, konsultasi::class.java)
            startActivity(intent)
        }

        formbayar.setOnClickListener {
            val intent = Intent(this, paymentMethod::class.java)
            startActivity(intent)
        }
    }
}
