package com.example.mynewsapp;

import com.example.mynewsapp.Models.HeadLines;

import java.util.List;

public interface OnFetchDataListener <NewsApiResponse>{
    void onFetchData(List<HeadLines> list, String message);
    void onError(String message);
}