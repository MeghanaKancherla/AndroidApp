package com.capgemini.androidapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    fun onClicking(view: View){
        Toast.makeText(this, "Button  is clicked!", Toast.LENGTH_LONG).show()
    }

    val TAG = "MainActivity"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d(TAG, "onCreate called")

        val b1 = findViewById<Button>(R.id.button2)

        b1.setOnClickListener {
            Toast.makeText(this, "Next button is pressed!", Toast.LENGTH_LONG).show()
            val i: Intent = Intent(this, MainActivity2::class.java)
            startActivity(i)
        }
        // One time execution
        // Long running tasks shouldn't be put under onCreate() method
        // respond within 5 sec - ANR (Application not responding) dialog
    }

    override fun onStart() {
        super.onStart()
        Log.d(TAG,"onStart is called")
    }

    override fun onResume() {
        super.onResume()
        Log.d(TAG, "onResume is called")
    }

    override fun onPause() {
        // save data - persistance
        super.onPause()
        Log.d(TAG, "onPause is called")
    }

    override fun onStop() {
        super.onStop()
        Log.d(TAG, "onStop is called")
    }

    override fun onDestroy() {
        super.onDestroy()
        Log.d(TAG, "onDestroy is called")
    }

    override fun onRestart() {
        super.onRestart()
        Log.d(TAG, "onRestart is called")
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        // put data in bundle
    }

    var count = 0
    override fun onBackPressed() {
        count ++

        if(count == 2){
            super.onBackPressed()
        }
        else
        {
            Toast.makeText(this,"Press Back again to exit",Toast.LENGTH_LONG).show()
        }
    }
}


