package com.example.mykotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.coroutines.selects.SelectInstance

class MainActivity : AppCompatActivity() {

    private lateinit var editUsername: EditText
    private lateinit var editPassword: EditText
    private lateinit var btnlogin: Button

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        editUsername = findViewById(R.id.editusername)
        editPassword = findViewById(R.id.editpassword)
        btnlogin = findViewById(R.id.tombollogin)

        btnlogin.setOnClickListener {
            val username = editUsername.text.toString()
            val password = editPassword.text.toString()

            if(username.isNotEmpty() && password.isNotEmpty()){
                val intent= Intent(this, BeradamSactivity::class.java)
                startActivity(intent)
            }else{
               Toast.makeText(this,"Username dan Password harus diisi", Toast.LENGTH_SHORT).show()
            }
        }
    }
}
