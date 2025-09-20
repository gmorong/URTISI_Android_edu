package com.example.emotionapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*

class MainActivity : AppCompatActivity() {

    private lateinit var textView3: TextView
    private lateinit var textView2: TextView
    private lateinit var seekBar: SeekBar
    private lateinit var linearLayout: LinearLayout


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        textView3 = findViewById(R.id.textView3)
        textView2 = findViewById(R.id.textView2)
        seekBar = findViewById(R.id.seekBar)
        linearLayout = findViewById(R.id.linearLayout)

        var imageView: ImageView = findViewById(R.id.imageEm)
        var sint: Int = 0
        var stxt: String
        var imageButton : ImageButton = findViewById(R.id.imageButton)
        var editText: EditText = findViewById(R.id.editTextTextPersonName)

        seekBar.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(p0: SeekBar?, p1: Int, p2: Boolean) {
                sint = p1
                stxt = p1.toString()
                textView2.text = "Оцените Ваше настроение: $stxt"
            }

            override fun onStartTrackingTouch(p0: SeekBar?) {
            }

            override fun onStopTrackingTouch(p0: SeekBar?) {
            }
        })

        imageButton.setOnClickListener {
            if (editText.text.isEmpty()) {
                textView3.text = "Hello, friend";
            } else {
                textView3.text = "Hello, " + editText.text
            }
            if (sint < 33){
                imageView.setImageResource(R.drawable.sad)
            }else if (sint > 66){
                imageView.setImageResource(R.drawable.happy)
            }else{
                imageView.setImageResource(R.drawable.siple)
            }
        }
    }
}