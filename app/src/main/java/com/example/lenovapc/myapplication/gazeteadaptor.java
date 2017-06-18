package com.example.lenovapc.myapplication;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Lenova pc on 17.06.2017.
 */

public class gazeteadaptor extends BaseAdapter {
    public Activity b;
    public LayoutInflater c;
    public ArrayList<gazetemodel> d;

    public gazeteadaptor(Activity b, ArrayList<gazetemodel> d) {
        this.b = b;
        c =(LayoutInflater) b.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        this.d = d;
    }

    @Override
    public int getCount() {
        return d.size();
    }

    @Override
    public Object getItem(int i) {
        return d.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        View e ;
        gazetemodel yorum =d.get(i);
        e = c.inflate(R.layout.satir_layout,null);
        TextView gazeteismi = e.findViewById(R.id.gazeteismi);
        gazeteismi.setText(yorum.gazeteismi);
        return e;
    }
}
