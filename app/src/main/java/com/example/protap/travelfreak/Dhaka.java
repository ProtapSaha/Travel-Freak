package com.example.protap.travelfreak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Dhaka extends AppCompatActivity implements View.OnClickListener{
    private LinearLayout moinotghat;
    private LinearLayout ngonj;
    private LinearLayout shapla;
    private LinearLayout shohagpolli;
    private LinearLayout jindapark;
    private LinearLayout lalbag;
    private LinearLayout dashboard3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dhaka);

        moinotghat=findViewById(R.id.moinotghattttt);
        ngonj=findViewById(R.id.ngonj);
        shapla=findViewById(R.id.shapla);
        shohagpolli=findViewById(R.id.shohagpolli);
        jindapark=findViewById(R.id.jindapark);
        lalbag=findViewById(R.id.lalbag);
        dashboard3=findViewById(R.id.dashboard3);

        moinotghat.setOnClickListener(this);
        ngonj.setOnClickListener(this);
        shapla.setOnClickListener(this);
        shohagpolli.setOnClickListener(this);
        jindapark.setOnClickListener(this);
        lalbag.setOnClickListener(this);
        dashboard3.setOnClickListener(this);
}


    @Override
    public void onClick(View v) {
        if (v==moinotghat){
            startActivity(new Intent(this,Moinot.class));
        }
        if (v==ngonj){
            startActivity(new Intent(this,Ngonj.class));
        }
        if (v==shapla){
            startActivity(new Intent(this,Shapla.class));
        }
        if (v==shohagpolli){
            startActivity(new Intent(this,Shohagpolli.class));
        }
        if (v==jindapark){
            startActivity(new Intent(this,Jindapark.class));
        }
        if (v==lalbag){
            startActivity(new Intent(this,Lalbag.class));
        }
        if (v==dashboard3){
            startActivity(new Intent(this,Travel_freak.class));
        }
    }
}
