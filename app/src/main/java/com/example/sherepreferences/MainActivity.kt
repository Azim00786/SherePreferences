package com.example.sherepreferences

import android.annotation.SuppressLint
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val name = findViewById<EditText>(R.id.edittext)
        val password = findViewById<EditText>(R.id.edittext1)
        val save = findViewById<Button>(R.id.save)
        val show = findViewById<Button>(R.id.show)
        val shere = findViewById<Button>(R.id.show1)

        val localStorage = getSharedPreferences("user",Context.MODE_PRIVATE)
        save.setOnClickListener(){
            val editpref = localStorage.edit()

            editpref.putString("username",""+ name.text.toString())
            editpref.putString("userpass",""+ password.text.toString()).apply()
        }
        show.setOnClickListener(){
            val getName = localStorage.getString("username","Not Found")
            val getpass = localStorage.getString("userpass","Not Found")

            Toast.makeText(this, "$getName", Toast.LENGTH_SHORT).show()
            Toast.makeText(this, "$getpass", Toast.LENGTH_SHORT).show()

        }
        shere.setOnClickListener(){
            val intent = Intent(this,HomeActivity2::class.java)
            startActivity(intent)
        }

    }
}