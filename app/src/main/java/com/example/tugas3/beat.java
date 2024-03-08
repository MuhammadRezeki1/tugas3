package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class beat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_beat);

        Button sharebtn = findViewById(R.id.sharebtn);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();

                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("image/*");
                String title = " ";
                String desc = " ";

                sb.append("Nama Barang : BEAT").append(title).append("\n");
                sb.append("Detail barang :Tipe Mesin : 4 – Langkah, SOHC, ESP Tipe Transmisi : Otomatis, V-Matic Tipe Kopling : Otomatis, Sentrifugal, Tipe Kering Tipe Starter : Kaki dan Elektrik Diameter x Langkah : 47 x 63.1 mm Volume Langkah : 109.5 cc Sistem Pendingin Mesin : Pendingin Udara").append(desc).append("\n");
                String detail = sb.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detail);

                startActivity(Intent.createChooser(shareintent, "Bagikan Melalui"));

            }
        });
    }
}