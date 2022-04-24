package com.example.myapplication;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Toast;

import java.text.SimpleDateFormat;
import java.util.Date;

public class MainActivityM9 extends AppCompatActivity {

    public static class MyFragment extends Fragment {
        //2020039080 조현창
        View dialog;

        @Nullable
        @Override
        public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

            View v = inflater.inflate(R.layout.my_fragment, container, false);

            EditText age = v.findViewById(R.id.age);
            EditText name = v.findViewById(R.id.name2);
            Button birth = v.findViewById(R.id.birth);
            Button save = v.findViewById(R.id.save);

            Date d = new Date();
            SimpleDateFormat dateformat = new SimpleDateFormat("yyyy/mm//dd");
            birth.setText(dateformat.format(d));

            birth.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    dialog = View.inflate(MyFragment.super.getContext(), R.layout.dialog, null);
                    AlertDialog.Builder dlg = new AlertDialog.Builder(MyFragment.super.getContext());
                    DatePicker dp = dialog.findViewById(R.id.datePicker);
                    dlg.setView(dialog);
                    dlg.setPositiveButton("확인", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialogInterface, int i) {
                            birth.setText(dp.getYear() + "/" + dp.getMonth() + "/" + dp.getDayOfMonth());
                        }
                    });
                    dlg.show();
                }
            });

            save.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    Toast.makeText(MyFragment.super.getContext(),
                            name.getText().toString() + " "
                                    + age.getText().toString() + " "
                                    + birth.getText().toString(),
                            Toast.LENGTH_SHORT).show();
                }
            });

            return v;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_m9);

        MyFragment myFragment = new MyFragment();
        FragmentManager fm = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fm.beginTransaction();
        fragmentTransaction.add(R.id.fragment, myFragment);
        fragmentTransaction.commit();
    }
}