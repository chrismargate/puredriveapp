package com.example.puredriveapp

import android.content.Intent
import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import com.example.puredriveapp.fragments.ChooseUserFragment
import com.example.puredriveapp.fragments.GetStartedFragment
import kotlinx.android.synthetic.main.welcome.*

class GetStartedActivity : AppCompatActivity(), GetStartedCommunicator {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_getstarted)

        supportFragmentManager.beginTransaction().replace(R.id.frameGetStarted, GetStartedFragment()).commit()
    }

    override fun loadNextFragment(nextResource: Int, nextFragment: Fragment){
        supportFragmentManager.beginTransaction().replace(nextResource, nextFragment).commit()
    }
}