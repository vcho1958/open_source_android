package com.example.myapplication;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity7_3 extends AppCompatActivity {

    TextView name, email;
    Button buttong;
    EditText editName, editEmail;
    TextView toast;
    View dialog, toastv;
    //2020039080 조현창
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main7_3);
        setTitle("사용자 정보 입력");

        name = findViewById(R.id.name);
        email = findViewById(R.id.email);
        buttong = findViewById(R.id.buttonq);

        buttong.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialog = View.inflate(MainActivity7_3.this, R.layout.dialog1, null);
                AlertDialog.Builder dlg = new AlertDialog.Builder(MainActivity7_3.this);
                dlg.setTitle("사용자 정보 입력");
                dlg.setIcon(R.drawable.user);
                dlg.setView(dialog);
                dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        editName = dialog.findViewById(R.id.dlg);
                        editEmail = dialog.findViewById(R.id.dlg2);

                        name.setText(editName.getText().toString());
                        email.setText(editEmail.getText().toString());
                    }
                });
                dlg.setNegativeButton("취소", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Toast toast = new Toast(MainActivity7_3.this);
                        toastv = View.inflate(MainActivity7_3.this, R.layout.toast1, null);
                        MainActivity7_3.this.toast = toastv.findViewById(R.id.toastText1);
                        MainActivity7_3.this.toast.setText("취소했습니다");
                        toast.setView(toastv);
                        toast.show();
                    }
                });
                dlg.show();
            }
        });
    }
}