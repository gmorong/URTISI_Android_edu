package com.example.activitywork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class Activity1 : AppCompatActivity() {

    private lateinit var but_change: Button
    private lateinit var but_exit: Button
    private lateinit var but_aplly: Button
    private lateinit var but_set: Button

    private lateinit var text_label: TextView
    private lateinit var textView_indicate: TextView
    private lateinit var textView_from: TextView
    private lateinit var textView_before: TextView
    private lateinit var textView_answer: TextView

    private lateinit var edit_before: EditText
    private lateinit var edit_from: EditText
    private lateinit var edit_set: EditText

    private var num : Int = 0
    private var ans : Int = 0

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_1)

        var from : Int
        var before : Int


        but_change = findViewById(R.id.but_change)
        but_exit = findViewById(R.id.but_exit)
        but_aplly = findViewById(R.id.but_apply)
        but_set = findViewById(R.id.but_set)

        text_label = findViewById(R.id.textView_label)
        textView_indicate = findViewById(R.id.textView_indicaterange)
        textView_from = findViewById(R.id.textView_from)
        textView_before = findViewById(R.id.textView_before)
        textView_answer = findViewById(R.id.textView_answeq)

        edit_from = findViewById(R.id.editText_from)
        edit_before = findViewById(R.id.editText_before)
        edit_set = findViewById(R.id.edit_set)

        text_label.setBackgroundResource(R.drawable.kruglie_ugli)
        textView_from.setBackgroundResource(R.drawable.kruglie_ugli)
        textView_before.setBackgroundResource(R.drawable.kruglie_ugli)
        textView_answer.setBackgroundResource(R.drawable.kruglie_ugli)

        but_change.setOnClickListener {
            butChange()
        }

        but_exit.setOnClickListener {
            butExit()
        }

        but_aplly.setOnClickListener {
            from = Integer.parseInt(edit_from.text.toString())
            before = Integer.parseInt(edit_before.text.toString()) +1
            guessApply(from, before)
        }
        but_set.setOnClickListener {
            ans = Integer.parseInt(edit_set.text.toString())
            setAplly()
        }
    }

    fun butExit (){
        val exitIntent = Intent(this, MainActivity::class.java)
        startActivity(exitIntent)
    }

    fun butChange(){
        val changeIntent = Intent(this, Activity2::class.java)
        startActivity(changeIntent)
    }

    fun guessApply (
        f : Int,
        b : Int,
    ){
        num = kotlin.random.Random.nextInt(f,b)
    }

    fun setAplly(){
        if (num == ans){
            textView_answer.text = "Yes!"

            val handler = android.os.Handler()
            handler.postDelayed({ setContentView(R.layout.activity_1) }, 2000)
        }else{
            textView_answer.text = "No!"
        }
    }
}