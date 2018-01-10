package com.example.narasimha.logindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.content.Intent
import android.widget.TextView

class ReceiverActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_receiver)

        val intent = getIntent()

        val message = intent.extras.get("text")
        println(message)
        val receiver = findViewById<TextView>(R.id.textView)

        receiver.setText("Welcome to save tree $message")
        println(message)

    }
}