package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivitySecondBinding
import com.squareup.picasso.Picasso

class SecondActivity : AppCompatActivity() {
    private lateinit var binding: ActivitySecondBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySecondBinding.inflate(layoutInflater)
        setContentView(binding.root)
        var flag = 0
        binding.imageView.setImageResource(R.drawable.pic3)
        binding.button3.setOnClickListener {
            if (flag == 0) {
                Picasso.get().load("https://a.cdn-hotels.com/gdcs/production122/d1611/bba027a5-f1eb-4c95-820d-cc63c89fa143.jpg?impolicy=fcrop&w=800&h=533&q=medium").into(binding.imageView)
                flag = 1
            }
            else {
                Picasso.get().load("https://assets.simpleviewcms.com/simpleview/image/upload/c_fill,h_640,w_640/f_jpg/q_65/v1/clients/norway/Urnes_Stave_Church_luster_fjord_Norway_photo_Thomas_Morel_646b0cd1-2926-4b68-867e-8d4a6abba6b2.jpg?_a=BATCtdAA0").into(binding.imageView)
                flag = 0
            }
        }
    }
}