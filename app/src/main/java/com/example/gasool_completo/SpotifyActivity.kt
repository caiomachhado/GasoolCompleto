package com.example.gasool_completo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.gasool_completo.adapter.PlaylistAdapter
import com.example.gasool_completo.model.Playlist

class SpotifyActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spotify)
        val list = arrayListOf<Playlist>()
        list.add(Playlist("Músicas Favoritas", "", "Maria"))
        list.add(Playlist("Descobertas da semana", "", "Spotify"))
        list.add(Playlist("Segundo Sol", "", "Rede Globo"))

        val recyclerPlaylist = findViewById<RecyclerView>(R.id.recycler_playlist)
        recyclerPlaylist.layoutManager = LinearLayoutManager(this)
        recyclerPlaylist.adapter = PlaylistAdapter(list)
        supportActionBar?.title = "Playlists"


    }
}