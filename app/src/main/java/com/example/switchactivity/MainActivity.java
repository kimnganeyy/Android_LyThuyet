package com.example.switchactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button clickme;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        clickme = findViewById(R.id.clickme);
        clickme.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, MainActivity2.class);

                Bundle bundle = new Bundle();
                bundle.putString("ten", "Trần Thị Kim Ngân");
                bundle.putString("masv", "2050531200236");

                intent.putExtra("dulieu", bundle);


                startActivity(intent);
            }
        });
    }
}