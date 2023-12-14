package com.example.gymapp;



import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class toi_suppost extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toi_suppost);

        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView back = findViewById(R.id.back);
        TextView secondTextView = findViewById(R.id.textView25); // Thêm TextView mới

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToMainActivity();
            }
        });

        secondTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToMainActivity();
            }
        });
    }

    public void navigateToMainActivity() {
        Intent intent = new Intent(toi_suppost.this, fragment_login.class);
        startActivity(intent);
    }
}
