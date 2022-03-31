package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SwitchImageView extends AppCompatActivity {
    ImageView upImage, downImage;
    Button downButton, upButton;
    boolean isUp = true;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_switch_image_view);
        upButton = (Button) findViewById(R.id.upButton);
        downButton = (Button) findViewById(R.id.downButton);
        upImage = (ImageView) findViewById(R.id.upImage);
        downImage = (ImageView) findViewById(R.id.downImage);
        upButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {//2020039080 조현창
                if(isUp)return;
                isUp = true;
                upImage.setImageDrawable(getDrawable(R.drawable.profile));
                downImage.setImageDrawable(null);
            }
        });
        downButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!isUp)return;
                isUp = false;
                downImage.setImageDrawable(getDrawable(R.drawable.profile));
                upImage.setImageDrawable(null);
            }
        });
    }
}