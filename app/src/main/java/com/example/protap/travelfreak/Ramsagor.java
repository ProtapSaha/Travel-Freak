package com.example.protap.travelfreak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ramsagor extends AppCompatActivity implements View.OnClickListener {
    private Button back;
    private Button dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ramsagor);

        back=findViewById(R.id.back);
        dashboard=findViewById(R.id.dashboard);

        back.setOnClickListener(this);
        dashboard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==back)
        {
            startActivity(new Intent(this,Rangpur.class));
        }
        if (v==dashboard)
        {
            startActivity(new Intent(this,Travel_freak.class));
        }
    }
}
