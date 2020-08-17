package com.example.skinlesionapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.bumptech.glide.Glide;

public class ImageActivity extends AppCompatActivity {

    public static final String IMAGE_ID_KEY = "imageId";

    private TextView txtClassification, txtExamination, txtShortDescription, txtLongDescription, txtPatientId;
    private Button btnClassifyImage, btnExplainClassification, btnSeeInsights, btnSeeSimilarImages;
    private ImageView lesionImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image);

        initViews();

//        // TODO: get the data from recycler view in here

        Intent intent = getIntent();
        if (null != intent) {
            int imageId = intent.getIntExtra(IMAGE_ID_KEY, -1);
            if (imageId != -1) {
                Image incomingImage = Utils.getInstance().getImageById(imageId);
                if (null != incomingImage) {
                    setData(incomingImage);
                }
            }
        }
    }

    private void setData(Image image) {
        txtClassification.setText(image.getClassification());
        txtExamination.setText(image.getExamination());
        txtPatientId.setText(String.valueOf(image.getPatientId()));
        txtLongDescription.setText(image.getLongDesc());
        Glide.with(this)
                .asBitmap().load(image.getImageURL())
                .into(lesionImage);
    }

    private void initViews() {
        txtClassification = findViewById(R.id.txtImageClassification);
        txtExamination = findViewById(R.id.txtExamination);
        txtPatientId = findViewById(R.id.txtPatientId);
        txtShortDescription = findViewById(R.id.txtShortDescription);
        txtLongDescription = findViewById(R.id.txtLongDescription);
        btnClassifyImage = findViewById(R.id.btnClassifyImage);
        btnExplainClassification = findViewById(R.id.btnExplainClassification);
        btnSeeInsights = findViewById(R.id.btnSeeInsights);
        btnSeeSimilarImages = findViewById(R.id.btnSeeSimilarImages);
        lesionImage = findViewById(R.id.lesionImage);

    }
}