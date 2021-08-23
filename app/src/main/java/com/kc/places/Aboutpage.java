package com.kc.places;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Aboutpage extends AppCompatActivity {

    ImageView backabout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutpage);

        backabout = findViewById(R.id.backabout);

        backabout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent firstactivity = new Intent(Aboutpage.this,firstpage.class);
                startActivity(firstactivity);

            }
        });


    }
}