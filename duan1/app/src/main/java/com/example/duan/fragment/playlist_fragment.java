package com.example.duan.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import androidx.fragment.app.Fragment;

import com.example.duan.Adapter.playlist_adapter;
import com.example.duan.R;
import com.example.duan.modle.playlist;

import java.util.ArrayList;
import java.util.List;

public class playlist_fragment extends Fragment {
    ListView lvplaylist;
    playlist_adapter adapter;
    @Override
    public View onCreateView( LayoutInflater inflater,ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_playlist, container,false);

        List<playlist> list = new ArrayList<>();
        list.add(new playlist(R.drawable.dg,"Yêu thích"));
        list.add(new playlist(R.drawable.dg,"Big Bang"));
        list.add(new playlist(R.drawable.dg,"Exo"));
        list.add(new playlist(R.drawable.dg,"Nhạc cười mỗi mỏ"));
        list.add(new playlist(R.drawable.dg,"Nhạc hết tiền"));
        list.add(new playlist(R.drawable.dg,"Nhạc Nghèo"));

        lvplaylist = view.findViewById(R.id.lvplaylist);
        adapter = new playlist_adapter(getActivity(),list);
        lvplaylist.setAdapter(adapter);


        return view;
    }
}
