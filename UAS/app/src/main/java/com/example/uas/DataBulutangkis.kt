package com.example.uas

import android.os.Parcelable
import kotlinx.parcelize.Parcelize


data class DataBulutangkis(
    val Image: Int,
    val nama : String,
    val deskripsi : String
)

val ListTeknik = listOf<DataBulutangkis>(
    DataBulutangkis(
        R.drawable.serve,
        "serve",
        "Serve/service atau dikenal sebagai serangan pertama dalam permainan. " +
                "Servis bertujuan untuk menerbangkan kok atau shuttlecock ke bidang lapangan lawan." +
                "Secara umum, ada empat jenis servis bulu tangkis, yaitu: " +
                "1. Servis Backhand\n" +
                "2. Servis Forehand\n" +
                "3. Servis Panjang\n" +
                "4. Servis Flick"
    ),
    DataBulutangkis(
        R.drawable.backhand,
        "Backand",
        "Backhand adalah pukulan yang dilakukan dengan cara membelakangi lawan. " +
                "Untuk melakukan pukulan backhand, posisi raket harus mengarah ke atas dan posisi tangan dalam memegang atau menggenggam gagang raket harus dekat dengan bahu yang berlawanan. " +
                "Terdapat beberapa teknik dalam memegang raket bulu tangkis dengan cara backhand grip, yaitu:\n" +
                "\n Memegang raket dalam posisi miring.\n" +
                "\n Pastikan posisi ibu jari ada di bagian belakang handle atau pegangan raket, sementara jari-jari tangan diposisikan pada bagian depan."
    ),
    DataBulutangkis(
            R.drawable.drive,
            "Drive",
            "Drive atau yang dikenal dengan pukulan datar atau sejajar diatas net, adalah teknik pukulan dalam bulutangkis yang dimainkan dengan tempo cepat"
    ),
    DataBulutangkis(
        R.drawable.lob,
        "Lob (Pukulan kebelakang)",
        "Lob atau teknik pukulan yang mana seorang atlet memukul bola ke arah bashland atau belakang lapangan." +
                "Pukulan ini biasanya digunakan untuk mengalihkan perhatian lawan dari posisi awal dan memaksa lawan berlari ke belakang lapangan."
    ),
    DataBulutangkis(
        R.drawable.dropshoot,
        "Dropshot",
        "Dropshot adalah pukulan yang menampatakan bola didepan net dari posisi atlet sedang di belakang. " +
                "Pukulan ini biasanya digunakan untuk mengalihkan perhatian lawan dari posisi awal dan memaksa lawan berlari ke depan lapangan."
    ),
    DataBulutangkis(
        R.drawable.netting,
        "Netting",
        "Netting adalah pukulan yang dilakukan di depan net. Pukulan ini biasanya digunakan untuk mengalihkan perhatian lawan dari posisi awal dan memaksa lawan berlari ke depan lapangan." +
                "Ada beberapa jenis netting, yaitu :\n" +
                "\n 1. Netting Forhand\n" +
                "\n 2. Netting Backhand\n" +
                "\n 3. Netting Silang (Jaring)"
    ),
    DataBulutangkis(
        R.drawable.smash2,
        "Smash",
        "Smash adalah pukulan yang dilakukan dengan cara memukul bola dengan kencang dari posisi atlet dibelakang." +
                "Pukulan yang paling populer ini termasuk pukulan yang paling di andalkan bagi atlet untuk mencetak poin." +
                "Pukulan ini biasanya digunakan untuk mengakhiri permainan atau memaksa lawan melakukan kesalahan."
    ),
)

