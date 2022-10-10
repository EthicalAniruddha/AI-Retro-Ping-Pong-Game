package com.retro.ethical.aniruddha.pingpong.ui

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import com.retro.ethical.aniruddha.pingpong.R

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)
    }

    fun startGame(view: View?) {
        val intent = Intent(this@GameActivity, PongActivity::class.java)
        startActivity(intent)
    }


}