package com.example.skinlesionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btnSeeAllImages, btnSeeInsights, btnExplainClassification, btnPreviousImage, btnLearnMore, btnAbout;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();

        btnSeeAllImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, AllImagesActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initViews() {
        btnSeeAllImages = findViewById(R.id.btnSeeAllImages);
        btnSeeInsights = findViewById(R.id.btnSeeInsights);
        btnExplainClassification = findViewById(R.id.btnExplainClassification);
        btnPreviousImage = findViewById(R.id.btnPreviousImage);
        btnLearnMore = findViewById(R.id.btnLearnMore);
        btnAbout = findViewById(R.id.btnAbout);

    }
}