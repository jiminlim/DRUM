package com.example.lmjm1.drum;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Room extends AppCompatActivity {

    private Button btn_back;
    private Button friend1;
    private Button start;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_room);

        btn_back=findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_back = new Intent(Room.this, ReadyRoom.class);
                startActivity(intent_back);
            }
        });

        friend1=findViewById(R.id.friend1);
        friend1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Room.this, Play.class);
                startActivity(intent);
            }
        });

        start=findViewById(R.id.start);
        start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Room.this, Play.class);
                startActivity(intent);
            }
        });
    }

}
