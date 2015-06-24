package com.example.qingzhong.sampleforappintro;

import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
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

        Slide1 slide1=new Slide1();
        slide1.setSetString("fuck");
       // Bundle b=new Bundle();
        //b.putString("fuck","fuck");
        //slide1.setArguments(b);


        Slide1 slide2=new Slide1();
        slide2.setSetString("suck");


        Slide1 slide3=new Slide1();
        slide3.setSetString("boobs");


        Slide1 slide4=new Slide1();
        slide4.setSetString("OMFG");
        addSlide(slide1, getApplicationContext());
        addSlide(slide2,getApplicationContext());


        addSlide(slide3,getApplicationContext());

        addSlide(slide4,getApplicationContext());

        // Hide Skip button
        showSkipButton(true);

        // Turn vibration on and set intensity
        // NOTE: you will probably need to ask VIBRATE permesssion in Manifest
        setVibrate(true);
        setVibrateIntensity(30);
    }


}
