package com.alkchimovich.warsawrotbart

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_game.*

class GameActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val story = Story(this)

        btnGame1.setOnClickListener(){

            story.selectPosition(story.nextPosition1)
        }
        btnGame2.setOnClickListener(){

            story.selectPosition(story.nextPosition2)
        }
        btnGame3.setOnClickListener(){

            story.selectPosition(story.nextPosition3)
        }

        story.startingPoint()

    }
}