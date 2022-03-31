package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4_3 extends AppCompatActivity {

    EditText firstText, secondText;
    TextView answer;
    Button plus, minus, multiply, devideButton, modButton;
    Double first, second;
    String defaultMessage = "계산 결과: ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_3);

        firstText = (EditText) findViewById(R.id.firstText2);
        firstText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                first = Double.parseDouble(firstText.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        secondText = (EditText) findViewById(R.id.secondText2);
        secondText.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                second = Double.parseDouble(secondText.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });

        answer = (TextView) findViewById(R.id.answer2);
        plus = (Button) findViewById(R.id.plusButton2);
        minus = (Button) findViewById(R.id.minusButton2);
        multiply = (Button) findViewById(R.id.multiplyButton2);
        devideButton = (Button) findViewById(R.id.devideButton2);
        modButton = (Button) findViewById(R.id.modButton);
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
            @Override//2020039080 조현창
            public void onClick(View view) {
                answer.setText(defaultMessage + String.valueOf(first*second));
            }
        });
        devideButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(second.doubleValue()  == 0.0) {
                    Toast.makeText(getApplicationContext(), "0으로 나눌 수 없습니다.", Toast.LENGTH_LONG).show();
                }else
                answer.setText(defaultMessage + String.valueOf(first/second));
            }
        });
        modButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                answer.setText(defaultMessage + String.valueOf(first%second));
            }
        });
    }
}