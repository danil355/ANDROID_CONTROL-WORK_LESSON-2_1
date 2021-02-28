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
    var user: EditText? = null
    var email: EditText? = null
    var password: EditText? = null
    var confirmPassword: EditText? = null
    var textView: TextView? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initializeViews()
        initializeLiseners()
    }

    fun initializeViews() {
        button = findViewById(R.id.button_registration)
        user = findViewById(R.id.edittext_user)
        email = findViewById(R.id.field_email)
        password = findViewById(R.id.field_password)
        confirmPassword = findViewById(R.id.confirm_password)
        textView = findViewById(R.id.textview)
    }

    @SuppressLint("SetTextI18n")
    fun initializeLiseners() {
        val str1 = password?.text
        val str2 = confirmPassword?.text
        val name = user?.text
        val email = email?.text
        button?.setOnClickListener {

            if (name != null) {
                if(name.contains("[0-9a-zA-Z]")) {
                    textView?.setText("Ваше имя не содержит либо буквы либо цифры")
                }

            }

            if(name.isNullOrEmpty() || email.isNullOrEmpty())
            {
                textView?.setText("Ваше имя или email не заполнено!")
            }

            if(str1 != str2)
            {
                textView?.setText("Ваши пароли не совпадают!")
            }

            else textView?.setText("Вы успешно зарегистрированы!")

        }

    }

}

