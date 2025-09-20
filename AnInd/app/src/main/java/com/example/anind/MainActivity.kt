package com.example.anind

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.CountDownTimer
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val imgR: ImageView = findViewById(R.id.rightE)
        val anim3: Animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
        imgR.startAnimation(anim3)

        val imgL: ImageView = findViewById(R.id.leftE)
        val anim4: Animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
        imgL.startAnimation(anim4)

        val txt: TextView = findViewById(R.id.textView)
        val anim1: Animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
        txt.startAnimation(anim1)

        val img: ImageView = findViewById(R.id.imageView)
        val anim2: Animation = AnimationUtils.loadAnimation(this, R.anim.bounce)
        img.startAnimation(anim2)

        val eyeAnimation1: Animation = AnimationUtils.loadAnimation(this, R.anim.eyes)
        val eyeAnimation2: Animation = AnimationUtils.loadAnimation(this, R.anim.eyes2)

        val timer = object: CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long){
            }

            override fun onFinish() {
                imgR.startAnimation(eyeAnimation1)
                imgL.startAnimation(eyeAnimation1)
            }
        }
        timer.start()

        val timer2 = object: CountDownTimer(6000, 1000) {
            override fun onTick(millisUntilFinished: Long){
            }

            override fun onFinish() {
                imgR.startAnimation(eyeAnimation2)
                imgL.startAnimation(eyeAnimation2)
            }
        }
        timer2.start()

    }
}