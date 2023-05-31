package com.example.afinal.splash;

import static android.os.Build.VERSION_CODES.R;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.afinal.MainActivity;
import com.example.afinal.authentification.loginActivity;
import com.example.afinal.R;


public class SplashScreen extends AppCompatActivity {

    Animation bounceAnimation;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(com.example.afinal.R.layout.activity_splash_screen);
        imageView = findViewById(com.example.afinal.R.id.app_icon);

        bounceAnimation = AnimationUtils.loadAnimation(this, com.example.afinal.R.anim.bounce);
        imageView.startAnimation(bounceAnimation);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(SplashScreen.this, loginActivity.class));
            }
        }, 3000);
    }
}