package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.myapplication.R;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
// Tuan21MainActivity.java
public class Tuan21MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan21_main);

        Button btnCalculate = findViewById(R.id.btnCalculate);
        btnCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Lấy giá trị từ EditText
                EditText editTextNumber1 = findViewById(R.id.editTextNumber1);
                EditText editTextNumber2 = findViewById(R.id.editTextNumber2);

                String num1Str = editTextNumber1.getText().toString();
                String num2Str = editTextNumber2.getText().toString();

                // Kiểm tra xem có giá trị nhập vào không
                if (!num1Str.isEmpty() && !num2Str.isEmpty()) {
                    // Chuyển giá trị sang kiểu số
                    int num1 = Integer.parseInt(num1Str);
                    int num2 = Integer.parseInt(num2Str);

                    // Tính tổng
                    int sum = num1 + num2;

                    // Chuyển kết quả sang Tuan21ResultActivity
                    Intent intent = new Intent(Tuan21MainActivity.this, Tuan21ResultActivity.class);
                    intent.putExtra("SUM_RESULT", sum);
                    startActivity(intent);
                } else {
                    // Hiển thị thông báo nếu không có giá trị nhập vào
                    Toast.makeText(Tuan21MainActivity.this, "Please enter both numbers", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
