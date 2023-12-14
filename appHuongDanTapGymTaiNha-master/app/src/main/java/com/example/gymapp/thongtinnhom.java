package com.example.gymapp;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class thongtinnhom extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thongtinnhom);
        Button btn_back = findViewById(R.id.btn_back);
       btn_back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyentrangchuIntent = new Intent(thongtinnhom.this, toi.class);
                startActivity(chuyentrangchuIntent);
            }
        });
    }

}