package com.example.uas

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView



class BulutangkisAdapter(val data: List<DataBulutangkis>) : RecyclerView.Adapter<BulutangkisAdapter.MyViewHolder>() {

    class MyViewHolder(row: View) : RecyclerView.ViewHolder(row) {
        val textView1 = row.findViewById<TextView>(R.id.bulutangkis_name)
        //val textView2 = row.findViewById<TextView>(R.id.bulutangkis_deskripsi)
        val imageView = row.findViewById<ImageView>(R.id.bulutangkis_image)
    }
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val layout = LayoutInflater.from(parent.context).inflate(R.layout.bulutangkis_list,
            parent, false)
        return MyViewHolder(layout)
    }
    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textView1.text = data.get(position).nama
        //holder.textView2.text = data.get(position).deskripsi
        holder.imageView.setImageResource(data.get(position).Image)

        holder.itemView.setOnClickListener {
            val context = holder.itemView.context
            val model = data.get(position)
            val gambar: Int = model.Image
            val nama : String = model.nama
            val deskripsi = model.deskripsi

            //Membuat Intent

            val intent = Intent(context, BulutangkisDetail::class.java)
            //Putextra
            intent.putExtra("Nama", nama)
            intent.putExtra("Gambar" , gambar)
            intent.putExtra("Deskripsi", deskripsi)
            context.startActivity(intent)
        }
    }
    override fun getItemCount(): Int = data.size
}