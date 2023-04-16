package com.example.mynewsapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Bundle;

import com.example.mynewsapp.Models.HeadLines;
import com.example.mynewsapp.Models.NewsApiResponse;

import java.util.List;

public class MainActivity extends AppCompatActivity implements SelectListener{

    RecyclerView recyclerview;
    CustomAdapter adapter;

    ProgressDialog dialog;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        dialog = new ProgressDialog(this);
        dialog.setTitle("Loading News...");
        dialog.show();



        RequestManager manager = new RequestManager(this);
        manager.getHeadLines(listener,"general",null);


    }


    private final OnFetchDataListener<NewsApiResponse> listener = new OnFetchDataListener<NewsApiResponse>() {
        @Override
        public void onFetchData(List<HeadLines> list, String message) {
            shownews(list);
            dialog.dismiss();
        }

        @Override
        public void onError(String message) {

        }
    };

    private void shownews(List<HeadLines> list) {
        recyclerview = findViewById(R.id.news_feed);
        recyclerview.setHasFixedSize(true);
        recyclerview.setLayoutManager(new GridLayoutManager(this,1));
        adapter = new CustomAdapter(this,list,this);
        recyclerview.setAdapter(adapter);
    }


    @Override
    public void onNewsClick(HeadLines headlines) {
        startActivity(new Intent(MainActivity.this,NewsDetails.class)
                .putExtra("data",headlines));
    }
}