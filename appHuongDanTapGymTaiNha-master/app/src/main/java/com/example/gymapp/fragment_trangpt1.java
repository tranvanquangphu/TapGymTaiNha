package com.example.gymapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fragment_trangpt1 extends AppCompatActivity {
    @SuppressLint({"WrongViewCast", "MissingInflatedId"})
    protected void onCreate(Bundle savedInstanceState) {
        TextView tv_discover;
     super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_trangpt);
        tv_discover = findViewById(R.id.textView51);
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverIntent = new Intent(fragment_trangpt1.this, fragment_lichtrinh.class);
                startActivity(ctdiscoverIntent);
            }
        });
        ImageView imageView = findViewById(R.id.imageToanThan); // Thay "imageToanThan2" bằng ID thực sự của ImageView

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện click vào ImageView
                Intent intent = new Intent(fragment_trangpt1.this, fragment_trangtt.class);
                startActivity(intent);
            }
        });
        tv_discover = findViewById(R.id.textView47);
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverIntent = new Intent(fragment_trangpt1.this, trangchu.class);
                startActivity(ctdiscoverIntent);
            }
        });
        tv_discover = findViewById(R.id.tv_khampha);
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverIntent = new Intent(fragment_trangpt1.this, fragment_discover.class);
                startActivity(ctdiscoverIntent);
            }
        });
        tv_discover = findViewById(R.id.idtoi);
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverIntent = new Intent(fragment_trangpt1.this, toi.class);
                startActivity(ctdiscoverIntent);
            }
        });
}
}
