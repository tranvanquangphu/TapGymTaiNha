package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.gymapp.R;
import com.example.gymapp.UserData;
import com.example.gymapp.toi;

public class toi_favorite extends AppCompatActivity {
    TextView back;
    TextView mytv;
    EditText editText;
    Button saveButton;
    UserData userData; // Biến để lưu dữ liệu
    TextView displayTextView; // TextView để hiển thị dữ liệu

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toi_favorite);

        back = findViewById(R.id.back);
        mytv = findViewById(R.id.mytv);
        editText = findViewById(R.id.editTextToi);
        saveButton = findViewById(R.id.saveButtonToi);
        displayTextView = findViewById(R.id.displayTextView);
        editText.setVisibility(View.GONE); // Ẩn EditText ban đầu

        userData = new UserData(); // Khởi tạo đối tượng UserData

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToAnotherActivity();
            }
        });

        mytv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openEditText();
            }
        });

        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                saveData();
            }
        });
    }

    public void navigateToAnotherActivity() {
        Intent intent = new Intent(toi_favorite.this, toi.class);
        startActivity(intent);
    }

    public void openEditText() {
        editText.setVisibility(View.VISIBLE); // Hiển thị EditText khi bấm vào TextView
        mytv.setVisibility(View.GONE); // Ẩn TextView
    }

    public void saveData() {
        String inputData = editText.getText().toString();
        userData.setData(inputData); // Lưu dữ liệu vào đối tượng UserData
        // Hiển thị dữ liệu từ đối tượng UserData trong TextView
        displayTextView.setText(" " + userData.getData());
        editText.setText(""); // Xoá nội dung của EditText
        editText.setVisibility(View.GONE); // Ẩn EditText
        mytv.setVisibility(View.VISIBLE); // Hiển thị lại TextView
    }
}