package com.example.analitics

import android.graphics.PorterDuff
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MotionEvent
import android.view.View
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import kotlinx.android.synthetic.*
import kotlinx.android.synthetic.main.activity_main.*

private var counter: Int = 0
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        

        press_f.setOnClickListener {
            enter.text = "count: ${++counter}"

        }
        bodo4.setOnClickListener {
            Toast.makeText(this, "Hi there", Toast.LENGTH_LONG).show()
        }

    }

}