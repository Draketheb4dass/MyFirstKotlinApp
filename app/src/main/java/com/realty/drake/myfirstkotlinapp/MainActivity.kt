package com.realty.drake.myfirstkotlinapp

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


    }
    fun toastMe(view: View) {
        val myToast = Toast.makeText(this, "Toasted!", Toast.LENGTH_LONG )
        myToast.show()
    }

    fun countMe(view: View){
        //Get the view
        val showCountTextView = findViewById<TextView>(R.id.tvNumber)

        //get the value of the textview
        val countString = showCountTextView.text.toString()

        //convert value to a number and increment it
        var count: Int = Integer.parseInt(countString)
        count++

        //display the value
        showCountTextView.text = count.toString()
    }
}
