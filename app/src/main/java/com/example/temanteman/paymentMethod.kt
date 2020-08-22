package com.example.temanteman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_konsultasi.*
import kotlinx.android.synthetic.main.activity_payment_method.*

class paymentMethod : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_payment_method)

        methodback.setOnClickListener {
            val intent = Intent(this, form::class.java)
            startActivity(intent)
        }

        methodbayar.setOnClickListener {
            val intent = Intent(this, chatroomDocter::class.java)
            startActivity(intent)
        }
    }
}
