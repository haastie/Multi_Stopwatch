package com.example.android.multistopwatch

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log.d
import android.view.View
import android.widget.Button
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val quickStartButton: Button = findViewById(R.id.quickstart_button)
        quickStartButton.setOnClickListener{
            quickStart()
        }
        val newSessionButton: Button = findViewById(R.id.new_session_button)
        newSessionButton.setOnClickListener{
            createNewSession()
        }
        val resutsButton: Button = findViewById(R.id.results_button)
        resutsButton.setOnClickListener{
            loadResults()
        }
      }

    private fun loadResults() {
        Toast.makeText(this, "Load results", Toast.LENGTH_SHORT).show()
    }

    private fun createNewSession() {
        Toast.makeText(this, "Creating New Session", Toast.LENGTH_SHORT).show()
    }

    private fun quickStart() {
        Toast.makeText(this, "Quick start", Toast.LENGTH_SHORT).show()
    }
}



