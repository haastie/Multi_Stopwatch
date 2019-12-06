package com.example.android.multistopwatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

      quickstart.setOnClickListener {
         d ( "Test", "quickstart pressed")
          startActivity(Intent(this, quickstart::class.java ))
          //Klik op de knop: quickstart om naar het volgend scherm te gaan
      }
    }
}
