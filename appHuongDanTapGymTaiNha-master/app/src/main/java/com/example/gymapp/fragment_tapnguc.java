package com.example.gymapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class fragment_tapnguc extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        TextView tv_discover, tv_home,tv_lichtrinh,tv_toi;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tapnguc);
        ImageView imageView = findViewById(R.id.imageToanThan4); // Thay "imageToanThan2" bằng ID thực sự của ImageView

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện click vào ImageView
                Intent intent = new Intent(fragment_tapnguc.this, fragment_tapnguccon.class);
                startActivity(intent);
            }
        });
        tv_home = findViewById(R.id.textView47);
        tv_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment_tapnguc.this, trangchu.class);
                startActivity(intent);
            }
        });
        tv_discover = findViewById(R.id.tv_khampha);
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment_tapnguc.this, fragment_discover.class);
                startActivity(intent);
            }
        });
        tv_lichtrinh = findViewById(R.id.textView51);
        tv_lichtrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment_tapnguc.this, fragment_lichtrinh.class);
                startActivity(intent);
            }
        });
        tv_toi = findViewById(R.id.tv_toi);
        tv_toi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment_tapnguc.this, toi.class);
                startActivity(intent);
            }
        });
         imageView = findViewById(R.id.imageToanThan2); // Thay "imageToanThan2" bằng ID thực sự của ImageView

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện click vào ImageView
                Intent intent = new Intent(fragment_tapnguc.this, fragment_tapnguccon.class);
                startActivity(intent);
            }
        });
        imageView = findViewById(R.id.imageToanThan3); // Thay "imageToanThan2" bằng ID thực sự của ImageView

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện click vào ImageView
                Intent intent = new Intent(fragment_tapnguc.this, fragment_tapnguccon.class);
                startActivity(intent);
            }
        });
         imageView = findViewById(R.id.imageToanThan5); // Thay "imageToanThan2" bằng ID thực sự của ImageView

        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý sự kiện click vào ImageView
                Intent intent = new Intent(fragment_tapnguc.this, fragment_tapnguccon.class);
                startActivity(intent);
            }
        });
    }
}
