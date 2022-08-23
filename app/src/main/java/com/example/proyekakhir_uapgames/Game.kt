package com.example.proyekakhir_uapgames

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Game(
    var name: String = "",
    var detail_kat: String = "",
    var photo: Int = 0,
    var img_game:Int=0,
    var dev:String="",
    var pub:String="",
    var releas:String="",
    var detail_game_dec:String=""
):Parcelable

