package com.example.protap.travelfreak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Places extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout dhaka;
    private LinearLayout rajshahi;
    private LinearLayout ctg;
    private LinearLayout khulna;
    private LinearLayout barisal;
    private LinearLayout sylhet;
    private LinearLayout mymensingh;
    private LinearLayout rangpur;
    private LinearLayout dashboard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_places);
        dhaka=findViewById(R.id.dhaka);
        rajshahi=findViewById(R.id.rajshahi);
        ctg=findViewById(R.id.ctg);
        khulna=findViewById(R.id.khulna);
        barisal=findViewById(R.id.barisal);
        sylhet=findViewById(R.id.sylhet);
        mymensingh=findViewById(R.id.mymensingh);
        rangpur=findViewById(R.id.rangpur);
        dashboard=findViewById(R.id.dashboard);

        dhaka.setOnClickListener(this);
        rajshahi.setOnClickListener(this);
        ctg.setOnClickListener(this);
        khulna.setOnClickListener(this);
        barisal.setOnClickListener(this);
        sylhet.setOnClickListener(this);
        mymensingh.setOnClickListener(this);
        rangpur.setOnClickListener(this);
        dashboard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==dhaka){
            startActivity(new Intent(this,Dhaka.class));
        }
        if (v==rajshahi){
            startActivity(new Intent(this,Raj.class));
        }
        if (v==ctg){
            startActivity(new Intent(this,Ctg.class));
        }
        if (v==khulna){
            startActivity(new Intent(this,Khulna.class));
        }
        if (v==barisal){
            startActivity(new Intent(this,Barisal.class));
        }
        if (v==sylhet){
            startActivity(new Intent(this,Sylhet.class));
        }
        if (v==mymensingh){
            startActivity(new Intent(this,Mymensingh.class));
        }
        if (v==rangpur){
            startActivity(new Intent(this,Rangpur.class));
        }
        if (v==dashboard){
            startActivity(new Intent(this,Travel_freak.class));
        }
    }
}
