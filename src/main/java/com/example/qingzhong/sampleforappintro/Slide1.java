package com.example.qingzhong.sampleforappintro;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by qingzhong on 24/6/15.
 */
public class Slide1 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);

        View v=inflater.inflate(R.layout.slide1,container,false);

        return v;
        //container.
       // TextView v=new TextView();
        //v.setText("fuck1");
    }
}
