package com.example.gymapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fragment_trangtt2 extends AppCompatActivity {
    @SuppressLint("WrongViewCast")
    protected void onCreate(Bundle savedInstanceState) {
        TextView tv_discover;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangtt2);
        tv_discover = findViewById(R.id.textView1);
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverIntent = new Intent(fragment_trangtt2.this, fragment_tapnguc.class);
                startActivity(ctdiscoverIntent);
            }
        });
        tv_discover = findViewById(R.id.textView52);
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverIntent = new Intent(fragment_trangtt2.this, fragment_tapnguc.class);
                startActivity(ctdiscoverIntent);
            }
        });
        tv_discover = findViewById(R.id.textView53);
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverIntent = new Intent(fragment_trangtt2.this, fragment_tapnguc.class);
                startActivity(ctdiscoverIntent);
            }
        });
        tv_discover = findViewById(R.id.textView54);
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverIntent = new Intent(fragment_trangtt2.this, fragment_tapnguc.class);
                startActivity(ctdiscoverIntent);
            }
        });
        tv_discover = findViewById(R.id.textView55);
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverIntent = new Intent(fragment_trangtt2.this, fragment_tapnguc.class);
                startActivity(ctdiscoverIntent);
            }
        });
        ImageView imageView = findViewById(R.id.xoay);

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện click vào ImageView
                Intent intent = new Intent(fragment_trangtt2.this, fragment_trangttxoay.class);
                startActivity(intent);
            }
        });
    }
}
