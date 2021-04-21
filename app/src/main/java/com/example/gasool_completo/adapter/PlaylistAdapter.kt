package com.example.gasool_completo.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.appcompat.widget.AppCompatImageView
import androidx.appcompat.widget.AppCompatTextView
import androidx.recyclerview.widget.RecyclerView
import com.example.gasool_completo.R
import com.example.gasool_completo.model.Playlist

class PlaylistAdapter(val list: ArrayList<Playlist>) : RecyclerView.Adapter<PlaylistAdapter.PlaylistViewHolder>(){

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PlaylistViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.adapter_playlist, parent, false)
        return PlaylistViewHolder(view)
    }

    override fun onBindViewHolder(holder: PlaylistViewHolder, position: Int) {
        val playlist = list[position]
        holder.set(playlist)
    }

    override fun getItemCount() = list.size

    class PlaylistViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView){

        val imageView = itemView.findViewById<AppCompatImageView>(R.id.image_view_image)
        val textView = itemView.findViewById<AppCompatTextView>(R.id.text_view_titulo_playlist)
        val textViewOwner = itemView.findViewById<AppCompatTextView>(R.id.text_view_owner)

        fun set(playlist: Playlist) {
            textViewOwner.text = "de ${playlist.owner}"
            textViewOwner.text = playlist.title
        }
    }

}