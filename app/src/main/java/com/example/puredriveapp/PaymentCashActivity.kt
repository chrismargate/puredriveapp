package com.example.puredriveapp
import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.payment_1.*
import kotlinx.android.synthetic.main.payment_cash.*

class PaymentCashActivity : AppCompatActivity () {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.payment_cash)

        cash_book_now.setOnClickListener{
            startActivity(Intent(this, BookingConfirmedActivity::class.java))
        }

    }
}