package com.example.recyclerviewexample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val songs = mutableListOf<Song>(
            Song("Hello", "KK Menon"),
            Song("Can you hear me", "Adele"),
            Song("Barbie Girl", "Nikki"),
            Song("Barbie", "Mika"),
            Song("Summer", "Minaj"),
            Song("Magic in night sky", "Calcin Harries"),
            Song("You are mine", "Tiesto"),
            Song("Heart beat sounds", "Yuki"),
            Song("Fell in love", "Holy"),
            Song("Hello", "KK Menon"),
            Song("Can you hear me", "Adele"),
            Song("Barbie Girl", "Nikki"),
            Song("Barbie", "Mika"),
            Song("Summer", "Minaj"),
            Song("Magic in night sky", "Calcin Harries"),
            Song("You are mine", "Tiesto"),
            Song("Heart beat sounds", "Yuki"),
            Song("Fell in love", "Holy"),
            Song("Hello", "KK Menon"),
            Song("Can you hear me", "Adele"),
            Song("Barbie Girl", "Nikki"),
            Song("Barbie", "Mika"),
            Song("Summer", "Minaj"),
            Song("Magic in night sky", "Calcin Harries"),
            Song("You are mine", "Tiesto"),
            Song("Heart beat sounds", "Yuki"),
            Song("Fell in love", "Holy")
        )
        val recyclerView = findViewById<RecyclerView>(R.id.songList)
        recyclerView.adapter = MyAdapter(songs)
        recyclerView.layoutManager = LinearLayoutManager(this)
    }
}