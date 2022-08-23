package com.example.proyekakhir_uapgames

import androidx.activity.ComponentActivity
import androidx.core.content.res.TypedArrayUtils.getString

object Data_Games {
    private val nama_games = arrayOf(
        "Dota 2",
        "Counter-Strike: Global Offensive",
        "Sea of Thieves",
        "Grand Theft Auto V",
        "Red Dead Redemmption 2",
        "ELDEN RING",
        "Forza Horizon 5",
        "Sid Meier’s Civilization® VI",
        "Cities: Skylines",
        "VRChat",
        "The Sims™ 4",
        "Stray",
        "NARAKA: BLADEPOINT",
        "Phoenix Wright: Ace Attorney Trilogy",
        "Doki Doki Literature Club Plus!",
        "Coffee Talk"
    )
    private val game_details_kat = arrayOf(
        "Free to Play, MOBA, Multipalyer, Strategy",
        "FPS, Shooter, Multiplayer, Competitive",
        "Adventure, Open World, Multiplayer, Pirates",
        "Open World, Action, Multiplayer, Automobile Sim",
        "Open World, Story Rich, Adventure, Western",
        "SoulS-like, Relaxing, Dark Fantasy, RPG",
        "Racing, Open World, Driving, Multiplayer",
        "Strategy, Turn-Based Strategy, Historical, Multiplayer",
        "City Builder, Simulation, Building, Management",
        "VR, Free to Play, Memes, Anime",
        "Simulation, Singleplayer, Character Customization",
        "Cats, Adventure, Cyberpunk, Cute",
        "Battle Royale, Sexual Content, multiplayer, Martial Arts",
        "Detective, Visual Novel, Story Rich, mystery",
        "Psychological Horror, Anime, Visual Novel, Dating Sim",
        "Conversation, Pixel Graphics, Atmosperic, Interactive Fiction"
    )


    private val game_details = arrayOf(
        "Every day, millions of players worldwide enter battle as one of over a hundred Dota heroes. And no matter if it's their 10th hour of play or 1,000th, there's always something new to discover. With regular updates that ensure a constant evolution of gameplay, features, and heroes, Dota 2 has taken on a life of its own.",
        "Counter-Strike: Global Offensive (CS: GO) memperluas gameplay aksi berbasis tim yang dirintisnya saat diluncurkan 19 tahun lalu. CS: GO menampilkan peta, karakter, senjata, dan mode permainan baru, dan memberikan versi terbaru dari konten CS klasik (de_dust2, dll.).",
        "Sea of Thieves menawarkan pengalaman bajak laut yang penting, mulai dari berlayar dan bertarung hingga menjelajahi dan menjarah - semua yang Anda butuhkan untuk menjalani kehidupan bajak laut dan menjadi legenda dengan hak Anda sendiri. Tanpa peran yang ditetapkan, Anda memiliki kebebasan penuh untuk mendekati dunia, dan pemain lain, apa pun yang Anda pilih.",
        "Grand Theft Auto V untuk PC menawarkan pemain pilihan untuk menjelajahi dunia pemenang penghargaan Los Santos dan Blaine County dalam resolusi hingga 4k dan lebih, serta kesempatan untuk mengalami permainan berjalan pada 60 frame per detik.",
        "Pemenang lebih dari 175 Game of the Year Awards dan penerima lebih dari 250 skor sempurna, RDR2 adalah kisah epik penjahat Arthur Morgan dan geng Van der Linde yang terkenal, dalam pelarian melintasi Amerika pada awal zaman modern. Juga termasuk akses ke dunia hidup bersama Red Dead Online.",
        "RPG AKSI FANTASI BARU. Bangkit, Ternodai, dan dibimbing oleh rahmat untuk mengacungkan kekuatan Cincin Elden dan menjadi Elden Lord di Negeri Antara.",
        "Terbang ke Horizon Hot Wheels Park yang menakjubkan secara visual di atas awan di atas Meksiko. Balap 10 mobil baru yang menakjubkan di trek tercepat dan paling ekstrem yang pernah dibuat. Rancang, bangun, dan bagikan petualangan Hot Wheels Anda sendiri. Membutuhkan game Forza Horizon 5, dijual terpisah",
        "Civilization VI adalah angsuran terbaru dalam Waralaba Peradaban pemenang penghargaan. Perluas kerajaan Anda, majukan budaya Anda, dan berhadapan langsung dengan para pemimpin terbesar dalam sejarah. Akankah peradaban Anda bertahan dalam ujian waktu?",
        "Cities: Skylines adalah versi modern dari simulasi kota klasik. Gim ini memperkenalkan elemen permainan gim baru untuk mewujudkan sensasi dan kesulitan dalam menciptakan dan memelihara kota nyata sambil memperluas beberapa kiasan pengalaman membangun kota yang mapan.",
        "Bergabunglah dengan komunitas kami yang berkembang saat Anda menjelajahi, bermain, dan membantu menyusun masa depan VR sosial. Buat dunia dan avatar khusus. Selamat datang di VRChat.",
        "Bermainlah dengan kehidupan dan temukan kemungkinannya. Bebaskan imajinasi Anda dan ciptakan dunia Sims yang sepenuhnya unik. Jelajahi dan sesuaikan setiap detail dari Sims hingga rumah–dan banyak lagi.",
        "Tersesat, sendirian dan terpisah dari keluarga, seekor kucing liar harus mengungkap misteri kuno untuk melarikan diri dari kota dunia maya yang telah lama terlupakan dan menemukan jalan pulang.",
        "NARAKA: BLADEPOINT adalah pengalaman pertempuran aksi mitos PVP hingga 60 pemain dengan pertarungan jarak dekat yang terinspirasi seni bela diri, mobilitas yang menentang gravitasi, gudang senjata jarak dekat & jarak jauh yang luas, pahlawan legendaris yang dapat disesuaikan dengan kemampuan epik - terinspirasi oleh legenda Timur Jauh.",
        "Menjadi Phoenix Wright dan rasakan sensasi pertempuran saat Anda berjuang untuk menyelamatkan klien Anda yang tidak bersalah di pengadilan. Mainkan semua 14 episode, mencakup tiga game pertama, dalam satu koleksi cantik.",
        "Selamat Datang di klub! Tulis puisi untuk gebetanmu dan alami teror romansa sekolah dalam kisah horor psikologis yang mendapat pujian kritis ini",
        "Coffee Talk adalah simulator menyeduh kopi dan berbicara dari hati ke hati tentang mendengarkan masalah masyarakat modern yang terinspirasi fantasi, dan membantu mereka dengan menyajikan satu atau dua minuman hangat."
    )

