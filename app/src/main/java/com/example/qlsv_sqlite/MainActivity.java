package com.example.qlsv_sqlite;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ListView;

import com.example.qlsv_sqlite.adapter.SinhVienAdapter;
import com.example.qlsv_sqlite.dao.SinhVienDao;
import com.example.qlsv_sqlite.model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lvSinhVien236;
    private List<SinhVien> sinhvienList236;
    private SinhVienAdapter adapter236;
    private SinhVienDao svDao236;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // anh xa
        lvSinhVien236 = (ListView) findViewById(R.id.lv_sinhvien);
        // do du lieu
        svDao236 = new SinhVienDao(MainActivity.this);
        sinhvienList236 = svDao236.TatCaSinhVien236();
//
        adapter236 = new SinhVienAdapter(getApplicationContext(),sinhvienList236);
        lvSinhVien236.setAdapter(adapter236);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu_option,menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if (id == R.id.menu_them)
        {
            Intent intent244 = new Intent(MainActivity.this, AddActivity.class);
            startActivity(intent244);
        }
        if (id == R.id.menu_thoat)
        {
            finish();
        }
        return true;
    }
}