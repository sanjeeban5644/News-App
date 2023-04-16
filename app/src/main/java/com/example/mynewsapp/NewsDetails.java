package com.example.mynewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.mynewsapp.Models.HeadLines;
import com.squareup.picasso.Picasso;

public class NewsDetails extends AppCompatActivity {

    HeadLines headLines;

    TextView heading,author,publish,detail,content;
    ImageView img;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_details);

        heading = findViewById(R.id.heading);
        author = findViewById(R.id.author);
        publish = findViewById(R.id.publishDate);
        detail = findViewById(R.id.detail);
        content = findViewById(R.id.content);
        img = findViewById(R.id.news_image);

        headLines = (HeadLines) getIntent().getSerializableExtra("data");


        heading.setText(headLines.getTitle());
        author.setText(headLines.getAuthor());
        publish.setText(headLines.getPublishedAt());
        detail.setText(headLines.getDescription());
        content.setText(headLines.getContent());
        Picasso.get().load(headLines.getUrlToImage()).into(img);









    }
}