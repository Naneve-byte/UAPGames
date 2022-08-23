package com.example.proyekakhir_uapgames

import android.view.LayoutInflater
import android.view.OnReceiveContentListener
import android.view.View
import android.view.ViewGroup

import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast

import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions

class CardViewGamesAdapter(
    private val ListGame: ArrayList<Game>,
    private val listener: (Game)->Unit

    ) : RecyclerView.Adapter<CardViewGamesAdapter.CardViewViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewViewHolder {
        val view: View = LayoutInflater.from(parent.context).inflate(R.layout.card_item, parent, false)
        return CardViewViewHolder(view)
    }

    override fun onBindViewHolder(holder: CardViewViewHolder, position: Int) {
        val GAME = ListGame[position]
        Glide.with(holder.itemView.context)
            .load(GAME.photo)
            .apply(RequestOptions().override(350, 550))
            .into(holder.imgPhoto)
        holder.tvName.text = GAME.name
        holder.tvDetail.text=GAME.detail_kat
        holder.itemView.setOnClickListener {
            listener(ListGame[position])
            Toast.makeText(holder.itemView.context, "Kamu memilih " + ListGame[position].name, Toast.LENGTH_SHORT).show()
        }



    }

    override fun getItemCount()=ListGame.size


    inner class CardViewViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var imgPhoto: ImageView = itemView.findViewById(R.id.image_item)
        var tvName: TextView = itemView.findViewById(R.id.item_game_nama)
        var tvDetail: TextView=itemView.findViewById(R.id.item_game_Detail)

    }
}