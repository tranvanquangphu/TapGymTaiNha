package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class fragment_discover1 extends AppCompatActivity {
    Button btn_close;
    TextView tv_next,tv_demo;
    ImageView img_nextds2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_discover1);
        btn_close = findViewById(R.id.bt_close_discover);
        tv_demo = findViewById(R.id.textView42);
        tv_next = findViewById(R.id.tv_nextds2);
        img_nextds2 = findViewById(R.id.imageView4);
        img_nextds2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverltIntent = new Intent(fragment_discover1.this, fragment_discover2.class);
                startActivity(ctdiscoverltIntent);
            }
        });
        tv_next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverltIntent = new Intent(fragment_discover1.this, fragment_discover2.class);
                startActivity(ctdiscoverltIntent);
            }
        });
        tv_demo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverltIntent = new Intent(fragment_discover1.this, fragment_discover2.class);
                startActivity(ctdiscoverltIntent);
            }
        });
        btn_close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverltIntent = new Intent(fragment_discover1.this, fragment_discover.class);
                startActivity(ctdiscoverltIntent);
            }
        });

    }

}