package com.example.activitywork

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.Random

class Activity2 : AppCompatActivity() {

    private lateinit var but_change: Button
    private lateinit var but_exit: Button
    private lateinit var but_aplly: Button
    private lateinit var but_yes: Button
    private lateinit var but_no: Button

    private lateinit var text_label: TextView
    private lateinit var textView_indicate: TextView
    private lateinit var textView_from: TextView
    private lateinit var textView_before: TextView
    private lateinit var textView_answer: TextView
    private lateinit var textView_answerq: TextView

    private lateinit var edit_before: EditText
    private lateinit var edit_from: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_2)

        var from : Int
        var before : Int

        but_change = findViewById(R.id.but_change)
        but_exit = findViewById(R.id.but_exit)
        but_aplly = findViewById(R.id.but_apply)
        but_yes = findViewById(R.id.button_yes)
        but_no = findViewById(R.id.button_no)

        text_label = findViewById(R.id.textView_label)
        textView_indicate = findViewById(R.id.textView_indicaterange)
        textView_from = findViewById(R.id.textView_from)
        textView_before = findViewById(R.id.textView_before)
        textView_answer = findViewById(R.id.textView_answer)
        textView_answerq = findViewById(R.id.textView_answeq)

        edit_from = findViewById(R.id.editText_from)
        edit_before = findViewById(R.id.editText_before)

        text_label.setBackgroundResource(R.drawable.kruglie_ugli)
        textView_from.setBackgroundResource(R.drawable.kruglie_ugli)
        textView_before.setBackgroundResource(R.drawable.kruglie_ugli)
        textView_answerq.setBackgroundResource(R.drawable.kruglie_ugli)

        but_exit.setOnClickListener {
            butExit()
        }

        but_aplly.setOnClickListener {
            from = Integer.parseInt(edit_from.text.toString())
            before = Integer.parseInt(edit_before.text.toString()) +1
            guessApply(from, before)
        }

        but_yes.setOnClickListener {
            butYes()
        }

        but_no.setOnClickListener {
            from = Integer.parseInt(edit_from.text.toString())
            before = Integer.parseInt(edit_before.text.toString()) + 1
            guessApply(from, before)
        }

        but_change.setOnClickListener {
            butChange()
        }

    }

    fun butExit (){
        val exitIntent = Intent(this, MainActivity::class.java)
        startActivity(exitIntent)
    }

    fun butChange(){
        val exitIntent = Intent(this, Activity1::class.java)
        startActivity(exitIntent)
    }

    fun butYes (){
        setContentView(R.layout.activity_2)
    }

    fun guessApply (
        f : Int,
        b : Int,
    ){
        val random : Int = kotlin.random.Random.nextInt(f,b)
        textView_answerq.text = random.toString()
    }
}