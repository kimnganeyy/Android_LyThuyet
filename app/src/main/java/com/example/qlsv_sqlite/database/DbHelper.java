package com.example.qlsv_sqlite.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class DbHelper extends SQLiteOpenHelper {
    public DbHelper(@Nullable Context context) {
        super(context,"SLSinhVien.sqlite", null, 1);
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
        String sqlSVCreate = "CREATE TABLE IF NOT EXISTS "+
                "SinhVien(MaSV INTEGER PRIMARY KEY AUTOINCREMENT, " +
                "HoTen VARCHAR(200)," +
                "GioiTinh INTEGER," +
                "DienThoai VARCHAR(200), " +
                "Email VARCHAR(200))";
        sqLiteDatabase.execSQL(sqlSVCreate);
        String SqlInsert1="INSERT INTO SinhVien(HoTen,GioiTinh,DienThoai,Email) VALUES('Trần Thị Kim Ngân','0','0836197328','2050531200236@sv.ute.udn.vn')";
        String SqlInsert2="INSERT INTO SinhVien(HoTen,GioiTinh,DienThoai,Email) VALUES('Lê Anh Quốc','1','0123456789','2050531200262@sv.ute.udn.vn')";
        String SqlInsert3="INSERT INTO SinhVien(HoTen,GioiTinh,DienThoai,Email) VALUES('Trần Đức Mạnh','1','0123456789','2050531200232@sv.ute.udn.vn')";
        sqLiteDatabase.execSQL(SqlInsert1);
        sqLiteDatabase.execSQL(SqlInsert2);
        sqLiteDatabase.execSQL(SqlInsert3);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
