package com.polstat.ppk_intent

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class SecondActivity : AppCompatActivity() {

    private lateinit var firstName: TextView
    private lateinit var lastName: TextView
    private lateinit var age: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        firstName = findViewById(R.id.firstNameAns)
        lastName = findViewById(R.id.lastNameAns)
        age = findViewById(R.id.ageAns)

        firstName.text = getString(R.string.answer_first_name, intent.getStringExtra("firstName"))
        lastName.text = getString(R.string.answer_last_name, intent.getStringExtra("lastName"))
        age.text = getString(R.string.answer_age, intent.getStringExtra("age"))
    }
}