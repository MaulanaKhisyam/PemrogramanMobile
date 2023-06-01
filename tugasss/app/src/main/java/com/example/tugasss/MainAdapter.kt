package com.example.tugasss

import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import eu.tutorials.retrofitexmple.network.Character


class MainAdapter(val characrersList: List<Character>) : RecyclerView.Adapter<MainAdapter.MainViewHolder>() {

    inner class MainViewHolder(private val itemView: View):RecyclerView.ViewHolder(itemView){
        fun bindData(character: Character){
            val name = itemView.findViewById<TextView>(R.id.name)
            val image = itemView.findViewById<TextView>(R.id.image)

            name.text = character.name
            image.load (character.image){
                transformation(CircleCropTransformation())
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        return MainViewHolder(layoutflater.from(parent.context).inflate(R.layout.rv_item, parent, false))
    }

    override fun getItemCount(): Int {
        return characrersList.size
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
        holder.binData(characrersList[position])
    }

}

