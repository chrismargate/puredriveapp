package com.example.puredriveapp

import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.sample_activity.*

class SampleActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.sample_activity)

        btnClickMe.setOnClickListener {
            Toast.makeText(applicationContext, "Login successful", Toast.LENGTH_LONG).show()
        }
    }
}