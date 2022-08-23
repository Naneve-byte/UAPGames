package com.example.proyekakhir_uapgames

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private lateinit var kartugames:RecyclerView
    private var list: ArrayList<Game> = arrayListOf()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        kartugames= findViewById(R.id.kartu_game)
        kartugames.setHasFixedSize(true)



        list.addAll(Data_Games.listData)
        showRecyclerList()


    }
    private fun showRecyclerList(){
        kartugames.layoutManager=LinearLayoutManager(this)
        val cardViewgameAdapter=CardViewGamesAdapter(list){data ->
            Intent(this,detail_game::class.java).apply {
                putExtra("user",data)
                startActivities(arrayOf(this))
            }
        }
        kartugames.adapter=cardViewgameAdapter
    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        menuInflater.inflate(R.menu.about,menu)
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val intent=Intent(this,about::class.java)
        startActivity(intent)
        return super.onOptionsItemSelected(item)
    }
}