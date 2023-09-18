package com.example.appmusica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonPlay: ImageButton = findViewById(R.id.play)
        val buttonPause: ImageButton = findViewById(R.id.pause)


        buttonPlay.setOnClickListener {
            buttonPlay.visibility=View.INVISIBLE
            buttonPause.visibility=View.VISIBLE
        }
        buttonPause.setOnClickListener {
            buttonPause.visibility=View.INVISIBLE
            buttonPlay.visibility=View.VISIBLE
        }

        }
}

