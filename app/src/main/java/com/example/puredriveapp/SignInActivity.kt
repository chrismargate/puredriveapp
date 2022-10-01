package com.example.puredriveapp

import android.content.Intent
import android.os.Bundle
import android.view.View
import android.widget.ProgressBar
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.example.puredriveapp.R
import com.example.puredriveapp.dataclasses.*
import com.google.gson.GsonBuilder
import kotlinx.android.synthetic.main.activity_sign_in.*
import okhttp3.*
import okio.IOException
import java.util.*

class SignInActivity : AppCompatActivity() {

    // For loading animation
    var progressBar: ProgressBar? = null
    var count = 1

    // For user
    var loginUser = User()
    lateinit var userType: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_in)

        progressBar = findViewById<ProgressBar>(R.id.progressBar) as ProgressBar

        // Sign in button action when clicked
        btnSignIn.setOnClickListener{

            // Login indicator
            Toast.makeText(applicationContext, "Logging in..", Toast.LENGTH_LONG).show()
            progressBar!!.setProgress(count)
            progressBar!!.visibility = View.VISIBLE

            fetchLogin()
        }

        // Checks the type of user and opens the sign up activity accordingly
        tvSignUp.setOnClickListener{

            // Gets the user type passed from previous activity
            //val userType = intent.getStringExtra("User Type")

            val userType = "Staff"

            when (userType){
                "Customer" -> {
                    startActivity(Intent(this,CustomerSignUpActivity::class.java))
                }

                "Staff" -> {
                    startActivity(Intent(this,StaffSignUpActivity::class.java))
                }

                "Rental" -> {
                    startActivity(Intent(this,RentalSignUpActivity::class.java))
                }
            }
        }
    }

    private fun fetchLogin() {

        val enteredUsername = etUsername.text.toString()
        val enteredPassword = etPassword.text.toString()

        val url = "https://my-python-test-api.herokuapp.com/api/user/"

        // String builder to append the url and the username entered to fetch in API
        val urlBuilder = StringBuilder()
        urlBuilder.append(url)
            .append(enteredUsername)

        // val url = "http://127.0.0.1:5000/api/customer/"

        Toast.makeText(applicationContext, "Logging in..", Toast.LENGTH_LONG).show()

        // Sends request
        val request = Request.Builder().url(urlBuilder.toString()).build()
        val client = OkHttpClient()
        client.newCall(request).enqueue(object: Callback {
            override fun onResponse(call: Call, response: Response) {

                try{
                    val body = response?.body?.string()

                    val gson = GsonBuilder().create()

                    val user = gson.fromJson(body, User::class.java)

                    /*
                   if(user.Username.toString() == ""){
                       loginUser.Username = "nothing"
                   }else {
                       loginUser.Username = user.Username.toString()
                       loginUser.Password = user.Password.toString()
                       loginUser.Fname = user.Fname.toString()
                    }
                     */

                }catch (e: Exception){
                    e.printStackTrace()
                }

                // Runs on the main thread
                runOnUiThread{
                    // For loading animation
                    count = 100
                    progressBar!!.setProgress(count)
                    progressBar!!.visibility = View.INVISIBLE

                    loginUser.Username = "sampol"
                    loginUser.Password = "sampol"
                    loginUser.Fname = "sampol"

                    // User validation
                    if(loginUser.Username == enteredUsername) {
                        if (loginUser.Password == enteredPassword) {
                            println(loginUser.Username + " " + enteredUsername)
                            println(loginUser.Password + " " + enteredPassword)
                            //Toast.makeText(applicationContext, "Login successful", Toast.LENGTH_LONG).show()
                            Toast.makeText(applicationContext, loginUser.Username + " " + enteredUsername, Toast.LENGTH_LONG).show()
                            loadMainActivity()
                        } else {
                            Toast.makeText(applicationContext, "Incorrect Password", Toast.LENGTH_LONG).show()
                        }
                    } else {
                        Toast.makeText(applicationContext, "Invalid Username", Toast.LENGTH_LONG).show()
                    }
                }

            }
            override fun onFailure(call: Call, e: IOException) {
                Toast.makeText(applicationContext, "Invalid Username", Toast.LENGTH_LONG).show()
            }
        })

    }

    private fun loadMainActivity(){
        val intent = Intent(this,MainActivity::class.java)
        startActivity(intent)
    }
/*
    private fun loadSignUpActivity(){

        userType = intent.getStringExtra("User type").toString()

        if (userType == "Customer"){
            startActivity(Intent(this,CustomerSignUp1Activity::class.java))
        }

        if (userType == "Staff"){

        }
    }



    data class User(
        var UserID: Int = 0,
        var RoleID: Int = 0,
        var CreatedDateTime: String = "",
        var UpdatedDateTime: String = "",
        var Username: String = "",
        var Password: String = "",
        var EmailAddress: String = "",
        var Fname: String = "",
        var Mname: String = "",
        var Lname: String = "",
        var Gender: String = "",
        var PhoneNo: String = "",
        var DateOfBirth: String = ""
    )

    data class Customer(val customerID: Int, val userID: Int, val billingLocationID: Int, val shippingLocationID: Int, val recentSearch: String, val lastRentedVehicle: Int, val lastUsedPayment: String)

    data class Location(val locationID: Int, val lotno: String, val addressline: String, val addressline2: String, val state: String, val city: String, val country: String, val zipcode: String)
 */
}