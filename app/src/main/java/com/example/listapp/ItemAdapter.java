package com.example.listapp;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

public class ItemAdapter extends BaseAdapter {

    LayoutInflater mInflater;
    String[] animals;
    String[] adoptionFees;
    String[] descriptions;

    public ItemAdapter(Context c, String[] a, String[] f, String[] d) {
        animals = a;
        adoptionFees = f;
        descriptions = d;
        mInflater = (LayoutInflater) c.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
    }

    @Override
    public int getCount() {
        return animals.length;
    }

    @Override
    public Object getItem(int i) {
        return animals[i];
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {

        View v = mInflater.inflate(R.layout.my_listview_detail, null);
        TextView nameTextView = (TextView) v.findViewById(R.id.nameTextView);
        TextView descriptionTextView = (TextView) v.findViewById(R.id.descriptionTextView);
        TextView feeTextView = (TextView) v.findViewById(R.id.feeTextView);

        String name = animals[i];
        String desc = descriptions[i];
        String fee = adoptionFees[i];

        nameTextView.setText(name);
        descriptionTextView.setText(desc);
        feeTextView.setText(fee);

        return v;
    }
}
