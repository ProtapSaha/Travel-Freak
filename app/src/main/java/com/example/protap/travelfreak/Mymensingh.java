package com.example.protap.travelfreak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Mymensingh extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout birishiri;
    private LinearLayout dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mymensingh);
        birishiri=findViewById(R.id.birishiri);
        dashboard=findViewById(R.id.dashboard);

        birishiri.setOnClickListener(this);
        dashboard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==birishiri){
            startActivity(new Intent(this,Birishiri.class));
        }
        if (v==dashboard){
            startActivity(new Intent(this,Travel_freak.class));
        }
    }
}
