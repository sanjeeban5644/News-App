package com.example.mynewsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.mynewsapp.Models.HeadLines;
import com.example.mynewsapp.Models.NewsApiResponse;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerview;
    CustomAdapter adapter;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RequestManager manager = new RequestManager(this);
        manager.getHeadLines(listener,"general",null);


    }


    private final OnFetchDataListener<NewsApiResponse> listener = new OnFetchDataListener<NewsApiResponse>() {
        @Override
        public void onFetchData(List<HeadLines> list, String message) {
            shownews(list);
        }

        @Override
        public void onError(String message) {

        }
    };

    private void shownews(List<HeadLines> list) {
        recyclerview = findViewById(R.id.news_feed);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new GridLayoutManager(this,1));
        adapter = new CustomAdapter(this,list);
        recyclerview.setAdapter(adapter);
    }


}