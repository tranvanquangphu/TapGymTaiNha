package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class fragment_lichtrinh extends AppCompatActivity {
        TextView tv_discover,tv_home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_lichtrinh);
        tv_discover = findViewById(R.id.tv_khampha);
        tv_home = findViewById(R.id.tv_home2);
        tv_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment_lichtrinh.this, trangchu.class);
                startActivity(intent);
            }
        });
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverIntent = new Intent(fragment_lichtrinh.this, fragment_discover.class);
                startActivity(ctdiscoverIntent);
            }
        });
        TextView tv_toi = findViewById(R.id.tv_toi);
        tv_toi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment_lichtrinh.this, toi.class);
                startActivity(intent);
            }
        });
        Button btn_lt2 = findViewById(R.id.btn_lt2);
        btn_lt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment_lichtrinh.this, lichtrinh2.class);
                startActivity(intent);
            }
        });
        tv_discover = findViewById(R.id.textView50);
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverIntent = new Intent(fragment_lichtrinh.this, fragment_trangpt1.class);
                startActivity(ctdiscoverIntent);
            }
        });
    }
}