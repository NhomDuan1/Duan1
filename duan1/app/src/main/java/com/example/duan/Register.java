package com.example.duan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Register extends AppCompatActivity {
    EditText edttk_dk,edtemail_dk,edtmatKhau_dk,edtConematKhau_dk;
    Button btnXacNhan_dk;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        btnXacNhan_dk = findViewById(R.id.btnXacNhan_dk);

        btnXacNhan_dk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Register.this, trangchu_bott_nav.class));
            }
        });

    }
}