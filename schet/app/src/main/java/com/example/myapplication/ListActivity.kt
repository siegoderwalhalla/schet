package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityListBinding

class ListActivity : AppCompatActivity() {
    private lateinit var binding: ActivityListBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityListBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val adapter = MyViewAdapter()
        binding.listView.adapter = adapter
        binding.buttonList.setOnClickListener {
            if  (binding.editText.text.isNotEmpty()) {
                var text = binding.editText.text.toString()
                adapter.addValue(text)
            }

        }
    }
}