package com.zubet.challengeroom1_anindya

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }
    fun createbutton(view: View){
        val ganti = Intent(this,EditActivity::class.java)
        startActivity(ganti)
    }
}