package com.example.proyekakhir_uapgames

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import android.widget.ImageView
import android.widget.TextView

class detail_game : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_game)
        val actionBar = supportActionBar
        if (actionBar != null) {
            actionBar.setDisplayHomeAsUpEnabled(true)
        }


        val user = intent.getParcelableExtra<Game>("user")
        val imag = findViewById<ImageView>(R.id.img_detail_game)
        val title = findViewById<TextView>(R.id.tv_detail)
        val develp= findViewById<TextView>(R.id.tv_dev)
        val publish= findViewById<TextView>(R.id.tv_pub)
        val realase= findViewById<TextView>(R.id.tv_detaiL_release)
        val decription = findViewById<TextView>(R.id.detail_game)
        title.text=user?.name
        imag.setImageResource(user?.img_game!!)
        develp.text= user.dev
        publish.text= user.pub
        realase.text= user.releas
        decription.text= user.detail_game_dec

    }


    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        when(item.itemId){
            android.R.id.home->{
                finish()
            }
        }
        return super.onOptionsItemSelected(item)
    }
}