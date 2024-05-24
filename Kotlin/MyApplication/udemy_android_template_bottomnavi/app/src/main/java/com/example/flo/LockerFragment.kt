package com.example.flo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.flo.databinding.FragmentLockerBinding

class LockerFragment : Fragment() {

    lateinit var binding: FragmentLockerBinding
    private var songData = ArrayList<Song>()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FragmentLockerBinding.inflate(inflater, container, false)

        songData.apply{
            add(Song("Butter", "방탄소년단(BTS)", R.drawable.img_album_exp))
            add(Song("Lilac", "아이유(IU)", R.drawable.img_album_exp2))
            add(Song("Next Level", "에스타(AESPA)", R.drawable.img_album_exp3))
            add(Song("Boy With Luv", "방탄소년단(BTS)", R.drawable.img_album_exp4))
            add(Song("BBom BBom", "모모랜드(MOMOLAND)", R.drawable.img_album_exp5))
            add(Song("Weekend", "태연", R.drawable.img_album_exp6))
        }

        val songRVAdapter = LockerRVAdapter(songData)
        binding.lockerContentRv.adapter = songRVAdapter

        songRVAdapter.setMyItemClickListener(object : LockerRVAdapter.MyItemClickListener {
            override fun onItemClick(song: Song) {
                songRVAdapter.addSong(song)
            }

            override fun onRemoveSong(position: Int) {
                songRVAdapter.removeSong(position)
            }

        })

        binding.lockerContentRv.layoutManager = LinearLayoutManager(context, LinearLayoutManager.VERTICAL, false)


        return binding.root
    }
}