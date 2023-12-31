package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.R;
import android.widget.TextView;
// Tuan21ResultActivity.java
public class Tuan21ResultActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21_result);

        TextView textViewResult = findViewById(R.id.textViewResult);

        // Nhận kết quả từ Intent
        int result = getIntent().getIntExtra("SUM_RESULT", 0);

        // Hiển thị kết quả
        textViewResult.setText("Result: " + result);
    }
}
