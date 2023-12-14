package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.Calendar;

public class fragment_signin extends AppCompatActivity {
    Button BT;
    int i;
    EditText tk,mk, email,birthday;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fragment_signin);
        BT=findViewById(R.id.button2);
        tk=findViewById(R.id.editText6);
        mk=findViewById(R.id.editText9);
        email=findViewById(R.id.editText7);
        birthday=findViewById(R.id.editText8);
        i=1;
        BT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                FirebaseDatabase database = FirebaseDatabase.getInstance();
                DatabaseReference myRef = database.getReference("Tai khoan" + i);
                myRef.child("username").setValue(tk.getText().toString());
                myRef.child("password").setValue(mk.getText().toString());
                myRef.child("email").setValue(email.getText().toString());
                myRef.child("birthday").setValue(birthday.getText().toString());
                i++;

                Intent chuyendangkiIntent = new Intent(fragment_signin.this, fragment_login.class);
                startActivity(chuyendangkiIntent);
            }

        });

    }
    public void btnDate_click(View view){
        Calendar celandar = Calendar.getInstance();

        int year = celandar.get(Calendar.YEAR);
        int month = celandar.get(Calendar.MONTH);
        int day = celandar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(this,
                new DatePickerDialog.OnDateSetListener() {
                    @Override
                    public void onDateSet(DatePicker view, int year, int month, int dayOfMonth) {
                        birthday.setText(String.format("%d/%d/%d", dayOfMonth, (month+1), year));
                    }
                },year,month,day);
        datePickerDialog.show();
    }
}