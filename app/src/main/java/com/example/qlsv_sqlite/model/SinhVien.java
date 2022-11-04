package com.example.qlsv_sqlite.model;

public class SinhVien {
    private int MaSV236;
    private String HoTen236;
    private int GioiTinh236;
    private String DienThoai236;
    private String Email236;
    private int maSV236;


    public SinhVien() {
    }
    public SinhVien(String hoTen236, int gioiTinh236, String dienThoai236, String email236) {
        HoTen236 = hoTen236;
        GioiTinh236 = gioiTinh236;
        DienThoai236 = dienThoai236;
        Email236 = email236;
    }

    public SinhVien(int maSV236, String hoTen236, int gioiTinh236, String dienThoai236, String email236) {
        MaSV236 = maSV236;
        HoTen236 = hoTen236;
        GioiTinh236 = gioiTinh236;
        DienThoai236 = dienThoai236;
        Email236 = email236;
    }

    public int getMaSV236() {
        return MaSV236;
    }

    public void setMaSV236(int maSV244) {
        MaSV236 = maSV236;
    }

    public String getHoTen236() {
        return HoTen236;
    }

    public void setHoTen236(String hoTen236) {
        HoTen236 = hoTen236;
    }

    public int getGioiTinh236() {
        return GioiTinh236;
    }

    public void setGioiTinh236(int gioiTinh236) {
        GioiTinh236 = gioiTinh236;
    }

    public String getDienThoai236() {
        return DienThoai236;
    }

    public void setDienThoai236(String dienThoai236) {
        DienThoai236 = dienThoai236;
    }

    public String getEmail236() {
        return Email236;
    }

    public void setEmail236(String email236) {
        Email236 = email236;
    }

}
