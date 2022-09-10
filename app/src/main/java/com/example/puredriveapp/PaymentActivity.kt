package com.example.puredriveapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.payment_1.*

class PaymentActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle? ) {
            super.onCreate(savedInstanceState )
            setContentView(R.layout.payment_1)

            imageButton10.setOnClickListener {
                startActivity(Intent(this, PaymentCashActivity::class.java))
            }

    }
}