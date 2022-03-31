package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4_2 extends AppCompatActivity {
    TextView topText, questionText;
    RadioGroup petList;
    CheckBox isStart;
    RadioButton isDog, isCat, isRabbit;
    Button submit;
    ImageView petPic;
    Integer selected = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_2);
        topText = (TextView) findViewById(R.id.topText);
        questionText = (TextView) findViewById(R.id.questionText);
        petList = (RadioGroup) findViewById(R.id.petList);
        isStart = (CheckBox) findViewById(R.id.isStart);
        isDog = (RadioButton) findViewById(R.id.isDog);
        isCat = (RadioButton) findViewById(R.id.isCat);
        isRabbit = (RadioButton) findViewById(R.id.isRabbit);
        submit = (Button) findViewById(R.id.submit);
        petPic = (ImageView) findViewById(R.id.petPic);
        isStart.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){//2020039080 조현창
                    questionText.setVisibility(View.VISIBLE);
                    petList.setVisibility(View.VISIBLE);
                    submit.setVisibility(View.VISIBLE);
                    petPic.setVisibility(View.VISIBLE);
                }else{
                    questionText.setVisibility(View.INVISIBLE);
                    petList.setVisibility(View.INVISIBLE);
                    submit.setVisibility(View.INVISIBLE);
                    petPic.setVisibility(View.INVISIBLE);
                }
            }
        });
        petList.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.isCat:
                        selected = R.drawable.cat;
                        break;
                    case R.id.isDog:
                        selected = R.drawable.dog;
                        break;
                    case R.id.isRabbit:
                        selected = R.drawable.rabbit;
                        break;
                    default:
                        selected = null;//2020039080 조현창

                }
            }

        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(selected != null)
                petPic.setImageDrawable(getDrawable(selected));
                else  Toast.makeText(getApplicationContext(), "동물을 선택해 주세요.", Toast.LENGTH_LONG).show();
            }
        });

    }
}