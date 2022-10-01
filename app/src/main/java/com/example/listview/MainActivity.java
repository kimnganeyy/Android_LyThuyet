package com.example.listview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView list_cosmetic;
    ArrayList<String> arrayCourse;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        list_cosmetic = findViewById(R.id.list_cosmetic);
        ArrayList<cosmetic> arr = new ArrayList<>();
        while (arr.size()<10){
            arr.add(new cosmetic());
        }
        CosmeticAdapter adapter = new CosmeticAdapter(this, 0,arr);
        list_cosmetic.setAdapter(adapter);

    }
}