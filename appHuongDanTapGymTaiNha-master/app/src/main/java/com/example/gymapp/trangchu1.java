package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;

public class trangchu1 extends AppCompatActivity {
    TextView tv_nexttc2;
    ImageView img_nexttc2;
    Button btn_batdau;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu1);
        tv_nexttc2 = findViewById(R.id.textView_batnhay);
        btn_batdau = findViewById(R.id.btn_batdau);
        img_nexttc2 = findViewById(R.id.img_batnhay);
        img_nexttc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(trangchu1.this, trangchu_2.class);
                startActivity(intent);
            }
        });
        btn_batdau.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(trangchu1.this, trangchu_2.class);
                startActivity(intent);
            }
        });
        tv_nexttc2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(trangchu1.this, trangchu_2.class);
                startActivity(intent);
            }
        });

        // Tìm nút 'arrow_back' theo ID và thiết lập sự kiện click
        TextView arrowBack = findViewById(R.id.arrow_back);
        arrowBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Xử lý khi TextView 'arrow_back' được nhấn
                // Tạo Intent để chuyển về MainActivity
                Intent intent = new Intent(trangchu1.this, trangchu.class);
                startActivity(intent);
            }
        });
    }
}
