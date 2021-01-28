package com.example.menu

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class LoadGame : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_load_game)

        val back_button = findViewById<Button>(R.id.b_back)
        back_button.setOnClickListener{
            val perehod = Intent(this, MainMenu::class.java )
            startActivity(perehod)
    }
}}