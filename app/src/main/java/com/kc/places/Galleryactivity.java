package com.kc.places;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.transition.Slide;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.denzcoskun.imageslider.ImageSlider;
import com.denzcoskun.imageslider.constants.ScaleTypes;
import com.denzcoskun.imageslider.interfaces.ItemClickListener;
import com.denzcoskun.imageslider.models.SlideModel;
import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;
import java.util.List;

public class Galleryactivity extends AppCompatActivity {
    ImageSlider waterslider,sanctuaryslider,palaceslider,templeslider,viewpontslider,beacheslider;
    ImageView backgallery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_galleryactivity);

        backgallery = findViewById(R.id.backgallery);
        backgallery.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent firstactivity = new Intent(Galleryactivity.this,firstpage.class);
                startActivity(firstactivity);
            }
        });



        waterslider = findViewById(R.id.water_slider);
    final List<SlideModel> waterimages = new ArrayList<>();

    FirebaseDatabase.getInstance().getReference().child("Water Falls").addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot snapshot) {
            for (DataSnapshot data:snapshot.getChildren()){
                waterimages.add(new SlideModel(data.child("imgurl").getValue().toString(),data.child("imgtitle").getValue().toString(), ScaleTypes.FIT));
            }
            waterslider.setImageList(waterimages,ScaleTypes.FIT);

            waterslider.setItemClickListener(new ItemClickListener() {
                @Override
                public void onItemSelected(int i) {
                    Toast.makeText(Galleryactivity.this, waterimages.get(i).getTitle().toString(), Toast.LENGTH_SHORT).show();
                    
                }
            });

        }

        @Override
        public void onCancelled(@NonNull DatabaseError error) {

        }
    });


    sanctuaryslider = findViewById(R.id.sanctuary_slider);
    final List<SlideModel> sanctuaryimages = new ArrayList<>();
    FirebaseDatabase.getInstance().getReference().child("Sanctuaries").addListenerForSingleValueEvent(new ValueEventListener() {
        @Override
        public void onDataChange(@NonNull DataSnapshot snapshot) {
            for(DataSnapshot data:snapshot.getChildren()){
                sanctuaryimages.add(new SlideModel(data.child("imgurl").getValue().toString(),data.child("imgtitle").getValue().toString(),ScaleTypes.FIT));
            }
            sanctuaryslider.setImageList(sanctuaryimages,ScaleTypes.FIT);
            sanctuaryslider.setItemClickListener(new ItemClickListener() {
                @Override
                public void onItemSelected(int i) {
                    Toast.makeText(Galleryactivity.this, sanctuaryimages.get(i).getTitle().toString(), Toast.LENGTH_SHORT).show();

                }
            });

        }

        @Override
        public void onCancelled(@NonNull DatabaseError error) {

        }
    });



        beacheslider = findViewById(R.id.beaches_slider);
        final List<SlideModel> beachesimages = new ArrayList<>();
        FirebaseDatabase.getInstance().getReference().child("Beaches").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot data:snapshot.getChildren()){
                    beachesimages.add(new SlideModel(data.child("imgurl").getValue().toString(),data.child("imgtitle").getValue().toString(),ScaleTypes.FIT));
                }
                beacheslider.setImageList(beachesimages,ScaleTypes.FIT);
                beacheslider.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onItemSelected(int i) {
                        Toast.makeText(Galleryactivity.this, beachesimages.get(i).getTitle().toString(), Toast.LENGTH_SHORT).show();

                    }
                });

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



        templeslider = findViewById(R.id.temples_slider);
        final List<SlideModel> templeimages = new ArrayList<>();
        FirebaseDatabase.getInstance().getReference().child("Temples").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot data:snapshot.getChildren()){
                    templeimages.add(new SlideModel(data.child("imgurl").getValue().toString(),data.child("imgtitle").getValue().toString(),ScaleTypes.FIT));
                }
                templeslider.setImageList(templeimages,ScaleTypes.FIT);
                templeslider.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onItemSelected(int i) {
                        Toast.makeText(Galleryactivity.this, templeimages.get(i).getTitle().toString(), Toast.LENGTH_SHORT).show();

                    }
                });

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });



        viewpontslider = findViewById(R.id.viewpoint_slider);
        final List<SlideModel> viewpointimages = new ArrayList<>();
        FirebaseDatabase.getInstance().getReference().child("View Points").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot data:snapshot.getChildren()){
                    viewpointimages.add(new SlideModel(data.child("imgurl").getValue().toString(),data.child("imgtitle").getValue().toString(),ScaleTypes.FIT));
                }
                viewpontslider.setImageList(viewpointimages,ScaleTypes.FIT);
                viewpontslider.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onItemSelected(int i) {
                        Toast.makeText(Galleryactivity.this, viewpointimages.get(i).getTitle().toString(), Toast.LENGTH_SHORT).show();

                    }
                });

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });

        palaceslider = findViewById(R.id.palace_slider);
        final List<SlideModel> palaceimages = new ArrayList<>();
        FirebaseDatabase.getInstance().getReference().child("Palaces").addListenerForSingleValueEvent(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                for(DataSnapshot data:snapshot.getChildren()){
                    palaceimages.add(new SlideModel(data.child("imgurl").getValue().toString(),data.child("imgtitle").getValue().toString(),ScaleTypes.FIT));
                }
                palaceslider.setImageList(palaceimages,ScaleTypes.FIT);

                palaceslider.setItemClickListener(new ItemClickListener() {
                    @Override
                    public void onItemSelected(int i) {
                        Toast.makeText(Galleryactivity.this, palaceimages.get(i).getTitle().toString(), Toast.LENGTH_SHORT).show();

                    }
                });

            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });


    }
}