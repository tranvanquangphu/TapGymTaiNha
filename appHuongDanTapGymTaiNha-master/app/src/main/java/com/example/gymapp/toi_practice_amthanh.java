package com.example.gymapp;



import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.VideoView;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;

public class toi_practice_amthanh extends AppCompatActivity {
    private VideoView video1;
    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toi_practice_amthanh);

        // Liên kết VideoView và TextView từ layout XML
        video1 = findViewById(R.id.video1);
        textView = findViewById(R.id.textView);

        // Đường dẫn của video (thay thế bằng đường dẫn video của bạn)
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.ba107;
        video1.setVideoURI(Uri.parse(videoPath));

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (video1.isPlaying()) {
                    // Dừng video nếu đang phát
                    video1.pause();
                    textView.setText("Play Video");
                } else {
                    // Phát video nếu đang dừng
                    video1.start();
                    textView.setText("Pause Video");
                }
            }
        });

        // Thiết lập sự kiện nhấn nút back để chuyển đến activity khác
        TextView back = findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navigateToAnotherActivity();
            }
        });
    }

    public void navigateToAnotherActivity() {
        Intent intent = new Intent(toi_practice_amthanh.this, toi_practice.class);
        startActivity(intent);
    }
}