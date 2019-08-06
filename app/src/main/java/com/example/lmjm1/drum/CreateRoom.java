package com.example.lmjm1.drum;

import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class CreateRoom extends AppCompatActivity {
    private Button btn_back;
    private Button btn_create;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_room);

        btn_create=findViewById(R.id.btn_create);
        btn_create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(CreateRoom.this, Room.class);
                startActivity(intent);
            }
        });

        btn_back=findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_back = new Intent(CreateRoom.this, ReadyRoom.class);
                startActivity(intent_back);
            }
        });

    }
}
