package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nmax extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nmax);

        Button sharebtn = findViewById(R.id.sharebtn);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();

                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("image/*");
                String title = " ";
                String desc = " ";

                sb.append("Nama Barang : Nmax").append(title).append("\n");
                sb.append("Detail barang :Kapasitas 155 cc Tenaga Maksimal 15 hp Sistem Pendinginan Pendingin Cairan Rasio Kompresi 10.5:1 Jumlah langkah 4-Stroke Torsi Maksimal 13.9 Nm Sistem pelumasan Wet Sump Pipa Knalpot Single Exhaust Jenis Penggerak Belt Drive Jumlah silinder 1 Jenis Kopling Single Dry Type").append(desc).append("\n");
                String detail = sb.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detail);

                startActivity(Intent.createChooser(shareintent, "Bagikan Melalui"));

            }
        });
    }
}