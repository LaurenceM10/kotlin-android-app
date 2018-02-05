package com.example.administrador.kotlinapp.ui.activities

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.example.administrador.kotlinapp.R
import kotlinx.android.synthetic.main.activity_sign_in.*

class SignInActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        initActions()
    }

    private fun initActions(){
        submit.setOnClickListener{
            Toast.makeText(this@SignInActivity, "Test", Toast.LENGTH_LONG).show()
        }
    }
}
