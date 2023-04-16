package com.example.UTS_Maulanakhisyam

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import com.example.myapplication.R
import androidx.recyclerview.widget.RecyclerView

class SepatuAdapter (val data: List<Sepatu>) : RecyclerView.Adapter<SepatuAdapter.NovelViewHolder>() {

    class NovelViewHolder(val view: View) : RecyclerView.ViewHolder(view) {
        val imgsepatu = view.findViewById<ImageView>(R.id.item_photo)
        val namesepatu = view.findViewById<TextView>(R.id.item_title)
        val descsepatu = view.findViewById<TextView>(R.id.item_description)
//        val descdetailsepatu = view.findViewById<TextView>(R.id.item_detail_description)
    }

    override fun getItemCount(): Int {
        return data.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): NovelViewHolder {
        val layout = LayoutInflater
            .from(parent.context)
            .inflate(R.layout.item_main, parent, false)
        return NovelViewHolder(layout)
    }

    override fun onBindViewHolder(holder: NovelViewHolder, position: Int) {
        holder.namesepatu.text = data.get(position).namesepatu
        holder.descsepatu.text = data.get(position).descsepatu
//        holder.descdetailsepatu.text = data.get(position).descdetailsepatu
        holder.imgsepatu.setImageResource(data.get(position).imgsepatu)
        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val model = data.get(position)
            val nama = model.namesepatu
            val deskripsi = model.descsepatu
//            val keterangan = model.descdetailsepatu
            val image = model.imgsepatu

            val intent = Intent(context, DetailSepatuActivity::class.java)
            intent.putExtra("nama", nama)
            intent.putExtra("deskripsi", deskripsi)
//            intent.putExtra("Keterangan", keterangan)
            intent.putExtra("Gambar", image)

            context.startActivity(intent)
        }
    }
}