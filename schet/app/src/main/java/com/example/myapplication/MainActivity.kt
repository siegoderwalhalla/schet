package com.example.myapplication

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import com.example.myapplication.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val viewModel: CounterViewModel by lazy {
        ViewModelProvider(this)[CounterViewModel::class.java]
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        binding.counter.text = viewModel.getCurrent().toString()
        binding.buttonMinus.setOnClickListener {
            binding.counter.text = viewModel.getPrev().toString()
        }
        binding.buttonPlus.setOnClickListener {
            binding.counter.text = viewModel.getNext().toString()

            if (viewModel.getCurrent() >= 5) {
                val intent = Intent(this, SecondActivity::class.java)
                startActivity(intent)
            }
        }
        binding.animalButton.setOnClickListener {
            val animals = Intent(this, AnimalActivity::class.java)
            startActivity(animals)
        }
        binding.buttonListActivity.setOnClickListener {
            val intent = Intent(this, ListActivity::class.java)
            startActivity(intent)
        }
    }
}