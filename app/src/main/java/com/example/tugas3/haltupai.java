package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class haltupai extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_haltupai);
        Button sharebtn = findViewById(R.id.sharebtn);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();

                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("image/*");
                String title = " ";
                String desc = " ";

                sb.append("Nama Barang : 125Z").append(title).append("\n");
                sb.append("Detail barang : perihal_spesifikasi_motor_ini_sudah_dilengkapi_dengan_mesin_2_tak_berkapasitas_dengan_sistem_berpendingin_udara_mesin_ini_dapat_menghasilkan_tenaga_maksimum_sebesar_17_5_horse_power_pada_8000rpm").append(desc).append("\n");
                String detail = sb.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detail);

                startActivity(Intent.createChooser(shareintent, "Bagikan Melalui"));

            }
        });
    }
}