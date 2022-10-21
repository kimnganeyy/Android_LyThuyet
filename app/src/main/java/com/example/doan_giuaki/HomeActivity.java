package com.example.doan_giuaki;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class HomeActivity extends AppCompatActivity {

    Button btnlistview, profile;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        btnlistview = (Button) findViewById(R.id.btnlistview);
        profile = (Button) findViewById(R.id.profile);

        btnlistview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mh1 = new Intent(HomeActivity.this, ListviewActivity.class);
                startActivity(mh1);
            }
        });

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               Intent mh2 = new Intent(HomeActivity.this, UserProfileActivity.class);
               startActivity(mh2);
            }
        });
    }
}