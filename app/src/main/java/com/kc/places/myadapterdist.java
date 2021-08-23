package com.kc.places;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myadapterdist  extends FirebaseRecyclerAdapter<modelclass,myadapterdist.myviewholderdist> {

    public myadapterdist(@NonNull FirebaseRecyclerOptions<modelclass> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholderdist holder, int position, @NonNull modelclass model) {

        holder.distname.setText(model.getDname());
        Glide.with(holder.distimg1.getContext()).load(model.getDimage()).into(holder.distimg1);


        holder.distimg1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(model.dname.equals("Shivamogga")){
                    AppCompatActivity activity =(AppCompatActivity)view.getContext();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new shivfragment()).addToBackStack(null).commit();

                }
                else if(model.dname.equals("U.Kannada")){
                    AppCompatActivity activity =(AppCompatActivity)view.getContext();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new uttarafragment()).addToBackStack(null).commit();

                }

                else if(model.dname.equals("Chikmagalur")){
                    AppCompatActivity activity =(AppCompatActivity)view.getContext();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new chickfragment()).addToBackStack(null).commit();

                }

                else if(model.dname.equals("D.Kannada")){
                    AppCompatActivity activity =(AppCompatActivity)view.getContext();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new dakshinafragment()).addToBackStack(null).commit();

                }
                else if(model.dname.equals("Kodagu")){
                    AppCompatActivity activity =(AppCompatActivity)view.getContext();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new Kodagufragment()).addToBackStack(null).commit();

                }
                else if(model.dname.equals("Hasan")){
                    AppCompatActivity activity =(AppCompatActivity)view.getContext();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new hasanfragment()).addToBackStack(null).commit();

                }
                else if(model.dname.equals("Mysore")){
                    AppCompatActivity activity =(AppCompatActivity)view.getContext();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new mysorefragment()).addToBackStack(null).commit();

                }
                else if(model.dname.equals("Udupi")){
                    AppCompatActivity activity =(AppCompatActivity)view.getContext();
                    activity.getSupportFragmentManager().beginTransaction().replace(R.id.wrapper,new udupifragment()).addToBackStack(null).commit();

                }
            }
        });



    }

    @NonNull
    @Override
    public myviewholderdist onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.singlerow,parent,false);
        return new myviewholderdist(view);
    }

    public class myviewholderdist extends RecyclerView.ViewHolder{

        ImageView distimg1;
        TextView distname;


        public myviewholderdist(@NonNull View itemView) {
            super(itemView);
            distimg1 = itemView.findViewById(R.id.distimg1);
            distname = itemView.findViewById(R.id.distname);
        }

    }
}
