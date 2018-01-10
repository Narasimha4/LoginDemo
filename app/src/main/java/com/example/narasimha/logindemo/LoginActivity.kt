package com.example.narasimha.logindemo

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_login.*
import android.widget.Toast
import android.widget.EditText
import android.widget.Button
import android.content.Intent

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        //init the edittext
        val userName = findViewById<EditText>(R.id.editText)
        val password = findViewById<EditText>(R.id.editText)
        //init the button
        val btnClick = findViewById<Button>(R.id.button)

        btnClick.setOnClickListener {
            //read value from EditText to a String variable
            val usernameText: String = userName.text.toString()
            val passwordText: String = password.text.toString()
            //check if the EditText have values or not
            if (usernameText.trim().length > 0 && passwordText.trim().length > 0) {
                Toast.makeText(applicationContext, "Successfully logged in", Toast.LENGTH_SHORT).show()
                val intent = Intent(this, ReceiverActivity ::class.java)
                intent.putExtra("text", usernameText)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "Please enter username and password ", Toast.LENGTH_SHORT).show()
            }
        }
    }

}