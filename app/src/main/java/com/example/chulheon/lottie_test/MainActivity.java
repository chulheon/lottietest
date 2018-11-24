package com.example.chulheon.lottie_test;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.airbnb.lottie.LottieAnimationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LottieAnimationView lottie = (LottieAnimationView) findViewById(R.id.lottie);
        lottie.playAnimation();
        lottie.loop(true);

        LottieAnimationView lottie2 = (LottieAnimationView) findViewById(R.id.lottie2);
        lottie2.playAnimation();
        lottie2.loop(true);

        LottieAnimationView lottie3 = (LottieAnimationView) findViewById(R.id.lottie3);
        lottie3.playAnimation();
        lottie3.loop(true);
    }
}
