package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class pcx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pcx);

        Button sharebtn = findViewById(R.id.sharebtn);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();

                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("image/*");
                String title = " ";
                String desc = " ";

                sb.append("Nama Barang : PCX").append(title).append("\n");
                sb.append("Detail barang : Kapasitas 156.9 cc Tenaga Maksimal 15.8 hp Jumlah langkah 4-Stroke Pipa Knalpot Single Exhaust Diameter x langkah 60 mm x 55.5 mm Jenis Penggerak Belt Drive Rasio Kompresi 12:01 Jumlah silinder 1 Jenis Kopling Automatic, Centrifugal, Dry Type").append(desc).append("\n");
                String detail = sb.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detail);

                startActivity(Intent.createChooser(shareintent, "Bagikan Melalui"));

            }
        });
    }
}