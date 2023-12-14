package com.example.gymapp;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;

public class fragment_tapnguccon extends AppCompatActivity {
    protected void onCreate(Bundle savedInstanceState) {
        TextView tv_discover, tv_home,tv_lichtrinh,tv_toi;
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tapnguccon);
        VideoView videoView=findViewById(R.id.videoView);
        String videoPath="android.resource://"+getPackageName()+"/"+R.raw.videocd;
        Uri uri = Uri.parse(videoPath);
        videoView.setVideoURI(uri);
        MediaController mediaController=new MediaController(this);
        videoView.setMediaController(mediaController);
        mediaController.setAnchorView(videoView);

        tv_home = findViewById(R.id.textView47);
        tv_home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment_tapnguccon.this, trangchu.class);
                startActivity(intent);
            }
        });
        tv_discover = findViewById(R.id.tv_khampha);
        tv_discover.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment_tapnguccon.this, fragment_discover.class);
                startActivity(intent);
            }
        });
        tv_lichtrinh = findViewById(R.id.textView51);
        tv_lichtrinh.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment_tapnguccon.this, fragment_lichtrinh.class);
                startActivity(intent);
            }
        });
        tv_toi = findViewById(R.id.tv_toi);
        tv_toi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(fragment_tapnguccon.this, toi.class);
                startActivity(intent);
            }
        });
    }
}
