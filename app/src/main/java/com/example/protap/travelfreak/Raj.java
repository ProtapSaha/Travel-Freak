package com.example.protap.travelfreak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Raj extends AppCompatActivity implements View.OnClickListener
{
    private LinearLayout padma;
    private LinearLayout sona;
    private LinearLayout rajbari;
    private LinearLayout puthia;
    private LinearLayout paharpur;
    private LinearLayout alta;
    private LinearLayout dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_raj);

        padma=findViewById(R.id.padma);
        sona=findViewById(R.id.sona);
        rajbari=findViewById(R.id.rajbari);
        puthia=findViewById(R.id.puthia);
        paharpur=findViewById(R.id.paharpur);
        alta=findViewById(R.id.alta);
        dashboard=findViewById(R.id.dashboard);

        padma.setOnClickListener(this);
        sona.setOnClickListener(this);
        rajbari.setOnClickListener(this);
        puthia.setOnClickListener(this);
        paharpur.setOnClickListener(this);
        alta.setOnClickListener(this);
        dashboard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==padma){
            startActivity(new Intent(this,Padma.class));
        }
        if (v==sona){
            startActivity(new Intent(this,Sonamosjid.class));
        }
        if (v==rajbari){
            startActivity(new Intent(this,Rajbari.class));
        }
        if (v==puthia){
            startActivity(new Intent(this,Puthia.class));
        }
        if (v==paharpur){
            startActivity(new Intent(this,Paharpur.class));
        }
        if (v==alta){
            startActivity(new Intent(this,Altadighi.class));
        }
        if (v==dashboard){
            startActivity(new Intent(this,Travel_freak.class));
        }
    }
}
