package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class halrx extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halrx);

        Button sharebtn = findViewById(R.id.sharebtn);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();

                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("image/*");
                String title = " ";
                String desc = " ";

                sb.append("Nama Barang : RXKING").append(title).append("\n");
                sb.append("Detail barang : berkapasitas_132_cc_2_tak_dan_berpendingin_udara_perbandingan_kompresinya_6_9_1_dengan_diameter_silinder_58_0_mm_x_stroke_50_mm_pakai_kopling_manual_basah_dengan_multiplat_disandingkan_dengan_transmisi_5_percepatan").append(desc).append("\n");
                String detail = sb.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detail);

                startActivity(Intent.createChooser(shareintent, "Bagikan Melalui"));

            }
        });
    }
}