package com.example.protap.travelfreak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Sylhet extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout sylhet;
    private LinearLayout tangua;
    private LinearLayout sada_pathor;
    private LinearLayout dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sylhet);

        sylhet=findViewById(R.id.sylhet);
        tangua=findViewById(R.id.tangua);
        sada_pathor=findViewById(R.id.sada_pathor);
        dashboard=findViewById(R.id.dashboard);

        sylhet.setOnClickListener(this);
        tangua.setOnClickListener(this);
        sada_pathor.setOnClickListener(this);
        dashboard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==sylhet){
            startActivity(new Intent(this,Sylhet_sohor.class));
        }
        if (v==tangua){
            startActivity(new Intent(this,Tangua.class));
        }
        if (v==sada_pathor){
            startActivity(new Intent(this,Sada_pathor.class));
        }
        if (v==dashboard){
            startActivity(new Intent(this,Travel_freak.class));
        }
    }
}
