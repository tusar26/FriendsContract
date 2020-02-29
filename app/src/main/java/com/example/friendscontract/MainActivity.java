package com.example.friendscontract;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int[] profile_image = {
            R.drawable.tusar_image_background,R.drawable.ic_launcher_background,R.drawable.ic_call,R.drawable.tusar_image_background,
            R.drawable.ic_launcher_foreground,R.drawable.tusar_image_background
    };

    Adapter adapter;

    String [] name,location;
    RecyclerView recyclerView;
    int [] number;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        recyclerView = (RecyclerView) findViewById(R.id.recyclerViewId);

        name  = getResources().getStringArray(R.array.name);
        location = getResources().getStringArray(R.array.country);
 /*       number = getResources().getStringArray(R.array.number);*/

        adapter = new Adapter(this,name,location,number,profile_image);
        recyclerView.setAdapter(adapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
