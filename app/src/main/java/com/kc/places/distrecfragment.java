package com.kc.places;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.firebase.ui.database.FirebaseRecyclerOptions;
import com.google.firebase.database.FirebaseDatabase;

public class distrecfragment extends Fragment {


    private static final String ARG_PARAM1 = "param1";
    private static final String ARG_PARAM2 = "param2";
    private String mParam1;
    private String mParam2;
    RecyclerView recview1;
    myadapterdist adapter;
    ImageView backtofirst;


    public distrecfragment() {
        // Required empty public constructor
    }


    public static distrecfragment newInstance(String param1, String param2) {
        distrecfragment fragment = new distrecfragment();
        Bundle args = new Bundle();
        args.putString(ARG_PARAM1, param1);
        args.putString(ARG_PARAM2, param2);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            mParam1 = getArguments().getString(ARG_PARAM1);
            mParam2 = getArguments().getString(ARG_PARAM2);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view =  inflater.inflate(R.layout.fragment_distrecfragment, container, false);

       recview1 = view.findViewById(R.id.recview1);
       recview1.setLayoutManager(new GridLayoutManager(getContext(),2));


        FirebaseRecyclerOptions<modelclass> options =
                new FirebaseRecyclerOptions.Builder<modelclass>()
                        .setQuery(FirebaseDatabase.getInstance().getReference().child("Districts"), modelclass.class)
                        .build();

        adapter = new myadapterdist(options);
        recview1.setAdapter(adapter);

       backtofirst = view.findViewById(R.id.backtofirst);
       backtofirst.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               Intent i = new Intent(getActivity(), firstpage.class);
               startActivity(i);
               ((Activity) getActivity()).overridePendingTransition(1000, 1000);
           }
       });



        return view;
    }

    @Override
    public void onStart() {
        super.onStart();
        adapter.startListening();
    }

    @Override
    public void onStop() {
        super.onStop();
        adapter.stopListening();
    }
}

