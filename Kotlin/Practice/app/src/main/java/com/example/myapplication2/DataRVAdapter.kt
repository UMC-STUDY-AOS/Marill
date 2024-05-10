package com.example.myapplication2

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.myapplication2.databinding.ItemDataBinding

class DataRVAdapter (
    private val dataList: ArrayList<Memo>,
    val onClickDeleteBtn: (data: Memo) -> Unit):

    RecyclerView.Adapter<DataRVAdapter.DataViewHolder>() {

    inner class DataViewHolder(val binding: ItemDataBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bind(data: Memo) {
            binding.memoTv.text = data.memo;
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): DataViewHolder {
        val viewBinding = ItemDataBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return DataViewHolder(viewBinding)
    }

    override fun onBindViewHolder(holder: DataViewHolder, position: Int) {
        val listPosition = dataList[position]
        holder.bind(dataList[position])

        holder.binding.deleteBtn.setOnClickListener{
            onClickDeleteBtn.invoke(listPosition)
        }
    }

    override fun getItemCount(): Int = dataList.size
}