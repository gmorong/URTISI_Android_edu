package com.example.colorshifts

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button_purp : Button = findViewById(R.id.button_purp)
        val button_lgreen : Button = findViewById(R.id.button_lgreen)
        val button_tif : Button = findViewById(R.id.button_tif)
        val button_pink : Button = findViewById(R.id.button_pink)
        val button_plus : Button = findViewById(R.id.button_plus)
        val button_minus : Button = findViewById(R.id.button_minus)
        val textView : TextView = findViewById(R.id.textView)
        val wallpaper : ConstraintLayout = findViewById(R.id.wallpaper)

        var size : Float = 35f

        textView.textSize = size

        button_purp.setOnClickListener {
            textView.text = "purple"
            textView.setTextColor(resources.getColor(R.color.purple))
            wallpaper.setBackgroundColor(resources.getColor(R.color.purple))
        }

        button_lgreen.setOnClickListener {
            textView.text = "light green"
            textView.setTextColor(resources.getColor(R.color.light_green))
            wallpaper.setBackgroundColor(resources.getColor(R.color.light_green))
        }

        button_tif.setOnClickListener {
            textView.text = "tiffany"
            textView.setTextColor(resources.getColor(R.color.tiffany))
            wallpaper.setBackgroundColor(resources.getColor(R.color.tiffany))
        }

        button_pink.setOnClickListener {
            textView.text = "pink"
            textView.setTextColor(resources.getColor(R.color.pink))
            wallpaper.setBackgroundColor(resources.getColor(R.color.pink))
        }

        button_plus.setOnClickListener {
            if (size < 60f){
                size += 1f
                textView.textSize = size
            }
        }

        button_minus.setOnClickListener {
            if (size > 18f){
                size -= 1f
                textView.textSize = size
            }
        }
    }
}