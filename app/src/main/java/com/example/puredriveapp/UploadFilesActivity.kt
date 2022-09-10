package com.example.puredriveapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.upload_files.*

class UploadFilesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.upload_files)

        imageView15.setOnClickListener {
            startActivity(Intent(this, PaymentActivity::class.java))
        }
    }
}