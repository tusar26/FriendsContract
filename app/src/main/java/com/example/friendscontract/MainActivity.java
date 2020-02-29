package com.example.friendscontract;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] profile_image = {
            R.mipmap.tusar_image,R.mipmap.sir_image,R.mipmap.abdullah_image,R.mipmap.noman_image,R.mipmap.robi_image,
            R.mipmap.ovijit_image,R.mipmap.ic_launcher
    };

    Adapter adapter;

    String [] name,location;
    RecyclerView recyclerView;
    String[] number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewId);

        name  = getResources().getStringArray(R.array.name);
        location = getResources().getStringArray(R.array.country);
        number = getResources().getStringArray(R.array.number);

        adapter = new Adapter(this,name,location,number,profile_image);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
