package com.example.app_menu

import android.graphics.Color
import android.graphics.drawable.ColorDrawable
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import android.widget.PopupMenu
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imageView : ImageView = findViewById(R.id.imageView)
        val textView : TextView = findViewById(R.id.textView)
        val button : Button = findViewById(R.id.button)

        var size : Float = 30f
        textView.textSize = size

        textView.setBackgroundResource(R.drawable.krug)
        imageView.setBackgroundResource(R.drawable.krug)

        val popupMenu = androidx.appcompat.widget.PopupMenu(this, imageView)
        popupMenu.inflate(R.menu.popupmenu)
        popupMenu.setOnMenuItemClickListener {
            when (it.itemId)
            {
                R.id.menu1 -> {
                    textView.text = "Clicked popupmenu 1"
                    true
                }
                R.id.menu2 -> {
                    textView.text = "Clicked popupmenu 2"
                    true
                }
                R.id.menu3 -> {
                    textView.text = "Clicked popupmenu 3"
                    true
                }
                else -> false
            }
        }

        val popupMenu2 = PopupMenu(this, button)
        popupMenu2.inflate(R.menu.popupmenu2)
        popupMenu2.setOnMenuItemClickListener {
            when (it.itemId) {
                R.id.red -> {
                    textView.background = ColorDrawable(Color.RED)
                    textView.text = "Red color"
                }
                R.id.yellow -> {
                    textView.background = ColorDrawable(Color.YELLOW)
                    textView.text = "Yellow color"
                }
                R.id.green -> {
                    textView.background = ColorDrawable(Color.GREEN)
                    textView.text = "Green color"
                }
            }
            false
        }
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            popupMenu2.setForceShowIcon(true)
        }

        val popupMenu3 = PopupMenu(this, textView)
        popupMenu3.inflate(R.menu.popupmenu3)
        popupMenu3.setOnMenuItemClickListener {
            when (it.itemId)
            {
                R.id.action1 -> {
                    textView.textSize = 20f
                    true
                }
                R.id.action2 -> {
                    textView.textSize = 30f
                    true
                }
                R.id.action3 -> {
                    textView.textSize = 40f
                    true
                }
                else -> false
            }
        }

        textView.setOnClickListener{
            popupMenu3.show()
        }

        button.setOnClickListener{
            popupMenu2.show()
        }


        imageView.setOnClickListener{
            popupMenu.show()
        }
    }
}