package com.example.protap.travelfreak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Ctg extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout shitakundu;
    private LinearLayout bandarban;
    private LinearLayout potenga;
    private LinearLayout sajek;
    private LinearLayout nijhum;
    private LinearLayout saintmartin;
    private LinearLayout dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ctg);

        shitakundu=findViewById(R.id.shitakundu);
        bandarban=findViewById(R.id.bandarban);
        potenga=findViewById(R.id.potenga);
        sajek=findViewById(R.id.sajek);
        nijhum=findViewById(R.id.nijhum);
        saintmartin=findViewById(R.id.saintmartin);
        dashboard=findViewById(R.id.dashboard);

        shitakundu.setOnClickListener(this);
        bandarban.setOnClickListener(this);
        potenga.setOnClickListener(this);
        sajek.setOnClickListener(this);
        nijhum.setOnClickListener(this);
        saintmartin.setOnClickListener(this);
        dashboard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==shitakundu){
            startActivity(new Intent(this,Shitakundu.class));
        }
        if (v==bandarban){
            startActivity(new Intent(this,Bandarban.class));
        }
        if (v==potenga){
            startActivity(new Intent(this,Potenga.class));
        }
        if (v==sajek){
            startActivity(new Intent(this,Sajek.class));
        }
        if (v==nijhum){
            startActivity(new Intent(this,Nijhum.class));
        }
        if (v==saintmartin){
            startActivity(new Intent(this,Saintmartin.class));
        }
        if (v==dashboard){
            startActivity(new Intent(this,Travel_freak.class));
        }
    }
}
