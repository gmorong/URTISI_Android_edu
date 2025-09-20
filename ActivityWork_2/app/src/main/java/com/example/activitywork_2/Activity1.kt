package com.example.activitywork_2

import android.content.Context
import android.content.Intent
import android.content.SharedPreferences
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.TextView
import android.widget.Toast
import androidx.constraintlayout.widget.ConstraintLayout

class Activity1 : AppCompatActivity() {

    var colors = arrayOf(0xFFB799DB, 0xFFD6B79D, 0xFF9BE4B0, 0xFFAEC8F4)
    val text by lazy { findViewById<EditText>(R.id.text) }
    var sheetNumber = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity1)

        var size : Float = 25f
        text.textSize = size

        var textView : TextView = findViewById(R.id.textView)
        textView.setBackgroundResource(R.drawable.krug)

        sheetNumber = intent.getIntExtra("sheetNumber", 0)

        val next: Button = findViewById(R.id.next)
        val but_p : Button = findViewById(R.id.but_p)
        val but_m : Button = findViewById(R.id.but_m)

        next.setOnClickListener{
            if (sheetNumber < colors.size -1){
                val intent = Intent(this, this::class.java)
                intent.putExtra("sheetNumber", sheetNumber + 1)
                startActivity(intent)
            } else {
                Toast.makeText(applicationContext, "that's all", Toast.LENGTH_SHORT).show()
            }
        }

        but_p.setOnClickListener {
            if (size < 30f){
                size += 1f
                text.textSize = size
            }
        }

        but_m.setOnClickListener {
            if (size > 20f){
                size -= 1f
                text.textSize = size
            }
        }
    }

    override fun onPause() {
        super.onPause()
        val prefs : SharedPreferences.Editor = getPreferences(Context.MODE_PRIVATE).edit()

        prefs.putString("note2", text.editableText.toString())
        prefs.apply()
    }

    override fun onResume(){
        super.onResume()
        val sheet : ConstraintLayout = findViewById<ConstraintLayout>(R.id.sheet)
        sheet.setBackgroundColor(colors[sheetNumber].toInt())
        val saveState : String? =
            getPreferences(Context.MODE_PRIVATE).getString("note1", null)
        if (saveState != null){
            text.setText(saveState)
        }
    }
}

