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

        findViewById<ImageButton>(R.id.play).setOnClickListener {
            findViewById<ImageButton>(R.id.play).visibility=View.INVISIBLE
            findViewById<ImageButton>(R.id.pause).visibility=View.VISIBLE
            isPlaying=true
        }
        findViewById<ImageButton>(R.id.pause).setOnClickListener {
            findViewById<ImageButton>(R.id.pause).visibility=View.INVISIBLE
            findViewById<ImageButton>(R.id.play).visibility=View.VISIBLE
            isPlaying=false
        }
    }
    override fun onResume() {
        super.onResume()
        if(isPlaying){
            findViewById<ImageButton>(R.id.play).visibility=View.INVISIBLE
            findViewById<ImageButton>(R.id.pause).visibility=View.VISIBLE
        }else{
            findViewById<ImageButton>(R.id.pause).visibility=View.INVISIBLE
            findViewById<ImageButton>(R.id.play).visibility=View.VISIBLE
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

