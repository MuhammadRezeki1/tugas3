package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class rxz extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rxz);

        Button sharebtn = findViewById(R.id.sharebtn);
        sharebtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                StringBuilder sb = new StringBuilder();

                Intent shareintent = new Intent(Intent.ACTION_SEND);
                shareintent.setType("image/*");
                String title = " ";
                String desc = " ";

                sb.append("Nama Barang : RXZ").append(title).append("\n");
                sb.append("Detail barang : engine_2_stroke_135cc_air_cooled_engine_cylinder_arrangement_forward_inclined_single_cylinder_displacement_133_cc_max_power_20_ps_15_kw_8_500_rpm_max_torque_1_85_kgf_m_18_1_n_m_7_500_rpm_max_speed_165_km_h_bore_x_stroke_56_0_x_54_0_mm_compression_ratio_7_1_carburetion_mikuni_vm26_transmission_6_speed_return").append(desc).append("\n");
                String detail = sb.toString();
                shareintent.putExtra(Intent.EXTRA_TEXT, detail);

                startActivity(Intent.createChooser(shareintent, "Bagikan Melalui"));

            }
        });
    }
}