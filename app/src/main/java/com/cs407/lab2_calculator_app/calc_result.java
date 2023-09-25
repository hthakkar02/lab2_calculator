package com.cs407.lab2_calculator_app;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class calc_result extends AppCompatActivity {

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calc_result);
        textView=(TextView) findViewById((R.id.textView2));
        Intent intent = getIntent();
        String str =intent.getStringExtra("message");
        textView.setText(str);
    }
}