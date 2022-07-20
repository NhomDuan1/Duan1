package com.example.duan.fragment;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.appcompat.app.AlertDialog;
import androidx.fragment.app.Fragment;

import com.example.duan.R;
import com.example.duan.chinhsua_ac;

public class profile_fragment extends Fragment {
    TextView chinhsua, pass, dangxuat;
    @Override
    public View onCreateView( LayoutInflater inflater,ViewGroup container,  Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_profile, container,false);

        chinhsua = view.findViewById(R.id.btn_chinhsua_account);
        pass = view.findViewById(R.id.btn_doipass_account);
        dangxuat = view.findViewById(R.id.btn_logout_account);

        chinhsua.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getActivity(), chinhsua_ac.class));
            }
        });

        pass.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialogpass();
            }
        });
        dangxuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showDialoglogout();
            }
        });


        return view;
    }


    private void showDialogpass() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.doi_mat_khau_dialog, null);
        builder.setView(view);

        Dialog dialog = builder.create();
        dialog.show();

    }
    private void showDialoglogout() {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
        LayoutInflater inflater = getLayoutInflater();
        View view = inflater.inflate(R.layout.check_logout, null);
        builder.setView(view);

        Dialog dialog = builder.create();
        dialog.show();

    }

}
