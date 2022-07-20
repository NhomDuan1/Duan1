package com.example.duan;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.os.Bundle;
import android.widget.FrameLayout;

import com.example.duan.fragment.home_fragment;
import com.example.duan.fragment.mess_fragment;
import com.example.duan.fragment.playlist_fragment;
import com.example.duan.fragment.profile_fragment;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class trangchu_bott_nav extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_trangchu_bott_nav);

    BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
    FrameLayout fgAppMain = findViewById(R.id.fgAppMain);

    replace(new home_fragment());
        bottomNavigationView.setOnItemSelectedListener(item ->

    {
        switch (item.getItemId()) {
            case R.id.musical:
                replace(new home_fragment());
                break;
            case R.id.mess:
                replace(new mess_fragment());
                break;
            case R.id.playlist:
                replace(new playlist_fragment());
                break;
            case R.id.profile:
                replace(new profile_fragment());
                break;

        }
        return true;
    });
}
    public void replace(Fragment fragment){
        FragmentManager fragmentManager = getSupportFragmentManager();
        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
        fragmentTransaction.replace(R.id.fgAppMain, fragment);
        fragmentTransaction.commit();
    }
}