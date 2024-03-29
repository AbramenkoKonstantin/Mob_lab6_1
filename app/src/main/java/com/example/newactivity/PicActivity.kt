package com.example.newactivity

import android.os.Bundle
import android.view.View
import android.widget.ImageView
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide

class PicActivity: AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.pic_layout)


        val link = intent.getStringExtra("picLink")
        val imageView = findViewById<ImageView>(R.id.picView)

        Glide.with(this).load(link).into(imageView)

    }

}