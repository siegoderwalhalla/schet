package com.example.myapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.myapplication.databinding.ActivityAnimalBinding
import com.example.myapplication.databinding.ActivitySecondBinding
import com.squareup.picasso.Picasso
import kotlin.random.Random

class AnimalActivity : AppCompatActivity() {
    private lateinit var binding: ActivityAnimalBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityAnimalBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val cat1 = "https://s13.stc.yc.kpcdn.net/share/i/instagram/B44solahwlo/wr-1280.webp"
        val cat2 = "https://avatars.dzeninfra.ru/get-zen_doc/1583391/pub_5ebad23495fafa340932ea0d_5ebad29e22a857434de7ec65/scale_1200"
        val cat3 = "https://limvet.ru/wp-content/uploads/2018/09/utas_siberian_cat_00.jpg"
        val cats = listOf<String>(cat1, cat2, cat3)

        val raccoon1 = "https://moya-planeta.ru/upload/images/xl/e9/41/e9411a1e44f9bc6735cbde043d7ca84eae8a20bc.jpg"
        val raccoon2 = "https://cs8.pikabu.ru/post_img/big/2017/09/07/9/1504795185158164761.jpg"
        val raccoon3 = "https://welcome.mosreg.ru/cache/thumbs/thumb_1280__3416464894.jpg"
        val raccoons = listOf<String>(raccoon1, raccoon2, raccoon3)

        val dog1 = "https://storage.yandexcloud.net/storage.yasno.media/nat-geo/images/2023/6/28/a9c7c5ba9c2e4caa9330c1ec5c0fc499.max-2000x1000.jpg"
        val dog2 = "https://www.purina.ru/sites/default/files/2020-09/prichini.jpg"
        val dog3 = "https://s6.stc.all.kpcdn.net/family/wp-content/uploads/2023/02/top-v-luchshie-porody-krupnykh-sobak-960x540-1-960x540.jpg"
        val dogs = listOf<String>(dog1, dog2, dog3)
        var current_pic: String? = null
        var favourite_pic: String? = null
        binding.cat.setOnClickListener {
            current_pic = cats.random()
            Picasso.get().load(current_pic).resize(600, 500).into(binding.animal)
        }
        binding.dog.setOnClickListener {
            current_pic = dogs.random()
            Picasso.get().load(current_pic).fit().into(binding.animal)
        }
        binding.raccoon.setOnClickListener {
            current_pic = raccoons.random()
            Picasso.get().load(current_pic).resize(600, 500).centerCrop().into(binding.animal)
        }
        binding.add.setOnClickListener {
            if (current_pic != null) {
                favourite_pic = current_pic
            }
        }
        binding.show.setOnClickListener {
            if (favourite_pic != null) {
                Picasso.get().load(favourite_pic).resize(600, 500).centerCrop().into(binding.animal)

            }
        }
    }
}