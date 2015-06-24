package com.example.qingzhong.sampleforappintro;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by qingzhong on 24/6/15.
 */
public class Slide1 extends Fragment {

    private String setString;

    LayoutInflater layoutInflater;
    ViewGroup viewGroup;



    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        if(savedInstanceState!=null){
            this.setString=savedInstanceState.getString("fuck");
        }
        super.onCreate(savedInstanceState);
    }

    public void setSetString(String s){
        this.setString=s;

    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
       // return super.onCreateView(inflater, container, savedInstanceState);
        //TextView t=new TextView(getActivity());
        this.layoutInflater=inflater;
        this.viewGroup=container;
        View v=inflater.inflate(R.layout.slide1,container,false);

        TextView textView=(TextView)v.findViewById(R.id.slidetext);

        if(this.setString!=null){
            textView.setText(this.setString);
        }
        else
        {
            Toast.makeText(getActivity(),"omg",Toast.LENGTH_SHORT).show();
        }

       // t.setText(this.setString);

        return v;
        //container.
       // TextView v=new TextView();
        //v.setText("fuck1");
    }
}
