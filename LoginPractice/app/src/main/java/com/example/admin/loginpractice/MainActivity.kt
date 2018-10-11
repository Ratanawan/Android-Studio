package com.example.admin.loginpractice

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_third.view.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        submit.setOnClickListener()
        {
            //check with username
            var username = username.text.toString().toCharArray()

            for (i in username) {
                if ((i >= 'A' && i <= 'Z') || (i >= 'a' && i<= 'z'))
                {
                    noti.text = "Valid Username"
                }
                else
                {
                    noti.text = "Invalid Username"
                }
            }


            //check with password


            //open the activity
            var activity = activity.text.toString().toLowerCase()

            if(activity == "first")
            {
                var i = Intent(this, FirstActivity::class.java)
                Toast.makeText(this, "Starting First Activity...", Toast.LENGTH_LONG).show()

                startActivity(i)
            }
            else if(activity == "second")
            {
                var i = Intent(this, SecondActivity::class.java)
                Toast.makeText(this, "Starting Second Activity...", Toast.LENGTH_LONG).show()
                startActivity(i)
            }
            else if( activity == "third")
            {
                var i = Intent(this, ThirdActivity::class.java)
                Toast.makeText(this, "Starting Third Activity...", Toast.LENGTH_LONG).show()
                startActivity(i)
            }
            else
            {
                Toast.makeText(this, "Invalid Activity", Toast.LENGTH_LONG).show()
            }
        }
    }
}

