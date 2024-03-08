package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;

public class hal1 extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal1);

        ImageView imageView = findViewById(R.id.tvimg);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentimg = new Intent(hal1.this, cbr.class);
                startActivity(intentimg);


            }
        });

        ImageView imgv = findViewById(R.id.imgr);
        imgv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentimg1 = new Intent(hal1.this,rlima.class);
                startActivity(intentimg1);
            }
        });

        ImageView imggsx = findViewById(R.id.gsx);
        imggsx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentgsx = new Intent(hal1.this,GSX.class);
                startActivity(intentgsx);
            }
        });

        ImageView imgvx = findViewById(R.id.imgvx);
        imgvx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentvx = new Intent(hal1.this, vixion.class);
                startActivity(intentvx);
            }
        });

        ImageView imgr25 = findViewById(R.id.imgr25);
        imgr25.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentr25 = new Intent(hal1.this, r25.class);
                startActivity(intentr25);
            }
        });

    }
}