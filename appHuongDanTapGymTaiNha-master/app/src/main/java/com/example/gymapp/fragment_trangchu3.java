package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.TextView;


public class fragment_trangchu3 extends AppCompatActivity {
    TextView tv_nexttc4,tv_backtc1, tv_demnguoc1;
    CountDownTimer countDownTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_trangchu3);
        tv_nexttc4 = findViewById(R.id.tv_nexttc4);
        tv_backtc1 = findViewById(R.id.tv_backtc1);
        tv_demnguoc1 = findViewById(R.id.tv_demnguoc1);
        tv_nexttc4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cttrangchu2Intent = new Intent(fragment_trangchu3.this, trangchu4.class);
                startActivity(cttrangchu2Intent);
            }
        });
        tv_backtc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cttrangchu2Intent = new Intent(fragment_trangchu3.this, trangchu.class);
                startActivity(cttrangchu2Intent);
            }
        });
        long totalTimeInMillis = 30000;
        long intervalInMillis = 1000;
        countDownTimer = new CountDownTimer(totalTimeInMillis, intervalInMillis) {
            @Override
            public void onTick(long millisUntilFinished) {
                // Cập nhật giao diện người dùng sau mỗi lần đếm ngược
                long seconds = millisUntilFinished / 1000;
                tv_demnguoc1.setText("" + seconds);
            }
            @Override
            public void onFinish() {
                // Xử lý khi đếm ngược kết thúc
                Intent cttrangchu2Intent = new Intent(fragment_trangchu3.this, trangchu4.class);
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