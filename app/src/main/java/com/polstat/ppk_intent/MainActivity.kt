package com.polstat.ppk_intent

import android.app.SearchManager
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.Settings
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {

    private lateinit var btn1: Button
    private lateinit var btn2: Button
    private lateinit var btn3: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btn1 = findViewById(R.id.button1)
        btn2 = findViewById(R.id.button2)
        btn3 = findViewById(R.id.button3)
    }

    fun btnClick(view: View) {
        val tlp = Intent(Intent.ACTION_DIAL, Uri.parse("tel:081234567899"))
        startActivity(tlp)
    }

    fun btn2Click(view: View) {
        val setting = Intent(Settings.ACTION_SETTINGS)
        startActivity(setting)
        Toast.makeText(this, "you have pressed: ${btn2.text}", Toast.LENGTH_LONG).show()
    }

    fun btn3Click(view: View) {
        val search = Intent(Intent.ACTION_WEB_SEARCH)
        search.putExtra(SearchManager.QUERY, "intent android")
        startActivity(search)
    }

    fun btn4Click(view: View) {
        val myIntent = Intent()
        myIntent.setType("audio/mp3")
        myIntent.setAction(Intent.ACTION_GET_CONTENT)
        startActivity(myIntent)
    }

    fun btn5Click(view: View) {
        val switchActivityIntent = Intent(this, FirstActivity::class.java)
        startActivity(switchActivityIntent)
    }
}