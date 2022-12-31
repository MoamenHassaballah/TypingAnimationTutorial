package com.moaapps.typinganimationtutorial

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val textView = findViewById<TextView>(R.id.text)
        val label = "MOAAPPS Typing Animation Tutorial"
        val stringBuilder = StringBuilder()

        Thread{
            for (letter in label){
                stringBuilder.append(letter)
                Thread.sleep(50)
                runOnUiThread {
                    textView.text = stringBuilder.toString()
                }
            }
        }.start()
    }
}