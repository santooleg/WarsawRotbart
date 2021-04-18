package com.alkchimovich.warsawrotbart

import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ScrollView
import android.widget.TextView
import androidx.annotation.RequiresApi
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_main.view.*

class GameActivity : AppCompatActivity() {

    @RequiresApi(Build.VERSION_CODES.Q)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game)

        val story = Story(this)




        btnGame1.setOnClickListener {

            story.selectPosition(story.nextPosition1)
            findViewById<ScrollView>(R.id.scrollView).scrollToDescendant(textTitle)
        }
        btnGame2.setOnClickListener {

            story.selectPosition(story.nextPosition2)
            findViewById<ScrollView>(R.id.scrollView).scrollToDescendant(textTitle)
        }
        btnGame3.setOnClickListener {

            story.selectPosition(story.nextPosition3)
            findViewById<ScrollView>(R.id.scrollView).scrollToDescendant(textTitle)
        }

        story.startingPoint()

    }

}



