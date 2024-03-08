package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class mio extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mio);

        Button sharebtn = findViewById(R.id.sharebtn);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();

                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("image/*");
                String title = " ";
                String desc = " ";

                sb.append("Nama Barang : MIO").append(title).append("\n");
                sb.append("Detail barang : kapasitas 125 cc tenaga_maksimal 9 38 hp pipa knalpot single exhaust diameter_x_langkah_52_4_mm_x_57_9_mm_jenis_penggerak_belt_drive_jumlah_langkah_4_stroke_tipe_injeksi_direct_injection_katup_per_silinder_2_sistem_pendinginan_pendingin_udara_sistem_pelumasan_wet_sump_konfigurasi_katup_sohc").append(desc).append("\n");
                String detail = sb.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detail);

                startActivity(Intent.createChooser(shareintent, "Bagikan Melalui"));

            }
        });
    }
}