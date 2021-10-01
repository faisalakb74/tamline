package com.example.tamline;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class loginPenggunaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_pengguna);

        final TextView lupaPassword = (TextView) findViewById(R.id.lupaPasswordPengguna);
        lupaPassword.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(loginPenggunaActivity.this, lupaPasswordActivity.class);
                startActivity(myIntent);
                return;
            }
        });

        final TextView daftarPengguna = (TextView) findViewById(R.id.daftarPengguna);
        daftarPengguna.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(loginPenggunaActivity.this, signupPenggunaActivity.class);
                startActivity(myIntent);
                return;
            }
        });

        Button masuk = findViewById(R.id.buttonMasukPengguna);
        masuk.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(loginPenggunaActivity.this, akunActivity.class));
            }
        });
    }
}