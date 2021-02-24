package kz.step.stepeducation182

import android.annotation.SuppressLint
import android.graphics.Color
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import java.util.regex.Matcher
import java.util.regex.Pattern

class MainActivity : AppCompatActivity() {


    var button: Button? = null
    var textView: TextView? = null
    var edittext: EditText? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeLiseners()
    }

    fun initializeViews() {
        button = findViewById(R.id.button_main_activity_press)
        textView = findViewById(R.id.textview_main_activity_text)
        edittext = findViewById(R.id.textview_main_activity_edit)
    }

    @SuppressLint("SetTextI18n")
    fun initializeLiseners() {
        val str = edittext?.text

        button?.setOnClickListener {
            val result: Boolean? = str?.any {
                it.isDigit()
            }

            textView?.append("\n" + "$result")
            if (result == true) {
                textView?.setTextColor(Color.RED)
                textView?.setText("“Error, we have digits in our name!")
            } else {
                textView?.setText("Everithing looks fine!")
            }

        }
    }
}

