package com.example.proyekakhir_uapgames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.Button

class about : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_about)


        var actionBar = supportActionBar



        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }
    }

}