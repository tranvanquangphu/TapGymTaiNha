package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class trangchu_2 extends AppCompatActivity {
    TextView countdownTextView, tv_backtc2;
    CountDownTimer countDownTimer;
    Button btn_start;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu2);
        countdownTextView = findViewById(R.id.tv_demnguoc);
        btn_start = findViewById(R.id.btn_batdau);
        tv_backtc2 =findViewById(R.id.tv_backtc2);
        tv_backtc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cttrangchu2Intent = new Intent(trangchu_2.this, trangchu.class);
                startActivity(cttrangchu2Intent);
            }
        });
        btn_start.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent chuyentrangltIntent = new Intent(trangchu_2.this, fragment_trangchu3.class);
                startActivity(chuyentrangltIntent);
            }
        });

        long totalTimeInMillis = 30000;
        long intervalInMillis = 1000;
        countDownTimer = new CountDownTimer(totalTimeInMillis, intervalInMillis) {
            @Override
            public void onTick(long millisUntilFinished) {
                // Cập nhật giao diện người dùng sau mỗi lần đếm ngược
                long seconds = millisUntilFinished / 1000;
                countdownTextView.setText("" + seconds);
            }
            @Override
            public void onFinish() {
                // Xử lý khi đếm ngược kết thúc
                Intent cttrangchu2Intent = new Intent(trangchu_2.this, fragment_trangchu3.class);
                startActivity(cttrangchu2Intent);
            }
        };

        // Bắt đầu đếm ngược
        countDownTimer.start();
    }

    @Override
    protected void onStop() {
        super.onStop();
        // Ngừng đếm ngược khi ứng dụng bị dừng
        if (countDownTimer != null) {
            countDownTimer.cancel();
        }
    }
}