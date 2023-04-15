package com.example.mynewsapp;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

public class CustomViewHolder extends RecyclerView.ViewHolder {
    TextView title,news;
    ImageView photo;
    CardView cardview;

    public CustomViewHolder(@NonNull View itemView) {
        super(itemView);

        title = itemView.findViewById(R.id.title);
        news = itemView.findViewById(R.id.news);
        photo = itemView.findViewById(R.id.photo);
        cardview = itemView.findViewById(R.id.news_container);




    }
}


