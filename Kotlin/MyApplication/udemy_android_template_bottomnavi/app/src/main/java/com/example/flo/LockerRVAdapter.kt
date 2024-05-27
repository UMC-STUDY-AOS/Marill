//package com.example.flo
//
//import android.view.LayoutInflater
//import android.view.ViewGroup
//import androidx.recyclerview.widget.RecyclerView
//import com.example.flo.databinding.ItemSongBinding
//
//class LockerRVAdapter(private val songList: ArrayList<Song>) : RecyclerView.Adapter<LockerRVAdapter.ViewHolder>() {
//
//
//    interface MyItemClickListener {
//        fun onItemClick(song: Song)
//        fun onRemoveSong(position: Int)
//    }
//
//    private lateinit var myItemClickListener: MyItemClickListener
//    fun setMyItemClickListener(itemClickListener: MyItemClickListener) {
//        myItemClickListener = itemClickListener
//    }
//
//    fun addSong(song: Song) {
//        songList.add(song)
//        notifyDataSetChanged()
//    }
//
//    fun removeSong(position: Int) {
//        songList.removeAt(position)
//        notifyDataSetChanged()
//    }
//
//    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): LockerRVAdapter.ViewHolder {
//
//        val binding : ItemSongBinding = ItemSongBinding.inflate(LayoutInflater.from(viewGroup.context), viewGroup, false)
//        return ViewHolder(binding)
//    }
//
//    override fun onBindViewHolder(holder: LockerRVAdapter.ViewHolder, position: Int) {
//        holder.bind(songList[position])
//        holder.itemView.setOnClickListener{
//            myItemClickListener.onItemClick(songList[position])
//        }
//    }
//
//    override fun getItemCount(): Int = songList.size
//
//    inner class ViewHolder(val binding: ItemSongBinding) : RecyclerView.ViewHolder(binding.root) {
//
//        fun bind(song: Song) {
//            binding.itemSongImgIv.setImageResource(song.coverImg!!)
//            // 이미지를 못 불러와...
//            binding.itemSongTitleTv.text = song.title
//            binding.itemSongSingerTv.text = song.singer
//        }
//
//    }
//}