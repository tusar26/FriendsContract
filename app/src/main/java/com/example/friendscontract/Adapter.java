package com.example.friendscontract;

import android.content.Context;
import android.media.Image;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.zip.Inflater;

public class Adapter extends RecyclerView.Adapter<Adapter.MyViewHolder> {

    Context context;

    String [] name,location;
    String[] number;
    int[] profile_image;

    public Adapter(Context context, String[] name, String[] location, String[] number, int[] images) {
        this.context = context;
        this.name = name;
        this.location = location;
        this.number = number;
        this.profile_image = images;
    }



    @NonNull
    @Override
    public Adapter.MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        LayoutInflater layoutInflater =LayoutInflater.from(context);
        View view = layoutInflater.inflate(R.layout.recycle_custom_design,parent,false);
        return new MyViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull Adapter.MyViewHolder holder, int position) {

        holder.nameTextView.setText(name[position]);
        holder.locationTextView.setText(location[position]);
        holder.profileImageView.setImageResource(profile_image[position]);

    }

    @Override
    public int getItemCount() {
        return name.length;
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView nameTextView,locationTextView;
        int[] number;
        ImageView profileImageView;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);


            nameTextView  = itemView.findViewById(R.id.nameId);
            locationTextView = itemView.findViewById(R.id.locationId);
            profileImageView = itemView.findViewById(R.id.profile_image);


        }
    }
}
