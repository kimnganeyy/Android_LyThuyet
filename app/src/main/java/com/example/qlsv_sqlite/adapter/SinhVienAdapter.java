package com.example.qlsv_sqlite.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.qlsv_sqlite.R;
import com.example.qlsv_sqlite.model.SinhVien;

import java.util.List;

public class SinhVienAdapter extends BaseAdapter {
    private List<SinhVien> sinhvienList236;
    private Context context236;
    public SinhVienAdapter(Context context236, List<SinhVien> listList236) {
        this.context236 = context236;
        this.sinhvienList236 = listList236;
    }

    @Override
    public int getCount() {
        return sinhvienList236.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        ViewHolder viewHolder236;
        if (view == null)
        {
            viewHolder236 = new ViewHolder();
            //convert resource
            LayoutInflater inflater = (LayoutInflater) context236.getSystemService(context236.LAYOUT_INFLATER_SERVICE);
            view = inflater.inflate(R.layout.view_item_sinhvien, null);

            //anh xa
            viewHolder236.tvMaSV236 = view.findViewById(R.id.tv_masv);
            viewHolder236.tvHoTen236 = view.findViewById(R.id.tv_hoten);
            viewHolder236.tvDienThoai236 = view.findViewById(R.id.tv_sdt);
            viewHolder236.tvEmail236 = view.findViewById(R.id.tv_email);
            viewHolder236.ivGioiTinh236 = view.findViewById(R.id.iv_gioitinh);

            view.setTag(viewHolder236);
        }
        else
        {
            viewHolder236 = (ViewHolder) view.getTag();
        }

        //
        SinhVien sv236 = sinhvienList236.get(i);
        viewHolder236.tvMaSV236.setText("Mã SV: " + sv236.getMaSV236());
        viewHolder236.tvHoTen236.setText("Họ tên: " + sv236.getHoTen236());
        viewHolder236.tvDienThoai236.setText("Điện thoại: " + sv236.getDienThoai236());
        viewHolder236.tvEmail236.setText("Email: " + sv236.getEmail236());
        if (sv236.getGioiTinh236() == 0)
        {
            viewHolder236.ivGioiTinh236.setImageResource(R.drawable.avatarnu);
        }
        else
        {

            viewHolder236.ivGioiTinh236.setImageResource(R.drawable.gamer);
        }

        return view;
    }

    class ViewHolder
    {
        ImageView ivGioiTinh236;
        TextView tvMaSV236, tvHoTen236, tvDienThoai236, tvEmail236;
    }
}
