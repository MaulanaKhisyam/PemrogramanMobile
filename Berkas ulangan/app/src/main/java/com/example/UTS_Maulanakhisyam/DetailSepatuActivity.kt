package com.example.UTS_Maulanakhisyam

import android.content.Intent
// import android.net.Uri
import android.os.Bundle
// import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.ActionBar
import com.example.myapplication.R
import androidx.appcompat.app.AppCompatActivity

class DetailSepatuActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?){
        super.onCreate(savedInstanceState)
        setContentView(R.layout.detail_main)

        val actionBar: ActionBar? = supportActionBar
        actionBar!!.setDisplayHomeAsUpEnabled(true)
        actionBar!!.setDisplayHomeAsUpEnabled(true)

        val imgsepatu = findViewById<ImageView>(R.id.item_photo)
        val namesepatu = findViewById<TextView>(R.id.item_title)
        val descsepatu = findViewById<TextView>(R.id.item_description)

        var intent = intent
        val nama = intent.getStringExtra("nama")
        val deskripsi = intent.getStringExtra("deskripsi")
        val image = intent.getIntExtra("Gambar", 0)

        actionBar.setTitle(nama)
        namesepatu.text = nama
        descsepatu.text = deskripsi
        imgsepatu.setImageResource(image)


    }
}