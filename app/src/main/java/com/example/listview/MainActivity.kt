package com.example.listview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.ListAdapter
import android.widget.ListView
import android.widget.Spinner

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val listViewid=findViewById<ListView>(R.id.listview)

        val data= arrayListOf<DataModal>(
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("ht://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
            DataModal("https://imgv3.fotor.com/images/blog-cover-image/part-blurry-image.jpg","Sonu", "sonuqc25@gmail.com"),
        )
        val abhiAdapter=CostamAdapter(this,data)
        listViewid.adapter=abhiAdapter
    }
}