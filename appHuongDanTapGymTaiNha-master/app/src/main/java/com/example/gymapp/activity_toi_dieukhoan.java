package com.example.gymapp;

import androidx.appcompat.app.AppCompatActivity;
import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class activity_toi_dieukhoan extends AppCompatActivity {
    ListView lvTerms;
    ArrayList<String> arrayTerms;
    ArrayAdapter adapter;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_toi_dieukhoan);

        lvTerms = findViewById(R.id.listviewHoang);
        arrayTerms = new ArrayList<>();

        adapter = new ArrayAdapter(this, android.R.layout.simple_list_item_1, arrayTerms);
        lvTerms.setAdapter(adapter);

        new ReadJSON().execute("https://hoang472003.github.io/json/Dieukhoan.json");

        // Thêm sự kiện click cho TextView có ID tvback
        TextView tvBack = findViewById(R.id.tvback);
        tvBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Chuyển về trang activity_toi khi click vào tvback
                Intent intent = new Intent(activity_toi_dieukhoan.this, toi.class);
                startActivity(intent);
            }
        });
    }

    private class ReadJSON extends AsyncTask<String, Void, String> {
        @Override
        protected String doInBackground(String... strings) {
            StringBuilder content = new StringBuilder();
            try {
                URL url = new URL(strings[0]);

                InputStreamReader inputStreamReader = new InputStreamReader(url.openConnection().getInputStream());
                BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
                String line;
                while ((line = bufferedReader.readLine()) != null) {
                    content.append(line);
                }

                bufferedReader.close();

            } catch (MalformedURLException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

            return content.toString();
        }

        @Override
        protected void onPostExecute(String s) {
            super.onPostExecute(s);
            try {
                // Đầu tiên, chúng ta lấy đối tượng JSON chính
                JSONObject jsonObject = new JSONObject(s);

                // Sau đó, lấy đối tượng JSON từ phần "terms_and_conditions"
                JSONObject termsAndConditions = jsonObject.getJSONObject("terms_and_conditions");

                // Lấy mảng "content" từ phần "terms_and_conditions"
                JSONArray termsContent = termsAndConditions.getJSONArray("content");

                // Duyệt qua mảng và thêm nội dung vào danh sách
                for (int i = 0; i < termsContent.length(); i++) {
                    String term = termsContent.getString(i);
                    arrayTerms.add(term);
                }

                // Cập nhật adapter để hiển thị dữ liệu lên ListView
                adapter.notifyDataSetChanged();

            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    }
}
