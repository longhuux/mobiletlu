package com.example.myapplication.tuan1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.example.myapplication.R;

public class Tuan1MainActivity extends AppCompatActivity {
    EditText txt1,txt2;
    Button submit;
    TextView tv1;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tuan1_main);
        txt1=findViewById(R.id.input1);
        txt2=findViewById(R.id.input2);
        submit=findViewById(R.id.submit);
        tv1=findViewById(R.id.result);
        
        submit.setOnClickListener(v->{
            sum();
        });
    }

    private void sum() {
        String str1=txt1.getText().toString();
        float num1=Float.parseFloat(str1);
        String str2=txt2.getText().toString();
        float num2=Float.parseFloat(str2);
        float result=num2+num1;
        
        tv1.setText(String.valueOf(result));
    }
}