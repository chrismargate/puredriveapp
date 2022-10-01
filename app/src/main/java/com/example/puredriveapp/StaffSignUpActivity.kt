package com.example.puredriveapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.puredriveapp.dataclasses.Staff
import com.example.puredriveapp.dataclasses.User
import com.example.puredriveapp.fragments.signup.staff.StaffSignUp1Fragment
import com.example.puredriveapp.interfaces.StaffSignUpCommunicator

class StaffSignUpActivity : AppCompatActivity(), StaffSignUpCommunicator{

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_staff_signup)

        supportFragmentManager.beginTransaction().replace(R.id.frameStaffSignUp,StaffSignUp1Fragment()).commit()
    }

    override fun loadNextFragment(nextResource: Int, nextFragment: Fragment){
        supportFragmentManager.beginTransaction().replace(nextResource,nextFragment).commit()
    }

    /*
    override fun getUserData(userData: User) {

    }

    override fun getStaffData(staffData: Staff) {
        TODO("Not yet implemented")
    }
     */
}