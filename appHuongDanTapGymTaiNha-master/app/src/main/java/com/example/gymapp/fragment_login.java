package com.example.gymapp;

import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

public class fragment_login extends AppCompatActivity {
    TextView tv_godangki;
    Button btn_login;
    String taikhoan;
    EditText tk,mk;
    int i,t;
    String user,pass;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_login);
        btn_login=findViewById(R.id.btn_login);
        tk=findViewById(R.id.editText);
        mk=findViewById(R.id.passwork);
        t=0;
        btn_login.setOnClickListener(new View.OnClickListener() {

                                         @Override
                                         public void onClick(View v) {


                                             FirebaseDatabase database = FirebaseDatabase.getInstance();
                                             for (i = 1; i < 100; i++) {
                                                 DatabaseReference loginRef = database.getReference("Tai khoan"+i); // Thay "1" bằng tên tài khoản bạn muốn lấy
                                                 loginRef.addValueEventListener(new ValueEventListener() {
                                                     @Override
                                                     public void onDataChange(DataSnapshot dataSnapshot) {

                                                         if (dataSnapshot.exists()) {
                                                             user = dataSnapshot.child("username").getValue(String.class);
                                                             pass = dataSnapshot.child("password").getValue(String.class);

                                                             // Sử dụng username và password ở đây
                                                             if (tk.getText().toString().equals(user) && mk.getText().toString().equals(pass)) {
                                                                 t = 1;
                                                                 Intent intent = new Intent(fragment_login.this, toi.class);
                                                                 intent.putExtra("key",tk.getText().toString());

                                                                 startActivity(intent);
                                                             }
                                                         }
                                                     }


                                                     @Override
                                                     public void onCancelled(DatabaseError error) {
                                                         error.toString();
                                                     }
                                                 });
                                             }
                                             if(t==0)
                                             {
                                                 Toast.makeText(fragment_login.this, "Tên đăng nhập hoặc mật khẩu không chính xác!", Toast.LENGTH_SHORT).show();
                                             }
                                         }

                                     }
        );


        tv_godangki = findViewById(R.id.tv_taotaikhoan);
        btn_login = findViewById(R.id.btn_login);
        tv_godangki.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent chuyendangkiIntent = new Intent(fragment_login.this, fragment_signin.class);


                startActivity(chuyendangkiIntent);
            }
        });
    }
}