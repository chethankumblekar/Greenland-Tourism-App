package com.kc.places;

import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myadaptershiv extends FirebaseRecyclerAdapter<modelclassshiv,myadaptershiv.myviewholdershiv> {


    public myadaptershiv(@NonNull FirebaseRecyclerOptions<modelclassshiv> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholdershiv holder, int position, @NonNull modelclassshiv model) {

        holder.shivplacename.setText(model.getPname());
        holder.shvdesc.setText(model.getPdesc());
        Glide.with(holder.shvimage1.getContext()).load(model.getPimage()).into(holder.shvimage1);

        holder.reldist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity = (AppCompatActivity)view.getContext();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new descshivfragment(model.getPname(),model.getPimage(),model.getPdesc())).addToBackStack(null).commit();
            }
        });


        holder.shvimage1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AppCompatActivity activity = (AppCompatActivity)view.getContext();
                activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new descshivfragment(model.getPname(),model.getPimage(),model.getPdesc())).addToBackStack(null).commit();
            }
        });

    }

    @NonNull
    @Override
    public myviewholdershiv onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerowshiv,parent,false);
        return new myviewholdershiv(view);
    }

    public class myviewholdershiv extends RecyclerView.ViewHolder{

        ImageView shvimage1;
        TextView shivplacename,shvdesc;
        RelativeLayout reldist;


        public myviewholdershiv(@NonNull View itemView) {
            super(itemView);

            shvimage1 = itemView.findViewById(R.id.shvimage1);
            shivplacename = itemView.findViewById(R.id.shivplacename);
            shvdesc = itemView.findViewById(R.id.shvdesc);
            reldist = itemView.findViewById(R.id.reldist);


        }
    }
}


