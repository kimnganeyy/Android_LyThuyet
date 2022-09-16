package com.example.switchactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    TextView textKetqua;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textKetqua = (TextView) findViewById(R.id.textKetqua);

        //nhận dữ liệu từ Intent
        Intent intent = getIntent();

        Bundle bundle = intent.getBundleExtra("dulieu");

        if (bundle != null) {
            String ten = bundle.getString("ten");
            String masv = bundle.getString("masv");

            textKetqua.setText(ten + "\n" + masv);
        }

    }
}