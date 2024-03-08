package com.example.tugas3;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    Button btn1;
    Button btn2;

    Button btn3;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.matic);
        klik();


        LinearLayout mainlayout =  findViewById(R.id.mainlayout);
        mainlayout.setBackgroundColor(getResources().getColor(android.R.color.darker_gray));

    }

        void klik(){
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenthal1 = new Intent(MainActivity.this, hal1.class);
                startActivity(intenthal1);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intenthal2 = new Intent(MainActivity.this, hal2.class);
                startActivity(intenthal2);
            }
        });

            btn3.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intenthal2 = new Intent(MainActivity.this, halmatic.class);
                    startActivity(intenthal2);
                }
            });




        }
}


