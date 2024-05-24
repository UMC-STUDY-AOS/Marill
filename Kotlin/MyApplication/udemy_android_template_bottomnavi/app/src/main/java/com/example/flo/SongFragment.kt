package com.example.flo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.flo.databinding.FragmentDetailBinding
import com.example.flo.databinding.FragmentSongBinding
import com.google.android.material.tabs.TabLayoutMediator
import com.google.gson.Gson

class SongFragment : Fragment() {

    lateinit var binding : FragmentSongBinding
    private var gson : Gson = Gson()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentSongBinding.inflate(inflater, container, false)

        val songJson = arguments?.getString("song")
        val song = gson.fromJson(songJson, Song::class.java)
        setInit(song)

        val songAdapter = LockerVPAdapter(this)
        binding.songContentVp.adapter = songAdapter
//        TabLayoutMediator(binding.songContentTb, binding.songContentVp){
//            tab, position ->
//            tab.text = infor
//        }.attach()
//
        return binding.root
    }

    private fun setInit(song: Song) {
        binding.songMore01Iv.setImageResource(song.coverImg!!)
        binding.songListOrder01Tv.text = song.title
        binding.songSingerName01Tv.text = song.singer
    }
}