package com.example.lmjm1.drum;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    private EditText et_id ;
    private Button btn_login;
    private String str;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        et_id=findViewById(R.id.et_id);

        btn_login=findViewById(R.id.btn_login);
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                str=et_id.getText().toString();
                Intent intent = new Intent(MainActivity.this, ReadyRoom.class);
                intent.putExtra("str",str);
                startActivity(intent);
            }
        });
    }
}
