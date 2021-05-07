package com.alkchimovich.warsawrotbart

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        buttonStart.setOnClickListener(){
            val Intent = Intent(this, GameActivity::class.java)
            startActivity(Intent)
        }
    }
    override fun onBackPressed() {
        AlertDialog.Builder(this).apply {
            setTitle("Подтверждение")
            setMessage("Вы уверены, что хотите выйти из игры?")

            setPositiveButton("Таки да") { _, _ ->
                super.onBackPressed()
            }

            setNegativeButton("Нет"){_, _ ->
                // if user press no, then return the activity
                Toast.makeText(this@MainActivity, "Thank you",
                    Toast.LENGTH_SHORT).show()
            }
            setCancelable(true)
        }.create().show()
    }
}