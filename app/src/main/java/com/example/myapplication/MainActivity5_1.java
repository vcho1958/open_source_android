package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity5_1 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
//        setContentView(R.layout.activity_main5_1);
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.MATCH_PARENT);
        LinearLayout baseLayout = new LinearLayout(this);
        baseLayout.setOrientation(LinearLayout.VERTICAL);
        baseLayout.setBackgroundColor(Color.rgb(0,255,0));
        setContentView(baseLayout,params);
        LinearLayout.LayoutParams buttonParams = new LinearLayout.LayoutParams(
                (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 110, getResources().getDisplayMetrics()),
                (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 100, getResources().getDisplayMetrics())
        );
        //2020039080 조현창
        Button btn = new Button(this);
        buttonParams.gravity = Gravity.CENTER;
        btn.setGravity(Gravity.TOP|Gravity.RIGHT);
        btn.setText("버튼입니다.");
        btn.setBackgroundColor(Color.MAGENTA);
        btn.setLayoutParams(buttonParams);
        baseLayout.addView(btn);
        btn.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "코드로 생성한 버튼입니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });
        LinearLayout.LayoutParams buttonParams2 = new LinearLayout.LayoutParams(
                (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 110, getResources().getDisplayMetrics()),
                (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 100, getResources().getDisplayMetrics())
        );
        Button btn2 = new Button(this);
        buttonParams2.gravity = Gravity.LEFT;
        btn2.setGravity(Gravity.CENTER|Gravity.LEFT);
        btn2.setText("버튼입니다.");
        btn2.setBackgroundColor(Color.MAGENTA);
        btn2.setLayoutParams(buttonParams2);
        baseLayout.addView(btn2);
        btn2.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "코드로 생성한 버튼입니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });

        LinearLayout.LayoutParams buttonParams3 = new LinearLayout.LayoutParams(
                (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 110, getResources().getDisplayMetrics()),
                (int)TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP, 100, getResources().getDisplayMetrics())
        );
        Button btn3 = new Button(this);
        buttonParams3.gravity = Gravity.RIGHT;
        btn3.setGravity(Gravity.BOTTOM|Gravity.RIGHT);
        btn3.setText("버튼입니다.");
        btn3.setBackgroundColor(Color.MAGENTA);
        btn3.setLayoutParams(buttonParams3);
        baseLayout.addView(btn3);
        btn3.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(), "코드로 생성한 버튼입니다.",
                        Toast.LENGTH_SHORT).show();
            }
        });
    }
}