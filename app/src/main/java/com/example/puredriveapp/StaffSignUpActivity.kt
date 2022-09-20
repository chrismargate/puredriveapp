package com.example.puredriveapp

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.puredriveapp.fragments.StaffSignUp1Fragment

class StaffSignUpActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staff_signup)

        supportFragmentManager.beginTransaction().replace(R.id.frameStaffSignUp,StaffSignUp1Fragment()).commit()
    }

}