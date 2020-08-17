package com.example.skinlesionapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

public class AllImagesActivity extends AppCompatActivity {

    private RecyclerView imagesRecView;
    private ImageRecViewAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_images);

        adapter = new ImageRecViewAdapter(this);
        imagesRecView = findViewById(R.id.imagesRecView);

        imagesRecView.setAdapter(adapter);
        imagesRecView.setLayoutManager(new LinearLayoutManager(this));

        adapter.setImages(Utils.getInstance().getAllImages());

    }
}