package com.example.myapplication;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.RadioGroup;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity2_7 extends AppCompatActivity {
    Button webButton, charButton;
    RadioGroup radioGroup;
    EditText toastText;
    ImageView logo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2_7);
        webButton = (Button) findViewById(R.id.webButton);
        charButton = (Button) findViewById(R.id.charButton);
        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        toastText = (EditText) findViewById(R.id.toastText);
        logo = (ImageView) findViewById(R.id.logo);
        charButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), toastText.getText(), Toast.LENGTH_SHORT).show();
            }
        });
        webButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("https://naver.com"));
                startActivity(intent);
            }
        });
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch(i){
                    case R.id.radioButton:
                        logo.setImageDrawable(getDrawable(R.drawable.logo11));
                        break;
                    case R.id.radioButton2:
                        logo.setImageDrawable(getDrawable(R.drawable.logo12));
                }
            }
        });


    }
}