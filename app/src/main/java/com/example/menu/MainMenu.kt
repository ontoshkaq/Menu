package com.example.menu

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity

class MainMenu : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Continue
        val continue_game = findViewById<Button>(R.id.b_continue)
        continue_game.setOnClickListener{
            val perehod = Intent(this, Continue::class.java )
            startActivity(perehod)
        }

        //New Game
        val new_game = findViewById<Button>(R.id.b_newgame)
        new_game.setOnClickListener{
            val peregod = Intent(this, NewGame::class.java )
            startActivity(peregod)


        }


        //LoadGame
        val load_game = findViewById<Button>(R.id.b_loadgame)
        load_game.setOnClickListener{
            val perehod = Intent(this, LoadGame::class.java )
            startActivity(perehod)



    //Settings
            val game_settings = findViewById<Button>(R.id.b_settings)
            new_game.setOnClickListener{
                val perehod = Intent(this, GameSettings::class.java )
                startActivity(perehod)

//
//
//
    }
}}}