package com.example.mylinearapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initViews()
    }

    fun initViews() {
        val push = findViewById<Button>(R.id.b_push)
        push.setOnClickListener {
            openNextPage() }
    }

    fun openNextPage(){
        val intent = Intent(this, DetailActivity::class.java)
        startActivity(intent)
    }
}