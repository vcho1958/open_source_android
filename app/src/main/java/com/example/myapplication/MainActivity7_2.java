package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.ContextMenu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity7_2 extends AppCompatActivity {
    LinearLayout baseLayout;
    Button button1, button2;
    //2020039080 조현창
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7_2);
        setTitle("배경색 바꾸기(컨텍스트)");
        baseLayout = findViewById(R.id.baseLayout);
        button1 = findViewById(R.id.buttonq);
        registerForContextMenu(button1);
        button2 = findViewById(R.id.button2);
        registerForContextMenu(button2);
    }

    @Override
    public void onCreateContextMenu(ContextMenu menu, View v, ContextMenu.ContextMenuInfo menuInfo) {
        super.onCreateContextMenu(menu, v, menuInfo);

        MenuInflater menuInflater = getMenuInflater();
        if (v == button1) {
            menu.setHeaderTitle("배경색 변경");
            menuInflater.inflate(R.menu.menu1, menu);
        }
        if (v == button2) {
            menu.setHeaderTitle("버튼 변경");
            menuInflater.inflate(R.menu.menu2, menu);
        }
    }

    @Override
    public boolean onContextItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.red:
                baseLayout.setBackgroundColor(Color.RED);
                return true;
            case R.id.blue:
                baseLayout.setBackgroundColor(Color.BLUE);
                return true;
            case R.id.green:
                baseLayout.setBackgroundColor(Color.GREEN);
                return true;
            case R.id.rotate:
                button2.setRotation(45);
                return true;
            case R.id.size:
                button2.setScaleX(2);
                return true;
        }
        return true;
    }
}