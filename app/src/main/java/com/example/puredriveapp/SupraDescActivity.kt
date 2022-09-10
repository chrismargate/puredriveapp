package com.example.puredriveapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.supra_desc3.*

class SupraDescActivity : AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
            setContentView(R.layout.supra_desc3)

        ibSupraBook.setOnClickListener {
            startActivity(Intent(this, UploadFilesActivity::class.java))
        }
    }
}