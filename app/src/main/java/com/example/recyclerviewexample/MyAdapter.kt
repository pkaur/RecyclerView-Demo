package com.example.recyclerviewexample

import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class MyAdapter(val songs: List<Song>): RecyclerView.Adapter<MyAdapter.MyViewHolder>() {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {

        val inflater = LayoutInflater.from(parent.context)
        val view = inflater.inflate(R.layout.item_view, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.textTitle.text = songs[position].title
        holder.textDesc.text = songs[position].description
        var color = "#CCCCCC"
        if(position%2 == 0){
            color = "#EEEEEE"
        }

        holder.layout.setBackgroundColor(Color.parseColor(color))
    }

    override fun getItemCount(): Int {
        return songs.size
    }

    class MyViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        var textTitle = itemView.findViewById<TextView>(R.id.textTitle)
        var textDesc = itemView.findViewById<TextView>(R.id.textDescription)
        var layout = itemView.findViewById<LinearLayout>(R.id.container)
    }
}