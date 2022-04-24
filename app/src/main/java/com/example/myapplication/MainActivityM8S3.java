package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivityM8S3 extends AppCompatActivity {

    Button menu3, goLogin3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_m8_s3);

        goLogin3 = findViewById(R.id.goLogin3);
        menu3 = findViewById(R.id.menu3);

        menu3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(3);
                finish();
            }
        });

        goLogin3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                setResult(3 + 3);
                finish();
            }
        });
    }
}