package com.example.simplebuttonapplication

import android.view.View
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class ExternalClassListener : View.OnClickListener {
    override fun onClick(view: View?) {
        val context : AppCompatActivity = view!!.context as AppCompatActivity
        context.findViewById<TextView>(R.id.textView4).text = "OnClick Event - External Class"
    }
}
