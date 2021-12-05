package com.example.heloworld

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity : AppCompatActivity() {

    var clickCount = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val clickCountDisplayView = findViewById < TextView>(R.id.ClickCountView)
        val REDButton = findViewById < TextView>(R.id.clickButton)
        val BLUEButton = findViewById<TextView>(R.id.clickButton2)
        val GREENButton = findViewById < TextView>(R.id.clickButton3)

        REDButton.setOnClickListener {

            clickCountDisplayView.text = "Red was clicked"
        }

            BLUEButton.setOnClickListener {

                clickCountDisplayView.text = "BLUE was Clicked"
            }

                GREENButton.setOnClickListener {

                    clickCountDisplayView.text ="GREEN was Clicked"
                }
            }
        }

