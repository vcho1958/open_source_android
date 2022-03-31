package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity4_1 extends AppCompatActivity {
    EditText firstText, secondText;
    TextView answer;
    Button plus, minus, multiply, devideButton;
    Integer first, second;
    String defaultMessage = "계산 결과: ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);//2020039080 조현창
        setContentView(R.layout.activity_main4_1);

        firstText = (EditText) findViewById(R.id.firstText);
        firstText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                first = Integer.parseInt(firstText.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        secondText = (EditText) findViewById(R.id.secondText);
        secondText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                second = Integer.parseInt(secondText.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        answer = (TextView) findViewById(R.id.answer);
        plus = (Button) findViewById(R.id.plusButton);
        minus = (Button) findViewById(R.id.minusButton);
        multiply = (Button) findViewById(R.id.multiplyButton);
        devideButton = (Button) findViewById(R.id.devideButton);

        plus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(defaultMessage + String.valueOf(first+second));
            }
        });

        minus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(defaultMessage + String.valueOf(first-second));
            }
        });
        multiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(defaultMessage + String.valueOf(first*second));
            }
        });
        devideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                answer.setText(defaultMessage + String.valueOf(first/second));
            }
        });
    }
}