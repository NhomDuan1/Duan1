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
import com.example.duan.modle.playlist;

import java.util.List;

public class playlist_adapter extends BaseAdapter {
    Context context;
    List<playlist> list;

    public playlist_adapter(Context context, List<playlist> list) {
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
    public static class playlistViewHolder{
        public ImageView icoun;
        public TextView tcoun;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        playlistViewHolder holder = null;
        if(view == null){
            LayoutInflater inflater = ((Activity)context).getLayoutInflater();
            view = inflater.inflate(R.layout.item_playlist,null);
            holder = new playlistViewHolder();
            holder.icoun = view.findViewById(R.id.imgcountry);
            holder.tcoun = view.findViewById(R.id.txtcountry);

            view.setTag(holder);
        }else {
            holder = (playlistViewHolder) view.getTag();
        }
        holder.tcoun.setText(list.get(i).getNameplaylist());
        holder.icoun.setImageResource(list.get(i).getImgplayplist());
        return view;
    }
}
