package com.salem.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.airbnb.lottie.LottieAnimationView;

public class splash extends AppCompatActivity {
    private static int SPLASH_SCREEN = 3000;
    private Animation animation;
    private LottieAnimationView animationView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        animationView = findViewById(R.id.animate1);
        animationView = findViewById(R.id.animate2);

        animation = AnimationUtils.loadAnimation(this, R.anim.anim);
        animationView.setAnimation(animation);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent2 = new Intent(splash.this, MainActivity.class);
                startActivity(intent2);
            }
        }, SPLASH_SCREEN);
    }

    @Override
    protected void onPause() {
        super.onPause();
    }
    }
