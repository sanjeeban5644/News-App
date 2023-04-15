package com.example.mynewsapp.Models;

import java.util.List;

public class NewsApiResponse {
    String status;
    int totalResults;
    List<HeadLines> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<HeadLines> getArticles() {
        return articles;
    }

    public void setArticles(List<HeadLines> articles) {
        this.articles = articles;
    }
}
