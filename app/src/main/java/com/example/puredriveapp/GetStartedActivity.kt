package com.example.puredriveapp

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.puredriveapp.fragments.GetStartedFragment
import com.example.puredriveapp.interfaces.GetStartedCommunicator

class GetStartedActivity : AppCompatActivity(), GetStartedCommunicator {
    /*
    Chris SDK : sdk.dir=C\:\\Users\\Chris\\AppData\\Local\\Android\\Sdk
    Jemma SDK : sdk.dir=C\:\\Users\\jemma_6i2adz5\\AppData\\Local\\Android\\Sdk
    Hello this is a sample to try out merging
     */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getstarted)

        supportFragmentManager.beginTransaction().replace(R.id.frameGetStarted, GetStartedFragment()).commit()
    }

    override fun loadNextFragment(nextResource: Int, nextFragment: Fragment){
        supportFragmentManager.beginTransaction().replace(nextResource, nextFragment).commit()
    }

    override fun getData(userType: String) {
        val intent = Intent(this,SignInActivity::class.java)
        intent.putExtra("User Type",userType)
        startActivity(intent)
    }
}