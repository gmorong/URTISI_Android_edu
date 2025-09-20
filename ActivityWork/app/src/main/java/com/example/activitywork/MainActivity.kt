package com.example.activitywork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.LinearLayout
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val but_s: Button = findViewById(R.id.button_start)
        var layer: LinearLayout = findViewById(R.id.linearLayout2)


        layer.setBackgroundResource(R.drawable.kruglie_ugli)

        but_s.setOnClickListener{
            startMe(but_s)
        }
    }

    fun startMe(view: View) {
        val sIntent = Intent(this, Activity1::class.java)
        startActivity(sIntent)
    }
}