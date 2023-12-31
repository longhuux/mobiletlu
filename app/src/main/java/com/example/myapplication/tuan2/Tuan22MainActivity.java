package com.example.myapplication.tuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import com.example.myapplication.R;

import java.util.Arrays;
import java.util.List;

// Tuan22MainActivity.java
public class Tuan22MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan22_main);

        // Danh sách các tháng
        List<String> months = Arrays.asList(
                "January", "February", "March", "April", "May", "June",
                "July", "August", "September", "October", "November", "December"
        );

        // Tạo ArrayAdapter và liên kết Adapter với ListView
        ArrayAdapter<String> monthAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, months);
        ListView listViewMonths = findViewById(R.id.listViewMonths);
        listViewMonths.setAdapter(monthAdapter);

        // Xử lý sự kiện khi một tháng được chọn
        listViewMonths.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long id) {
                String selectedMonth = months.get(position);
                Toast.makeText(Tuan22MainActivity.this, "Selected Month: " + selectedMonth, Toast.LENGTH_SHORT).show();
            }
        });
    }
}
