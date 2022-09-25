package com.example.gitapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    private lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        textView = findViewById(R.id.textView)
       // textView.setText("0")
    }

    fun toastNotification(view: View){
        val tempTost = Toast.makeText(this, "Hello!", Toast.LENGTH_SHORT)
        tempTost.show()
    }

    fun countMe (view: View) {
        val countString = textView.text.toString()
        var count: Int = Integer.parseInt(countString)
        textView.text = (++count).toString()
//        val tempTost = Toast.makeText(this, count.toString(), Toast.LENGTH_SHORT)
//        tempTost.show()
    }
}