package com.example.app_kotlin

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.whkf.st.HelloWorld

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val multiplyValue = HelloWorld().multiply(5, 6);
    }
}