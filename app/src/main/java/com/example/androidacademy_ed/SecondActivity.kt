package com.example.androidacademy_ed

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val transmittedString = intent.getStringExtra(TRANSMITTED_STRING)
        val transmittedInt = intent.getIntExtra(TRANSMITTED_INT, -1)
        val transmittedBoolean = intent.getBooleanExtra(TRANSMITTED_BOOLEAN, false)

        second_activity_text_view.text = "These values were passed from previous screen: transmittedString: $transmittedString\n transmittedInt: $transmittedInt\n transmittedBoolean: $transmittedBoolean"
    }

    companion object{
        const val TRANSMITTED_STRING = "transmittedString"
        const val TRANSMITTED_INT = "transmittedInt"
        const val TRANSMITTED_BOOLEAN = "transmittedBoolean"
    }
}
