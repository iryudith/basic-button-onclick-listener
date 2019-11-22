package com.example.simplebuttonapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.TextView

class MainActivity : AppCompatActivity(), View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // direct function example
        val btn1 : Button = findViewById<Button>(R.id.button)
        btn1.setOnClickListener {
            findViewById<TextView>(R.id.textView).text = "OnClick Event - Direct Function"
        }


        // onClick property example
        // direct assign from view property


        // activity implement interface example
        val btn3 : Button = findViewById<Button>(R.id.button3)
        btn3.setOnClickListener(this)


        // external class
        val btn4 : Button = findViewById<Button>(R.id.button4)
        btn4.setOnClickListener(ExternalClassListener())
    }


    fun propertyOnClick (view : View) {
        findViewById<TextView>(R.id.textView2).text = "OnClick Event - OnClick Property"
    }

    override fun onClick(p0: View?) {
        findViewById<TextView>(R.id.textView3).text = "OnClick Event - Activity Implement Interface"
    }
}
