package com.kc.places;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.models.SlideModel;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class firstpage extends AppCompatActivity {

    ImageSlider firstslider;
    ImageButton distbtn;
    ImageButton gallerybtn;
    ImageButton aboutusbtn;
    ImageButton contactusbtn;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_firstpage);

        distbtn = findViewById(R.id.distbtn);
        distbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent distactivity = new Intent(firstpage.this,MainActivity.class);
                startActivity(distactivity);
            }
        });


        aboutusbtn = findViewById(R.id.aboutusbtn);
        aboutusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent aboutusactivity = new Intent(firstpage.this,Aboutpage.class);
                startActivity(aboutusactivity);
            }
        });

        contactusbtn = findViewById(R.id.contactusbtn);
        contactusbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent contactusactivity = new Intent(firstpage.this,Contactus.class);
                startActivity(contactusactivity);
            }
        });


        gallerybtn = findViewById(R.id.gallerybtn);
        gallerybtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent galleryactivity = new Intent(firstpage.this,Galleryactivity.class);
                startActivity(galleryactivity);
            }
        });



        firstslider = (ImageSlider)findViewById(R.id.image_slider1);
        final List<SlideModel> remoteimages = new ArrayList<>();


        FirebaseDatabase.getInstance().getReference().child("Slider").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot data:snapshot.getChildren()){
                    remoteimages.add(new SlideModel(data.child("imageurl").getValue().toString(),data.child("title").getValue().toString(), ScaleTypes.FIT));

                }

                firstslider.setImageList(remoteimages,ScaleTypes.FIT);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });




    }
}