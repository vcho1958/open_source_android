package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.SeekBar;

public class MainActivityM6 extends AppCompatActivity {

    SeekBar seek;
    ProgressBar progress;
    EditText input;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_m6);

        seek = findViewById(R.id.seek);
        progress = findViewById(R.id.progress);
        input = findViewById(R.id.input);

        seek.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
            @Override
            public void onProgressChanged(SeekBar seekBar, int progress, boolean b) {
                MainActivityM6.this.progress.setProgress(progress);
                input.setText(Integer.toString(progress));
            }
        //2020039080 조현창
            @Override
            public void onStartTrackingTouch(SeekBar seekBar) {

            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar) {

            }
        });
    }
}