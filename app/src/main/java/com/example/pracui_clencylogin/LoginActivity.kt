package com.example.pracui_clencylogin

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class LoginActivity : AppCompatActivity() {
    
    lateinit var BTNLogin:Button
    lateinit var TXTEmail:EditText
    lateinit var TXTPass:EditText
    
    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)
        
        BTNLogin = findViewById(R.id.btnlogin)
        TXTEmail = findViewById(R.id.txtemail)
        TXTPass = findViewById(R.id.txtpasscode)
        
        BTNLogin.setOnClickListener { 
            var email = TXTEmail.text.toString().trim()
            var pass = TXTPass.text.toString().trim()
            
            if (email.isEmpty() || pass.isEmpty())
            {
                Toast.makeText(this, "Cannot Submit empty field", Toast.LENGTH_SHORT).show()
            }
            else{
                Toast.makeText(this, "User Created Successfully", Toast.LENGTH_SHORT).show()

                var gotoregister = Intent(this, RegisterActivity::class.java)
                startActivity(gotoregister)
            }
        }
    }
}