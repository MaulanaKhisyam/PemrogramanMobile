package com.example.uas

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import androidx.appcompat.app.AppCompatActivity

class BulutangkisDetail : AppCompatActivity() {

    @SuppressLint("MissingInflatedId")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.bulutangis_detail)

        val namaDiLayout = findViewById<TextView>(R.id.bulutangkis_name)
        val deskripsiDiLayout = findViewById<TextView>(R.id.bulutangkis_deskripsi)
        val gambarDiLayout = findViewById<ImageView>(R.id.bulutangkis_image)

        val actionBar: ActionBar? = supportActionBar
        actionBar?.setDisplayHomeAsUpEnabled(true)
        actionBar?.setDisplayHomeAsUpEnabled(true)

        val intent = intent
        val nama = intent.getStringExtra("Nama")
        val gambar = intent.getIntExtra("Gambar", 0)
        val deskripsi = intent.getStringExtra("Deskripsi")

        actionBar?.title = nama
        namaDiLayout?.text = nama
        deskripsiDiLayout?.text = deskripsi
        gambarDiLayout?.setImageResource(gambar)
    }
}
