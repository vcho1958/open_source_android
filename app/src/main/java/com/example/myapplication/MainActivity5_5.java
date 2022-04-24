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

public class MainActivity5_5 extends AppCompatActivity {
    EditText Edit1, Edit2;
    Button BtnAdd, BtnSub, BtnDiv, BtnMul;
    Button[] BtnNums = new Button[10];
    TextView textResult;
    Integer first, second;
    String defaultMessage = "계산 결과: ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main5_5);
        BtnAdd = (Button) findViewById(R.id.BtnAdd);
        BtnSub = (Button) findViewById(R.id.BtnSub);
        BtnMul = (Button) findViewById(R.id.BtnMul);
        BtnDiv = (Button) findViewById(R.id.BtnDiv);
        Edit1 = (EditText) findViewById(R.id.Edit1);
        Edit2 = (EditText) findViewById(R.id.Edit2);
        textResult = (TextView) findViewById(R.id.TextResult);
        Integer[] ids = {R.id.button0,R.id.buttonq,R.id.button2,R.id.button3, R.id.button4,
                R.id.button5, R.id.button6, R.id.button7, R.id.button8, R.id.button9};
        for(int i = 0; i < 10; i++){
            BtnNums[i] = (Button) findViewById(ids[i]);
            int finalI = i;
            BtnNums[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if(Edit1.isFocused()){
                        first = finalI;
                        Edit1.setText(first.toString());
                    }else if(Edit2.isFocused()){
                        second = finalI;
                        Edit2.setText(second.toString());
                    }else{
                        Toast.makeText(getApplicationContext(), "먼저 에디트 텍스트를 선택하세요", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
        Edit1.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                first = Integer.parseInt(Edit1.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        Edit2.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) {

            }

            @Override
            public void onTextChanged(CharSequence charSequence, int i, int i1, int i2) {
                second = Integer.parseInt(Edit2.getText().toString());
            }

            @Override
            public void afterTextChanged(Editable editable) {

            }
        });
        BtnAdd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer result = first+second;
                textResult.setText(defaultMessage+ result.toString());
            }
        });

        BtnSub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer result = first-second;
                textResult.setText(defaultMessage+ result.toString());
            }
        });
//2020039080 조현창
        BtnMul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer result = first*second;
                textResult.setText(defaultMessage+ result.toString());
            }
        });

        BtnDiv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Integer result = first/second;
                textResult.setText(defaultMessage+ result.toString());
            }
        });
    }
}