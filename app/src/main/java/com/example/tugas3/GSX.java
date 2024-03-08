package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class GSX extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gsx);

        Button sharebtn = findViewById(R.id.gsxbtn);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();

                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("image/*");
                String title = " ";
                String desc = " ";

                sb.append("Nama Barang : GSX150R").append(title).append("\n");
                sb.append("Detail barang : kapasitas_147_3_cc_tenaga_maksimal_18_9_hpkatup_per_silinder_4_konfigurasi_katup_dohc_diameter_x_langkah_62_mm_x_48_8_mm_rasio_kompresi_11_5_1_kecepatan_maksimum_137_kmph").append(desc).append("\n");
                String detail = sb.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detail);

                startActivity(Intent.createChooser(shareintent, "Bagikan Melalui"));

            }
        });
    }
}