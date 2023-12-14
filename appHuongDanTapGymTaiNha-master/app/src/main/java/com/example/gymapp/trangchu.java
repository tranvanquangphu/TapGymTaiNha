package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class trangchu extends AppCompatActivity {

    ImageView img_nguoibatdau;
    TextView tv_discover,tv_lichtrinh;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu);

        img_nguoibatdau = findViewById(R.id.img_nguoibaidau);
        img_nguoibatdau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện khi ImageView 'img_nguoibatdau' được nhấn
                // Chuyển đến trang 'fragment_hompage1'
                Intent intent = new Intent(trangchu.this, trangchu1.class);
                startActivity(intent);
            }
        });
        img_nguoibatdau = findViewById(R.id.img_trungbinh);
        img_nguoibatdau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện khi ImageView 'img_nguoibatdau' được nhấn
                // Chuyển đến trang 'fragment_hompage1'
                Intent intent = new Intent(trangchu.this, trangchu1.class);
                startActivity(intent);
            }
        });
        img_nguoibatdau = findViewById(R.id.img_nangcao);
        img_nguoibatdau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện khi ImageView 'img_nguoibatdau' được nhấn
                // Chuyển đến trang 'fragment_hompage1'
                Intent intent = new Intent(trangchu.this, trangchu1.class);
                startActivity(intent);
            }
        });
        tv_discover = findViewById(R.id.tv_discover);
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(trangchu.this, fragment_discover.class);
                startActivity(intent);
            }
        });

        tv_lichtrinh = findViewById(R.id.tv_lichtrinh);
        tv_lichtrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(trangchu.this, fragment_lichtrinh.class);
                startActivity(intent);
            }
        });
        TextView tv_toi = findViewById(R.id.tv_toi);
        tv_toi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(trangchu.this, toi.class);
                startActivity(intent);
            }
        });
        tv_discover = findViewById(R.id.textView50);
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverIntent = new Intent(trangchu.this, fragment_trangpt1.class);
                startActivity(ctdiscoverIntent);
            }
        });
    }
}
