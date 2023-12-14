package com.example.gymapp;


import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class toi_hoso extends AppCompatActivity {
    TextView back;
    TextView editText,editText2,editText3;
    String user,ngaysinh,email;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toi_hoso);

        editText = findViewById(R.id.editText);
        editText2 = findViewById(R.id.editText2);
        back = findViewById(R.id.back);
        editText3=findViewById(R.id.editText3);
        Intent intent = getIntent();
        if (intent != null) {
            String receivedData = intent.getStringExtra("key");
            editText.setText(receivedData);
            FirebaseDatabase database = FirebaseDatabase.getInstance();
            for (int i = 1; i < 100; i++) {
                DatabaseReference loginRef = database.getReference("Tai khoan"+i); // Thay "1" bằng tên tài khoản bạn muốn lấy
                loginRef.addValueEventListener(new ValueEventListener() {
                    @Override
                    public void onDataChange(DataSnapshot dataSnapshot) {

                        if (dataSnapshot.exists()) {
                            user = dataSnapshot.child("username").getValue(String.class);
                            ngaysinh=dataSnapshot.child("birthday").getValue(String.class);
                            email=dataSnapshot.child("email").getValue(String.class);
                            // Sử dụng username và password ở đây
                            if (receivedData.equals(user)) {
                                    editText.setText(user);
                                    editText2.setText(ngaysinh);
                                    editText3.setText(email);
                            }
                        }
                    }


                    @Override
                    public void onCancelled(DatabaseError error) {
                        error.toString();
                    }
                });
            }
        }
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToAnotherActivity();
            }
        });
    }

    public void navigateToAnotherActivity() {
        Intent intent = new Intent(toi_hoso.this, toi.class);
        startActivity(intent);
    }
}