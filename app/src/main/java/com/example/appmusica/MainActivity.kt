package com.example.appmusica

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.ImageButton

class MainActivity : AppCompatActivity() {

    private var isPlaying=false
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val buttonPlay: ImageButton = findViewById(R.id.play)
        val buttonPause: ImageButton = findViewById(R.id.pause)


        buttonPlay.setOnClickListener {
            buttonPlay.visibility=View.INVISIBLE
            buttonPause.visibility=View.VISIBLE
            isPlaying=true
        }
        buttonPause.setOnClickListener {
            buttonPause.visibility=View.INVISIBLE
            buttonPlay.visibility=View.VISIBLE
            isPlaying=false
        }

        }
    override fun onResume() {
        super.onResume()
        val buttonPlay: ImageButton = findViewById(R.id.play)
        val buttonPause: ImageButton = findViewById(R.id.pause)

        if(isPlaying){
            buttonPlay.visibility=View.INVISIBLE
            buttonPause.visibility=View.VISIBLE
        }else{
            buttonPause.visibility=View.INVISIBLE
            buttonPlay.visibility=View.VISIBLE
        }
    }

    override fun onSaveInstanceState(outState: Bundle) {
        super.onSaveInstanceState(outState)
        outState.putBoolean("estado",isPlaying)
    }

    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
        super.onRestoreInstanceState(savedInstanceState)
        isPlaying=savedInstanceState.getBoolean("estado")

    }
}

