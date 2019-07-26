package com.example.lmjm1.drum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class ReadyRoom extends AppCompatActivity {

    private Button btn_back;
    private TextView tv_name;
    private Button btn_createroom;

    private ArrayList<list_item> m_arr;
    private List_Adapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ready_room);

        tv_name=findViewById(R.id.tv_name);
        Intent intent=getIntent();
        String str =intent.getStringExtra("str");
        tv_name.setText(str+"의 대기방");

        btn_back=findViewById(R.id.btn_back);
        btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_back = new Intent(ReadyRoom.this, MainActivity.class);
                startActivity(intent_back);
            }
        });

        btn_createroom=findViewById(R.id.btn_createroom);
        btn_createroom.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent_create = new Intent(ReadyRoom.this, CreateRoom.class);
                startActivity(intent_create);
            }
        });

        setList();
    }

    private void setList() {
        m_arr=new ArrayList<list_item>();
        ListView lv = (ListView)findViewById(R.id.listView1);
        m_arr.add(new list_item("타이틀1","내용1"));
        m_arr.add(new list_item("타이틀2","내용2"));
        m_arr.add(new list_item("타이틀3","내용3"));
        adapter=new List_Adapter(ReadyRoom.this,m_arr  );
        lv.setAdapter(adapter);
    }
    public void listUpdate(){
        adapter.notifyDataSetChanged();
    }
}
