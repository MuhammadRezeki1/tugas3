package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class halmatic extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halmatic);

        ImageView imgview = findViewById(R.id.imgvario);
        imgview.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentimg = new Intent(halmatic.this, vario.class);
                startActivity(intentimg);
            }
        });

        ImageView imgmio = findViewById(R.id.imgmio);
        imgmio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentimg = new Intent(halmatic.this, mio.class);
                startActivity(intentimg);
            }
        });

        ImageView imgbeat = findViewById(R.id.imgbeat);
        imgbeat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentimg = new Intent(halmatic.this, beat.class);
                startActivity(intentimg);
            }
        });
        ImageView imgnmax = findViewById(R.id.imgnmax);
        imgnmax.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentimg = new Intent(halmatic.this, nmax.class);
                startActivity(intentimg);
            }
        });

        ImageView imgpcx = findViewById(R.id.imgpcx);
        imgpcx.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intentimg = new Intent(halmatic.this, pcx.class);
                startActivity(intentimg);
            }
        });
    }
}