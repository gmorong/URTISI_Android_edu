package com.example.appmenu

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView : TextView = findViewById(R.id.textView)
        textView.setBackgroundResource(R.drawable.krug)
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        var inflater = menuInflater
        inflater.inflate(R.menu.menu_main, menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val textView : TextView = findViewById(R.id.textView)
        when (item.itemId){
            R.id.action1 -> {
                textView.text = "Purple"
                val wallpaper : ConstraintLayout = findViewById(R.id.wallpaper)
                wallpaper.setBackgroundColor(resources.getColor(R.color.purple))
                return true
            }
            R.id.action2 -> {
                textView.text = "Yellow"
                val wallpaper : ConstraintLayout = findViewById(R.id.wallpaper)
                wallpaper.setBackgroundColor(resources.getColor(R.color.yellow))
                return true
            }
            R.id.action3 -> {
                textView.text = "Blue"
                val wallpaper : ConstraintLayout = findViewById(R.id.wallpaper)
                wallpaper.setBackgroundColor(resources.getColor(R.color.blue))
                return true
            }
        }
        return super.onOptionsItemSelected(item)
    }

}