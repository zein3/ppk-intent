package com.polstat.ppk_intent

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText

class FirstActivity : AppCompatActivity() {

    private lateinit var firstName: EditText
    private lateinit var lastName: EditText
    private lateinit var age: EditText

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_first)

        firstName = findViewById(R.id.firstName)
        lastName = findViewById(R.id.lastName)
        age = findViewById(R.id.age)
    }

    fun onSubmitClicked(view: View) {
        val switchIntent = Intent(this, SecondActivity::class.java)
        switchIntent.putExtra("firstName", firstName.text.toString())
        switchIntent.putExtra("lastName", lastName.text.toString())
        switchIntent.putExtra("age", age.text.toString())
        startActivity(switchIntent)
    }
}