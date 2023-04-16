package com.example.mynewsapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.airbnb.lottie.LottieAnimationView;

public class OpenScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_screen);

        LottieAnimationView anim = findViewById(R.id.welcome);
        anim.setAnimation("news_anim.json");

        anim.playAnimation();


//        Handler hand = new Handler();
//        hand.postDelayed(new Runnable() {
//            @Override
//            public void run() {
//                startActivity(new Intent(SplashActivity.this,MainActivity.class));
//                finish();
//            }
//        },3000);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(OpenScreen.this,MainActivity.class);
                startActivity(intent);
                finish();
            }
        },3000);

    }
}