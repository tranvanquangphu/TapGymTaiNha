package com.example.gymapp;


import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class toi_practice extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toi_practice);

        // Ánh xạ TextView "back"
        TextView back = findViewById(R.id.back);

        // Ánh xạ TextView "anotherTextView"
        TextView anotherTextView = findViewById(R.id.textView17);

        // Ánh xạ TextView "thirdTextView"
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView thirdTextView = findViewById(R.id.textView18);

        // Thiết lập sự kiện khi nhấn vào TextView "back"
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToMainActivity();
            }
        });

        // Thiết lập sự kiện khi nhấn vào TextView "anotherTextView"
        anotherTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToNewActivity();
            }
        });

        // Thiết lập sự kiện khi nhấn vào TextView "thirdTextView"
        thirdTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToThirdActivity();
            }
        });
    }

    // Phương thức để chuyển về MainActivity
    public void navigateToMainActivity() {
        Intent intent = new Intent(toi_practice.this, toi.class);
        startActivity(intent);
    }

    // Phương thức để chuyển đến trang mới (NewActivity)
    public void navigateToNewActivity() {
        Intent intent = new Intent(toi_practice.this, toi_practice_amthanh.class);
        startActivity(intent);
    }

    // Phương thức để chuyển đến trang thứ ba (ThirdActivity)
    public void navigateToThirdActivity() {
        Intent intent = new Intent(toi_practice.this, toi_practice_hengio.class);
        startActivity(intent);
    }
}
