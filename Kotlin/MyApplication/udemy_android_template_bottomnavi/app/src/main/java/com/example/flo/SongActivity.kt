package com.example.flo

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.flo.databinding.ActivitySongBinding

class SongActivity : AppCompatActivity() {

    lateinit var binding : ActivitySongBinding
    // binding: xml file과 class file은 mapping 하는 것

    override fun onCreate(savedInstanceState: Bundle?) { // activity가 실행될 때 처음으로 실행되는 함수
        super.onCreate(savedInstanceState)
        binding = ActivitySongBinding.inflate(layoutInflater) // xml code를 메모리에 객체화
        setContentView(binding.root) // xml에 있는 코드 쓰겠다
    }
}