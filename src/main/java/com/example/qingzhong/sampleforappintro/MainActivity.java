package com.example.qingzhong.sampleforappintro;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.widget.Toast;

import com.github.paolorotolo.appintro.AppIntro;


public class MainActivity extends AppIntro {

    @Override
    public void onSkipPressed() {

        Toast.makeText(getApplicationContext(),"skip clicked",Toast.LENGTH_SHORT).show();
    }

    @Override
    public void onDonePressed() {
        Toast.makeText(getApplicationContext(),"done clicked",Toast.LENGTH_SHORT).show();


    }

    @Override
    public void init(@Nullable Bundle bundle) {

        setBarColor(Color.parseColor("#3F51B5"));
        setSeparatorColor(Color.parseColor("#2196F3"));

        addSlide(new Slide1(),getApplicationContext());
        addSlide(new Fragment(),getApplicationContext());


        addSlide(new Fragment(),getApplicationContext());

        addSlide(new Fragment(),getApplicationContext());

        // Hide Skip button
        showSkipButton(true);

        // Turn vibration on and set intensity
        // NOTE: you will probably need to ask VIBRATE permesssion in Manifest
        setVibrate(true);
        setVibrateIntensity(30);
    }


}
