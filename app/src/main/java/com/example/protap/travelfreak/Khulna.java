package com.example.protap.travelfreak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Khulna extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout sundarban;
    private LinearLayout shatgombuj;
    private LinearLayout dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khulna);

        sundarban=findViewById(R.id.sundarban);
        shatgombuj=findViewById(R.id.shatgombuj);
        dashboard=findViewById(R.id.dashboard);

        shatgombuj.setOnClickListener(this);
        sundarban.setOnClickListener(this);
        dashboard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==sundarban){
            startActivity(new Intent(this,Sundarban.class));
        }
        if (v==shatgombuj){
            startActivity(new Intent(this,Shatgombuj.class));
        }
        if (v==dashboard){
            startActivity(new Intent(this,Travel_freak.class));
        }
    }
}
