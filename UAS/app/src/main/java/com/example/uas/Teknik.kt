package com.example.uas

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.uas.MainActivity.Companion.INTENT_PARCELABLE


private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

class Teknik : Fragment() {
    private lateinit var adapter: BulutangkisAdapter
    private lateinit var recycleView: RecyclerView
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_teknik, container, false)
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val grid = LinearLayoutManager(context)
        recycleView = view.findViewById(R.id.recyclerView)
        recycleView.layoutManager = grid
//        recycleView.hasFixedSize(true)
        adapter = BulutangkisAdapter(ListTeknik)
        recycleView.adapter = adapter
    }
}