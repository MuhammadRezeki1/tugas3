package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fizr extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fizr);

        Button sharebtn = findViewById(R.id.sharebtn);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();

                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("image/*");
                String title = " ";
                String desc = " ";

                sb.append("Nama Barang : FIZR").append(title).append("\n");
                sb.append("Detail barang : dimensi_pxlxt_1_870_x_670_x_1_040_mm_jarak_antar_sumbu_roda_1_190_mm_ketinggian_jok_750_mm_jarak_terendah_ke_tanah_135_mm_bobot_95_kg_kapasitas_tangki_bbm_4_5_liter_mesin_engine_2_tak_air_cooled_ypcs_silinder_tunggal_bore_x_stroke_52_x_52_mm_kapasitas_silinder_110_4_cc").append(desc).append("\n");
                String detail = sb.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detail);

                startActivity(Intent.createChooser(shareintent, "Bagikan Melalui"));

            }
        });
    }
}