package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class hal2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hal4);

        ImageView imgview = findViewById(R.id.imgrx);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentimg = new Intent(hal2.this, halrx.class);
                startActivity(intentimg);
            }
        });

        ImageView imgninja = findViewById(R.id.imgnin);
        imgninja.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentnin = new Intent(hal2.this, halninja.class);
                startActivity(intentnin);
            }
        });

        ImageView imgtupai = findViewById(R.id.imgtupai);
        imgtupai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenttupai = new Intent(hal2.this, haltupai.class);
                startActivity(intenttupai);
            }
        });

        ImageView imgrxz = findViewById(R.id.imgrxz);
        imgrxz.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentrxz = new Intent(hal2.this, rxz.class);
                startActivity(intentrxz);
            }
        });

        ImageView imgfizr = findViewById(R.id.imgfiz);
        imgfizr.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentfiz = new Intent(hal2.this, fizr.class);
                startActivity(intentfiz);
            }
        });

    }
}