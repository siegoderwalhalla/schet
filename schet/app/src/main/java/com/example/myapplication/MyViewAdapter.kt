package com.example.myapplication

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.myapplication.databinding.ActivityListBinding
import com.example.myapplication.databinding.ItemBinding

class MyViewAdapter:RecyclerView.Adapter <MyViewHolder>() {
    private val list = mutableListOf<String>()
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val binding = ItemBinding.inflate(LayoutInflater.from(parent.context))
        return MyViewHolder(binding)
    }

    override fun getItemCount(): Int {
        return list.size
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        holder.bind(list[position])
    }

    fun addValue(item: String) {
        list.add(item)
        notifyDataSetChanged()
    }

}

class MyViewHolder(private val binding: ItemBinding):ViewHolder(binding.root) {
    fun bind(string: String) {
        binding.textView.text = string
    }
}