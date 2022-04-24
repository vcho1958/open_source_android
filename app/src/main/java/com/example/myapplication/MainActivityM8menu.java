package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivityM8menu extends AppCompatActivity {
    Button consumer, benefit, items;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_m8menu);

        consumer = findViewById(R.id.consumer);
        benefit = findViewById(R.id.benefit);
        items = findViewById(R.id.items);

        consumer.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MainActivityM8menu.this, MainActivityM8S1.class), 0);
            }
        });
        benefit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MainActivityM8menu.this, MainActivityM8S2.class), 0);
            }
        });
        items.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MainActivityM8menu.this, MainActivityM8S3.class), 0);
            }
        });
    }


    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (resultCode) {
            case 1:
                Toast.makeText(MainActivityM8menu.this, "고객 관리", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(MainActivityM8menu.this, "매출 관리", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(MainActivityM8menu.this, "상품 관리", Toast.LENGTH_SHORT).show();
                break;
            default:
                setResult(resultCode - 3);
                finish();
                break;
        }
    }
}