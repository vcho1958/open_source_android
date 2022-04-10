package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity5_3 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main5_3);
        LinearLayout.LayoutParams param = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT
        );

        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        setContentView(baseLayout, param);
        //2020039080 조현창

        LinearLayout.LayoutParams widgetParam = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
        );
        EditText editText = new EditText(this);
        editText.setLayoutParams(widgetParam);
        editText.setText("IT Cookbook. Android");
        baseLayout.addView(editText);


        Button button = new Button(this);
        button.setLayoutParams(widgetParam);
        button.setText("버튼입니다");
        button.setGravity(Gravity.CENTER);
        baseLayout.addView(button);

        TextView textView = new TextView(this);
        textView.setLayoutParams(widgetParam);
        textView.setText("IT Cookbook. Android");
        textView.setTextColor(Color.MAGENTA);
        baseLayout.addView(textView);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textView.setText(editText.getText().toString());
            }
        });
    }



}