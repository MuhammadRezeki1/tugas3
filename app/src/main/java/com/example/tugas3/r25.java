package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class r25 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_r25);

        Button sharebtn = findViewById(R.id.sharebtn);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();

                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("image/*");
                String title = " ";
                String desc = " ";

                sb.append("Nama Barang : R25").append(title).append("\n");
                sb.append("Detail barang : kapasitas_250_cc_tenaga_maksimal_35_5_hp_jenis_mesin_inline_2_cylinder_4_stroke_4_valve_liquid_cooled_dohc_torsi_maksimal_23_6_nm_jenis_kopling_wet_multi_plate_manual_sistem_pendinginan_pendingin_cairan_pipa_knalpot_single_exhaust_jumlah_langkah_4_stroke").append(desc).append("\n");
                String detail = sb.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detail);

                startActivity(Intent.createChooser(shareintent, "Bagikan Melalui"));

            }
        });
    }
}