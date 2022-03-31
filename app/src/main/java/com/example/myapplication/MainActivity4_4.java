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
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity4_4 extends AppCompatActivity {
    TextView topText, questionText;
    RadioGroup petList;
    Switch isStart;
    RadioButton isDog, isCat, isRabbit;
    Button submit, goStart;
    ImageView petPic;
    Integer selected = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main4_4);
        topText = (TextView) findViewById(R.id.topText);
        questionText = (TextView) findViewById(R.id.questionText);
        petList = (RadioGroup) findViewById(R.id.petList);
        isStart = (Switch) findViewById(R.id.isStart);
        isDog = (RadioButton) findViewById(R.id.isDog);
        isCat = (RadioButton) findViewById(R.id.isCat);
        isRabbit = (RadioButton) findViewById(R.id.isRabbit);
        submit = (Button) findViewById(R.id.submit);
        goStart = (Button) findViewById(R.id.goStart);
        petPic = (ImageView) findViewById(R.id.petPic);
        isStart.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true){//2020039080 조현창
                    questionText.setVisibility(View.VISIBLE);
                    petList.setVisibility(View.VISIBLE);
                    submit.setVisibility(View.VISIBLE);
                    petPic.setVisibility(View.VISIBLE);
                    goStart.setVisibility(View.VISIBLE);
                }else{
                    questionText.setVisibility(View.INVISIBLE);
                    petList.setVisibility(View.INVISIBLE);
                    submit.setVisibility(View.INVISIBLE);
                    petPic.setVisibility(View.INVISIBLE);
                    goStart.setVisibility(View.INVISIBLE);
                }
            }
        });
        petList.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.isCat:
                        petPic.setImageDrawable(getDrawable(R.drawable.logo10));
                        break;
                    case R.id.isDog:
                        petPic.setImageDrawable(getDrawable(R.drawable.logo11));
                        break;
                    case R.id.isRabbit:
                        petPic.setImageDrawable(getDrawable(R.drawable.logo12));
                        break;
                    default:
                        selected = null;//2020039080 조현창

                }
            }

        });

        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }
}