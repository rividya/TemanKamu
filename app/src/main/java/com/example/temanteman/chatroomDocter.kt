package com.example.temanteman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_chatroom_docter.*
import kotlinx.android.synthetic.main.activity_doctor.*

class chatroomDocter : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_chatroom_docter)

        chatdocterback.setOnClickListener {
            val intent = Intent(this, doctor::class.java)
            startActivity(intent)
        }
    }
}
