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
        String SqlInsert4="INSERT INTO SinhVien(HoTen,GioiTinh,DienThoai,Email) VALUES('Trần Thị Kim Ngân','1','0836197328','2050531200236@sv.ute.udn.vn')";
        String SqlInsert5="INSERT INTO SinhVien(HoTen,GioiTinh,DienThoai,Email) VALUES('Lê Anh Quốc','1','0123456789','2050531200262@sv.ute.udn.vn')";
        String SqlInsert6="INSERT INTO SinhVien(HoTen,GioiTinh,DienThoai,Email) VALUES('Trần Đức Mạnh','0','0123456789','2050531200232@sv.ute.udn.vn')";
        sqLiteDatabase.execSQL(SqlInsert4);
        sqLiteDatabase.execSQL(SqlInsert5);
        sqLiteDatabase.execSQL(SqlInsert6);

    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }
}
