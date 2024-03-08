package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class halninja extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halninja);

        Button sharebtn = findViewById(R.id.sharebtn);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();

                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("image/*");
                String title = " ";
                String desc = " ";

                sb.append("Nama Barang : NINJA").append(title).append("\n");
                sb.append("Detail barang : kapasitas_150_cc_jenis_mesin_2_stroke_sohc_diameter_x_langkah_59_mm_x_54_4_mm_rasio_kompresi_6_8_1_pipa_knalpot_single_exhaust_katup_per_silinder_2_k").append(desc).append("\n");
                String detail = sb.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detail);

                startActivity(Intent.createChooser(shareintent, "Bagikan Melalui"));

            }
        });
    }
}