package com.example.myapplication;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.widget.Chronometer;
import android.widget.DatePicker;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.TimePicker;

public class MainActivity6_1 extends AppCompatActivity {
    //2020039080 조현창
    Chronometer chrono;
    LinearLayout end;
    RadioButton cal, time;
    DatePicker dPicker;
    TimePicker tPicker;
    TextView year, month, day, hour, minute;
    int selectYear, selectMonth, selectDay;

    @RequiresApi(api = Build.VERSION_CODES.O)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main6_1);

        end = findViewById(R.id.end);

        chrono = findViewById(R.id.chronometer);

        cal = findViewById(R.id.cal);
        time = findViewById(R.id.time);

        tPicker = findViewById(R.id.timePicker);
        dPicker = findViewById(R.id.datePicker);

        year = findViewById(R.id.year);
        month = findViewById(R.id.month);
        day = findViewById(R.id.day);
        hour = findViewById(R.id.hour);
        minute = findViewById(R.id.minute);

        cal.setVisibility(View.INVISIBLE);
        time.setVisibility(View.INVISIBLE);
        tPicker.setVisibility(View.INVISIBLE);
        dPicker.setVisibility(View.INVISIBLE);

        chrono.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chrono.setBase(SystemClock.elapsedRealtime());
                chrono.start();
                chrono.setTextColor(Color.RED);

                cal.setVisibility(View.VISIBLE);
                time.setVisibility(View.VISIBLE);
            }
        });

        cal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tPicker.setVisibility(View.INVISIBLE);
                dPicker.setVisibility(View.VISIBLE);
            }
        });

        time.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tPicker.setVisibility(View.VISIBLE);
                dPicker.setVisibility(View.INVISIBLE);
            }
        });

        end.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View view) {
                chrono.stop();
                chrono.setTextColor(Color.BLUE);

                year.setText(Integer.toString(selectYear));
                month.setText(Integer.toString(selectMonth));
                day.setText(Integer.toString(selectDay));

                hour.setText(Integer.toString(tPicker.getCurrentHour()));
                minute.setText(Integer.toString(tPicker.getCurrentMinute()));

                cal.setVisibility(View.INVISIBLE);
                time.setVisibility(View.INVISIBLE);
                tPicker.setVisibility(View.INVISIBLE);
                dPicker.setVisibility(View.INVISIBLE);

                return false;
            }
        });


        dPicker.setOnDateChangedListener(new DatePicker.OnDateChangedListener() {
            @Override
            public void onDateChanged(DatePicker datePicker, int year, int month, int dayOfMonth) {
                selectYear = year;
                selectMonth = month;
                selectDay = dayOfMonth;
            }
        });
    }
}