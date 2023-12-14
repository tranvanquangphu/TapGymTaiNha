package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class trangchu4 extends AppCompatActivity {
    Button btn_nexttc5, btn_backtc1;
    TextView tv_demnguoc2;
    CountDownTimer countDownTimer;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu4);
        btn_nexttc5 = findViewById(R.id.nexttc5);
        btn_backtc1 = findViewById(R.id.btn_backtc1);
        tv_demnguoc2 = findViewById(R.id.tv_demnguoc2);
        btn_nexttc5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cttrangchu2Intent = new Intent(trangchu4.this, trangchu5.class);
                startActivity(cttrangchu2Intent);
            }
        });
        btn_backtc1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cttrangchu2Intent = new Intent(trangchu4.this, trangchu.class);
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
                tv_demnguoc2.setText("" + seconds);
            }
            @Override
            public void onFinish() {
                // Xử lý khi đếm ngược kết thúc
                Intent cttrangchu2Intent = new Intent(trangchu4.this, fragment_trangchu3.class);
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