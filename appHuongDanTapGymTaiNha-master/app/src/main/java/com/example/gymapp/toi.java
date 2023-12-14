package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class toi extends AppCompatActivity {
    TextView home,discover, pt, lichtrinh,chao,dieuKhoan;
    Button DangXuat;
    String username;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toi);
        home = findViewById(R.id.tv_home);
        DangXuat=findViewById(R.id.dangxuat);
        discover = findViewById(R.id.tv_discover);
        pt = findViewById(R.id.tv_pt);
        dieuKhoan=findViewById(R.id.textView10);
        chao=findViewById(R.id.welcomeText);
        lichtrinh = findViewById(R.id.tv_lichtrinh);
        Intent intent = getIntent();
        if (intent != null) {
            String receivedData = intent.getStringExtra("key");
            username=receivedData;
            chao.setText("Xin chào "+receivedData);
        }

        DangXuat.setOnClickListener(new View.OnClickListener() {
                                  @Override
                                  public void onClick(View v) {


                                      Intent chuyendangkiIntent = new Intent(toi.this, fragment_login.class);
                                      startActivity(chuyendangkiIntent);
                                  }

                              });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, trangchu.class);
                startActivity(intent);
            }
        });
        discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, fragment_discover.class);
                startActivity(intent);
            }
        });
        dieuKhoan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, activity_toi_dieukhoan.class);
                startActivity(intent);
            }
        });
        lichtrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, fragment_lichtrinh.class);
                startActivity(intent);
            }
        });
        TextView tv_hosotoi = findViewById(R.id.tv_hosotoi);
        tv_hosotoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, toi_hoso.class);
                intent.putExtra("key",username);

                startActivity(intent);
            }
        });
        TextView tv_favorite = findViewById(R.id.textView2);
        tv_favorite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, toi_favorite.class);
                startActivity(intent);
            }
        });
        TextView tv_practice = findViewById(R.id.textView4);
        tv_practice.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, toi_practice.class);
                startActivity(intent);
            }
        });
        TextView tv_setting = findViewById(R.id.textView5);
        tv_setting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, toi_setting.class);
                startActivity(intent);
            }
        });

        TextView tv_language = findViewById(R.id.textView6);
        tv_language.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, toi_language.class);
                startActivity(intent);
            }
        });
       TextView tv_suppost = findViewById(R.id.textView8);
        tv_suppost.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(toi.this, thongtinnhom.class);
                startActivity(intent);
            }
        });
        View tv_discover = findViewById(R.id.tv_pt);
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent ctdiscoverIntent = new Intent(toi.this, fragment_trangpt1.class);
                startActivity(ctdiscoverIntent);
            }
        });
    }
}