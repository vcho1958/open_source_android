package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivityM7 extends AppCompatActivity {

    Button login;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_m7);

        login = findViewById(R.id.login);

        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivityForResult(new Intent(MainActivityM7.this, MainActivityM7S.class), 0);
            }
        });
    }
    //2020039080 조현창
    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (resultCode) {
            case 1:
                Toast.makeText(MainActivityM7.this, "고객 관리", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(MainActivityM7.this, "매출 관리", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(MainActivityM7.this, "상품 관리", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}