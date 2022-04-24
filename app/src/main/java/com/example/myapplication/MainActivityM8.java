package com.example.myapplication;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivityM8 extends AppCompatActivity {

    EditText ID, PW;
    Button loginB;
    //2020039080 조현창
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_m8);

        ID = findViewById(R.id.ID);
        PW = findViewById(R.id.PW);
        loginB = findViewById(R.id.loginB);
        //2020039080 조현창
        loginB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(ID.getText().toString().equals("") || PW.getText().toString().equals("")) {
                    Toast.makeText(MainActivityM8.this, "사용자 이름과 비밀번호를 모두 입력하세요", Toast.LENGTH_SHORT).show();
                }
                else {
                    startActivityForResult(new Intent(MainActivityM8.this, MainActivityM8menu.class), 0);
                }
            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, @Nullable Intent data) {
        super.onActivityResult(requestCode, resultCode, data);

        switch (resultCode) {
            case 1:
                Toast.makeText(MainActivityM8.this, "고객 관리", Toast.LENGTH_SHORT).show();
                break;
            case 2:
                Toast.makeText(MainActivityM8.this, "매출 관리", Toast.LENGTH_SHORT).show();
                break;
            case 3:
                Toast.makeText(MainActivityM8.this, "상품 관리", Toast.LENGTH_SHORT).show();
                break;
            default:
                break;
        }
    }
}