    private val gameImages = intArrayOf(
        R.drawable.dota3_184x69,
        R.drawable.csgo,
        R.drawable.sea_of_thieves_184x69,
        R.drawable.grand_theft_auto_v_184x69,
        R.drawable.red_dead_redemption2_184x69,
        R.drawable.elden_ring_184x69,
        R.drawable.forza_horizon_5_184x69,
        R.drawable.sid_meiers_civilizationvi_184x69,
        R.drawable.cities_skylines_184x69,
        R.drawable.vrchat_184x69,
        R.drawable.the_sims4_184x69,
        R.drawable.stray_184x69,
        R.drawable.naraka_bladepoint_184x69,
        R.drawable.phoenix_wright_ace_attomey_trilogy_184x69,
        R.drawable.doki_doki_literature_club_plus_184x69,
        R.drawable.coffe_talk_184x69
    )
    private val img_games = intArrayOf(
        R.drawable.header_dota2,
        R.drawable.header_csgo,
        R.drawable.header_seaofthieves,
        R.drawable.header_grandtheftautov,
        R.drawable.header_reddeadredemption2,
        R.drawable.header_eldenring,
        R.drawable.header_forzahorizon5,
        R.drawable.header_civilizationvi,
        R.drawable.header_citiesskylines,
        R.drawable.header_vrchat,
        R.drawable.header_thesims4,
        R.drawable.header_stray,
        R.drawable.header_naraka,
        R.drawable.header_phoenixwrightaceattorney,
        R.drawable.header_dokidokiliteratureclub,
        R.drawable.header_coffetalk
    )
    private val developert = arrayOf(
        "Valve",
        "Valve, Hidden Path Entertainment",
        "Rare Ltd",
        "Rockstar North",
        "Rockstar Games",
        "FromSoftware Inc.",
        "Playground Games",
        "Firaxis Games, Aspyr(Mac), Aspyr(Linux)",
        "Colossal Order Ltd.",
        "VRChat Inc.",
        "Maxis",
        "BlueTwelve Studio",
        "24 Entertainment",
        "CAPCOM Co., Ltd",
        "Team Salvato",
        "Toge Productions"
    )
    private val publisher = arrayListOf(
        "Valve",
        "Valve",
        "Xbox Game Studios",
        "Rockstar Games",
        "Rockstar Games",
        "FromSoftware Inc., Bandai Namco Entertainment",
        "Xbox Hame Studios",
        "2k, Aspyr (Mac, Linux)",
        "Paradox Interactive",
        "VRChat Inc.",
        "Electronic Arts",
        "Annapurna interactive",
        "NetEase Games Montréal",
        "CAPCOM Co., Ltd",
        "Serenity Forge",
        "Toge Productions"
    )
    private val relase_games = arrayListOf(
        "10Jul, 201",
        "22 Aug, 2012",
        "3 Jun, 2020",
        "14 Apr, 2015",
        "6 Dec, 2019",
        "25 Feb, 2022",
        "9 Nov, 2021",
        "21 Oct, 2016",
        "10 Mar, 2015",
        "1 Feb, 2017",
        "2 Sep, 2014",
        "19 Jul, 2022",
        "12 Aug, 2021",
        "9 Apr, 2019",
        "30 Jun, 2021",
        "30 Jan, 2020"
    )

    val listData: ArrayList<Game>
        get() {
            val list = arrayListOf<Game>()
            for (position in nama_games.indices) {
                val game = Game()
                game.name = nama_games[position]
                game.detail_kat = game_details_kat[position]
                game.photo = gameImages[position]
                game.img_game = img_games[position]
                game.dev = developert[position]
                game.pub = publisher[position]
                game.releas = relase_games[position]
                game.detail_game_dec= game_details[position]
                list.add(game)
            }
            return list
        }
}