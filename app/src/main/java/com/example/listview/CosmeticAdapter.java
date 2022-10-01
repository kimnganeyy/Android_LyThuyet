package com.example.listview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.LinearLayout;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;
import java.util.List;

public class CosmeticAdapter extends ArrayAdapter<cosmetic> {
    private Context ct;
    private ArrayList<cosmetic> arr;

    public CosmeticAdapter(@NonNull Context context, int resource, @NonNull List<cosmetic> objects) {
        super(context, resource, objects);
        this.ct =context;
        this.arr = new ArrayList<>(objects);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        if(convertView == null){
            LayoutInflater i = (LayoutInflater)ct.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            convertView = i.inflate(R.layout.activity_cosmetic, null);
        }
        if (arr.size()>0){
            cosmetic d = arr.get(position);
        }
        return convertView;
    }
}
