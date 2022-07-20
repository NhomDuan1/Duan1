package com.example.duan.Adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.duan.R;
import com.example.duan.modle.music;

import java.util.List;

public class music_adapter extends BaseAdapter {
    Context context;
    List<music> list;

    public music_adapter(Context context, List<music> list) {
        this.context = context;
        this.list = list;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int i) {
        return list.get(i);
    }

    @Override
    public long getItemId(int i) {
        return i;
    }
    public static class musicViewHolder{
        public ImageView icoun;
        public TextView tcoun;
        public TextView dcoun;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        musicViewHolder holder = null;
        if(view == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            view = inflater.inflate(R.layout.item_song,null);
            holder = new musicViewHolder();
            holder.icoun = view.findViewById(R.id.imgcountry);
            holder.tcoun = view.findViewById(R.id.txtcountry);
            holder.dcoun = view.findViewById(R.id.txtactist);

            view.setTag(holder);
        }else {
            holder = (musicViewHolder) view.getTag();
        }
        holder.tcoun.setText(list.get(i).getNamesong());
        holder.dcoun.setText(list.get(i).getTacgia());
        holder.icoun.setImageResource(list.get(i).getImagesong());
        return view;
    }
}
