package com.example.sherepreferences

import android.annotation.SuppressLint
import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class HomeActivity2 : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_home2)

        val localStorage = getSharedPreferences("user",Context.MODE_PRIVATE)

        val getName = localStorage.getString("username", "name not found")
        val getpass = localStorage.getString("userpass", "pass not found")

        val name1 = findViewById<TextView>(R.id.nameedit)
        val name2 = findViewById<TextView>(R.id.nameedit1)

        name1.text = getName.toString()
        name2.text = getpass.toString()

        Toast.makeText(this , "$getName", Toast.LENGTH_SHORT).show()
        Toast.makeText(this , "$getpass", Toast.LENGTH_SHORT).show()
    }
}