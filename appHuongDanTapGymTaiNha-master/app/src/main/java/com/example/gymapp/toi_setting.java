package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.example.gymapp.R;
import com.example.gymapp.toi;

public class toi_setting extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toi_settings);

        TextView back = findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToAnotherActivity();
            }
        });
    }

    public void navigateToAnotherActivity() {
        Intent intent = new Intent(toi_setting.this, toi.class);
        startActivity(intent);
    }
}