val ListTurnamen = listOf<DataBulutangkis>(
    DataBulutangkis(
        R.drawable.bwf,
        "World Champion",
        "Badminton World Champion adalah turnamen bulutangis yang masuk dalam garde 1. Kejuaraan yang biasanya diperebutaka " +
                "dan diperubutka ooleh pemain top ."
    ),
    DataBulutangkis(
        R.drawable.junior,
        "Junior World Champion",
        "Junior World Chmapion adalah turnamen bulutangkis junior di bawan umur 19 tahun, kejuaran ini dimainkan oleh para atlet junior."
    ),
    DataBulutangkis(
        R.drawable.thomasuber,
        "Thomas & Uber Cup",
        "Thomas dan Uber cup adalah turnamen beregu putra dan putri, turnamen yang dimainkan 2 tahun sekali merupakan turnamen yang sanagat " +
                "prestisius."
    ),
    DataBulutangkis(
        R.drawable.sudirman,
        "Sudirman Cup",
        "Sudirman Cup adalah turnamen beregu campuran, turnamen yang dimainkan 2 tahun sekali yang diselang seling dengan thomas & uber merupakan " +
                "turnamen yang prestisius. Nama dari turnamen ini diambil dari nama orang indonesia yaitu Sudirman."
    ),
    DataBulutangkis(
        R.drawable.suhandinata,
        "Suhandinata Cup",
        "Suhandinata adalah turnamen yang dimainakn oleh beregu campuran junior."
    ),
    DataBulutangkis(
        R.drawable.malaysiaopen,
        "Malaysia Open",
        "Malaysia Open adalah turnamen yang termasuk dalam turnamen super 1000."
    ),
    DataBulutangkis(
        R.drawable.allenglad,
        "All England",
        "All England adalah adalah turnamen yang termasuk dalam turnamen super 1000. Turnamen ini termasuk salah satu " +
                "turnamen yang diperebutkan oleh pemain top dunia, dan sekaligus turnmen yang prestisius."
    ),
    DataBulutangkis(
        R.drawable.indoopen,
        "Indonesia Open",
        "Indonesia Open adalah turnamen yang termasuk dalam turnamen super 1000. Turnamen ini juga merupakan turnamen dengan " +
                "hadiah terbanyak."
    ),
    DataBulutangkis(
        R.drawable.chinaopen,
        "China open",
        "China Open adalah adalah turnamen yang termasuk dalam turnamen super 1000."
    ),
    DataBulutangkis(
        R.drawable.india,
        "India Open",
        "India Open adalah turnamen yang masuk dalam turnamen super 750."
    ),
    DataBulutangkis(
        R.drawable.sinagoopen,
        "Singapore Open",
        "Singapore Open adalah turnamen yang masuk dalam turnamen super 750."
    ),
    DataBulutangkis(
        R.drawable.japanopen,
        "Japan Open",
        "Japan Open adalah turnamen yang masuk dalam turnamen super 750."
    ),
    DataBulutangkis(
        R.drawable.denmarkopen,
        "Denmark Open",
        "Denmark Open adalah turnamen yang masuk dalam turnamen super 750."
    ),
    DataBulutangkis(
        R.drawable.franceopen,
        "France Open",
        "France Open adalah turnamen yang masuk dalam turnamen super 750."
    ),
    DataBulutangkis(
        R.drawable.fuzhou,
        "Fuzhou Open",
        "Fuzhou Open adalah turnamen yang masuk dalam turnamen super 750."
    ),
    DataBulutangkis(
        R.drawable.malaysiamaster,
        "Malaysia Master",
        "Malaysia Master adalah turnamen yang masuk dalam turnamen super 500."
    ),
    DataBulutangkis(
        R.drawable.indomaster,
        "Indonesia Master",
        "Indonesia Master adalah turnamen yang masuk dalam turnamen super 500."
    ),
    DataBulutangkis(
        R.drawable.koreaopen,
        "Korea Open",
        "korea open adalah turnamen yang masuk dalam turnamen super 500."
    ),
    DataBulutangkis(
        R.drawable.thailandopen,
        "Thailand Open",
        "Thailand Open adalah turnamen yang masuk dalam turnamen super 500."
    ),
    DataBulutangkis(
        R.drawable.hyloopen,
        "Hylo Open",
        "Hylo Open adalah turnamen yang masuk dalam turnamen super 500."
    ),
    DataBulutangkis(
        R.drawable.hongkongopen,
        "Hongkong open",
        "Hongkong Open adalah turnamen yang masuk dalam turnamen super 500."
    ),
    DataBulutangkis(
        R.drawable.thanmaster,
        "Thailand Master",
        "Thailand Master adalah turnamen yang masuk dalam turnamen super 300."
    ),
    DataBulutangkis(
        R.drawable.koreamaster,
        "Korea Master",
        "Korea Master adalah turnamen yang masuk dalam turnamen super 300."
    ),
    DataBulutangkis(
        R.drawable.taipenopen,
        "Chinese Taipei Open",
        "Chinese Taipen Open adalah turnamen yang masuk dalam turnamen super 300."
    ),
    DataBulutangkis(
        R.drawable.austaopen,
        "Australia Open",
        "Australia Open adalah turnamen yang masuk dalam turnamen super 300."
    ),
    DataBulutangkis(
        R.drawable.macauopen,
        "Macau Open",
        "Macau Open adalah turnamen yang masuk dalam turnamen super 300."
    )
)

