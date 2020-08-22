package com.example.temanteman

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_answer.*
import kotlinx.android.synthetic.main.activity_thread.*

class answer : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_answer)

        answerback.setOnClickListener {
            val intent = Intent(this, thread::class.java)
            startActivity(intent)
        }
    }
}
