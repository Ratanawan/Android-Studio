package com.example.admin.lifecircleactivity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    override fun onStart()
    {
        super.onStart()
        Log.i("LM", "on Start")
        Toast.makeText(this, "on Start", Toast.LENGTH_LONG).show()
    }

    override fun onResume() {
        super.onResume()
        Log.i("LM", "on Resume")
        Toast.makeText(this, "on Resume", Toast.LENGTH_LONG).show()
    }

    override fun onPause() {
        super.onPause()
        Log.i("LM", "on Pause")
        Toast.makeText(this, "on Pause", Toast.LENGTH_LONG).show()
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.i("LM", "on Destroy")
        Toast.makeText(this, "on Destroy", Toast.LENGTH_LONG).show()
    }
}
