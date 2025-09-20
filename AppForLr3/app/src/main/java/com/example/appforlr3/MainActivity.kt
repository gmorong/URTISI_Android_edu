package com.example.appforlr3

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    private var count_but: Int = 0
    private var count_img: Int = 0

    private lateinit var textView_img: TextView
    private lateinit var textView_but: TextView
    private lateinit var button_c: Button
    private lateinit var button_h: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView_but = findViewById(R.id.view_count)
        textView_img = findViewById(R.id.view_img)
        button_c = findViewById(R.id.button_count)
        button_h = findViewById(R.id.button_hi)

        var imageView: ImageView = findViewById(R.id.imageView)

        imageView.setOnClickListener {
            textView_img.text = "${++count_img}"
        }

        button_c.setOnClickListener {
            textView_but.text = "${++count_but}"
        }

        button_h.setOnClickListener {
            textView_but.text = "Hi!"
        }
    }
}