package com.example.james.spinner

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.widget.Spinner
import android.widget.TextView


class SpinnerActivity : AppCompatActivity() {

    lateinit var option : Spinner
    lateinit var result : TextView

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

    }
}