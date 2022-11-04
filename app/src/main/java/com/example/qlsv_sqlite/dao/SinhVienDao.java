package com.example.qlsv_sqlite.dao;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

import com.example.qlsv_sqlite.database.DbHelper;
import com.example.qlsv_sqlite.model.SinhVien;

import java.util.ArrayList;
import java.util.List;

public class SinhVienDao {
    private DbHelper csdl236;
    public SinhVienDao(Context context236)
    {
        csdl236 = new DbHelper(context236);
    }

    //Lấy tất cả sinh viên
    public List<SinhVien> TatCaSinhVien236() {
        String sql = "SELECT * FROM SinhVien";
        List<SinhVien> sinhVienList236 = new ArrayList<SinhVien>();
        SQLiteDatabase database236 = csdl236.getReadableDatabase();
        Cursor cursor = database236.rawQuery(sql, null);
        cursor.moveToFirst();
        while (!cursor.isAfterLast())
        {
            int masv236 = cursor.getInt(0);
            String hoten236=cursor.getString(1);
            int gioitinh236 =cursor.getInt(2);
            String dienthoai236 =cursor.getString(3);
            String email236 =cursor.getString(4);
            SinhVien sv=new SinhVien (masv236,hoten236,gioitinh236,dienthoai236,email236);
            sinhVienList236.add(sv);
            cursor.moveToNext();
        }
        return sinhVienList236;
    }
    //Thêm Sinh Viên
    public void ThemSinhVien(SinhVien sv){
        SQLiteDatabase database =csdl236.getWritableDatabase();
        ContentValues values =new ContentValues();
        values.put("HoTen",sv.getHoTen236());
        values.put("GioiTinh",sv.getGioiTinh236());
        values.put("DienThoai",sv.getDienThoai236());
        values.put("Email",sv.getEmail236());
        database.insert("SinhVien","",values);
    }
    //cập nhât sinh viên
    public void CapNhatSinhVien(SinhVien sv) {
        SQLiteDatabase database =csdl236.getWritableDatabase();
        ContentValues values =new ContentValues();
        values.put("HoTen",sv.getHoTen236());
        values.put("Email",sv.getEmail236());
        values.put("DienThoai",sv.getDienThoai236());
        values.put("GioiTinh",sv.getGioiTinh236());
        String masv =String.valueOf(sv.getMaSV236());
        String thamso[]= {masv};
        database.update("SinhVien",values,"MaSV=?",thamso);



    }

}