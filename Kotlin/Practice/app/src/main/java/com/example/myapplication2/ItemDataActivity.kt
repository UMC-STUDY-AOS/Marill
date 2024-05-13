package com.example.myapplication2

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.myapplication2.databinding.ItemDataBinding

class ItemDataActivity : AppCompatActivity() {

    lateinit var binding: ItemDataBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ItemDataBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.titleTv.setOnClickListener {
            val data = intent.getStringExtra("data")
            val intent = Intent(this, SecondActivity::class.java)
            intent.putExtra("data", data)
            binding.titleTv.text =  data
            startActivity(intent)
        }
    }
}