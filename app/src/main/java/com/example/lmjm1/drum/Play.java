package com.example.lmjm1.drum;

import android.content.pm.ActivityInfo;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class Play extends AppCompatActivity {

    ConstraintLayout play;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
       // play=(ConstraintLayout)findViewById(R.id.play);
        //play.setBackgroundResource(R.drawable.background1);


    }
}
