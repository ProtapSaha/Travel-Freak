package com.example.protap.travelfreak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Rangpur extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout ramsagor;
    private LinearLayout vinnojogot;
    private LinearLayout rajbari;
    private LinearLayout dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rangpur);

        ramsagor=findViewById(R.id.ramsagor);
        vinnojogot=findViewById(R.id.vinnojogot);
        rajbari=findViewById(R.id.rajbari);
        dashboard=findViewById(R.id.dashboard);

        ramsagor.setOnClickListener(this);
        vinnojogot.setOnClickListener(this);
        rajbari.setOnClickListener(this);
        dashboard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==ramsagor){
            startActivity(new Intent(this,Ramsagor.class));
        }
        if (v==vinnojogot){
            startActivity(new Intent(this,Vinnojogot.class));
        }
        if (v==rajbari){
            startActivity(new Intent(this,Rajbari.class));
        }
        if (v==dashboard){
            startActivity(new Intent(this,Travel_freak.class));
        }
    }
}
