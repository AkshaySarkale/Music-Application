package com.example.homepage

import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        changeTheam()
        Toast.makeText(this,"This App In Under A Development Phase:)",Toast.LENGTH_LONG).show();
    }
    fun changeTheam()
    {
        val  theambtn=findViewById<Button>(R.id.theambtn);
        theambtn.setOnClickListener {
            Toast.makeText(this,"Checking For Updates",Toast.LENGTH_SHORT).show();
        }
    }
}