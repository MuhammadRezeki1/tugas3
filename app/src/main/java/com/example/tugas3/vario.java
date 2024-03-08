package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class vario extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vario);

        Button sharebtn = findViewById(R.id.sharebtn);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();

                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("image/*");
                String title = " ";
                String desc = " ";

                sb.append("Nama Barang : VARIO").append(title).append("\n");
                sb.append("Detail barang : kapasitas_124_8_cc_tenaga_maksimal_11_1_hp_kontrol_emisi_euro_3_sistem_pendinginan_pendingin_cairan_rasio_kompresi_11_0_1_pipa_knalpot_single_exhuast_jumlah_langkah_4_stroke_kecepatan_maksimum_105_kmph_torsi_maksimal_10_8_nm_diameter_x_langkah_52_4_mm_x_57_9_mm_jenis_kopling_automatic_centrifugal_dry_type").append(desc).append("\n");
                String detail = sb.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detail);

                startActivity(Intent.createChooser(shareintent, "Bagikan Melalui"));

            }
        });
    }
}