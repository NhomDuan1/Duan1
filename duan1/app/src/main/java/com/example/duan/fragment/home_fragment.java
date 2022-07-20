package com.example.duan.fragment;


import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;

import android.widget.ListView;


import androidx.fragment.app.Fragment;

import com.example.duan.Adapter.music_adapter;
import com.example.duan.Adapter.playlist_adapter;
import com.example.duan.R;
import com.example.duan.modle.music;
import com.example.duan.modle.music_dao;
import com.example.duan.song_acti;

import java.util.ArrayList;
import java.util.List;

public class home_fragment extends Fragment {
    ListView lvsong;
    music_adapter adapter;
    List<music> list = new ArrayList<>();
    MediaPlayer mediaPlayer;
    @Override
    public View onCreateView( LayoutInflater inflater,ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_home, container,false);

        lvsong = view.findViewById(R.id.lvsong);
        list = music_dao.getAll(getActivity());
        adapter = new music_adapter(getActivity(),list);
        lvsong.setAdapter(adapter);


        lvsong.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                startActivity(new Intent(getActivity(), song_acti.class));
                mediaPlayer = MediaPlayer.create(getActivity(),list.get(i).getFile());
                mediaPlayer.start();
            }
        });

        return view;
    }

}
