package com.example.qlsv_sqlite;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.qlsv_sqlite.dao.SinhVienDao;
import com.example.qlsv_sqlite.model.SinhVien;

public class EditActivity extends AppCompatActivity {
    //Ánh xạ
    private EditText editHoTen236, edtEmail236, edtDienthoai236;
    private RadioGroup rgGioiTinh236;
    private RadioButton rbNam236, rbNu236;
    private Button btnLuu236, btnThoat236;
    private SinhVienDao svDao236;
    int gioitinh236;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit);
        svDao236 = new SinhVienDao(EditActivity.this);

        Intent intent = getIntent();
        SinhVien sinhVien = (SinhVien) intent.getSerializableExtra("DULIEU");

        AnhXa();
        //Lấy dữ liệu đẩy lên view
        editHoTen236.setText(sinhVien.getHoTen236());
        edtEmail236.setText(sinhVien.getEmail236());
        edtDienthoai236.setText(sinhVien.getDienThoai236());
        if(sinhVien.getGioiTinh236()==1)
        {
            rbNam236.setChecked(true);
            gioitinh236 = 1;
        }
        else {
            rbNu236.setChecked(true);
            gioitinh236 = 0;
        }
        //xử lý thoát
        btnThoat236.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
        //Xự kiện cho Group gioi tinh
        rgGioiTinh236.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                if (i == R.id.rb_nam)
                {
                    gioitinh236 = 1;
                }
                else
                {
                    gioitinh236 = 0;
                }
            }
        });

        //Lưu
        btnLuu236.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sinhVien.setHoTen236(editHoTen236.getText().toString());
                sinhVien.setEmail236(edtEmail236.getText().toString());
                sinhVien.setDienThoai236(edtDienthoai236.getText().toString());
                sinhVien.setGioiTinh236(gioitinh236);
                svDao236.CapNhatSinhVien(sinhVien);
            }
        });
    }

    private void AnhXa() {
        editHoTen236 = (EditText) findViewById(R.id.edt_hoten);
        edtEmail236 = (EditText) findViewById(R.id.edt_email);
        edtDienthoai236 = (EditText) findViewById(R.id.edt_dienthoai);
        rgGioiTinh236 = (RadioGroup) findViewById(R.id.rg_gioitinh);
        rbNam236 = (RadioButton) findViewById(R.id.rb_nam);
        rbNu236 = (RadioButton) findViewById(R.id.rb_nu);
        btnLuu236 = (Button) findViewById(R.id.btn_luu);
        btnThoat236 = (Button) findViewById(R.id.btn_thoat);
    }
}