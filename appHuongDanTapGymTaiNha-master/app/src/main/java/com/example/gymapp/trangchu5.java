package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class trangchu5 extends AppCompatActivity {
    TextView tv_backhome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu5);
        tv_backhome = findViewById(R.id.tv_backhome);
        tv_backhome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(trangchu5.this, trangchu.class);
                startActivity(intent);
            }
        });
    }
}