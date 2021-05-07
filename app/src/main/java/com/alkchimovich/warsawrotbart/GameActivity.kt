package com.alkchimovich.warsawrotbart

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.appcompat.app.AlertDialog
import kotlinx.android.synthetic.main.activity_game.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*

class GameActivity : AppCompatActivity() {

    @SuppressLint("ResourceType")
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
    override fun onBackPressed() {
        AlertDialog.Builder(this).apply {
            setTitle("Подтверждение")
            setMessage("Вы уверены, что хотите вернутся в начало игры?")

            setPositiveButton("Таки да") { _, _ ->
               finish()
            }

            setNegativeButton("Нет"){_, _ ->
                // if user press no, then return the activity
                Toast.makeText(this@GameActivity, "Продолжаем играть",
                    Toast.LENGTH_SHORT).show()
            }
            setCancelable(true)
        }.create().show()
    }

}



