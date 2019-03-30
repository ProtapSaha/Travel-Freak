package com.example.protap.travelfreak;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Ticket extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout plane;
    private LinearLayout car;
    private LinearLayout train;
    private LinearLayout bus;
    private LinearLayout dashboard;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ticket);

        plane=findViewById(R.id.plane);
        car=findViewById(R.id.car);
        train=findViewById(R.id.train);
        bus=findViewById(R.id.bus);
        dashboard=findViewById(R.id.dashboard);

        plane.setOnClickListener(this);
        car.setOnClickListener(this);
        train.setOnClickListener(this);
        bus.setOnClickListener(this);
        dashboard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==plane){
            startActivity(new Intent(this,Air_ticket.class));
        }
        if (v==car){
            startActivity(new Intent(this,Car.class));
        }
        if (v==train){
            String url = "http://esheba.cnsbd.com";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        if (v== bus){
            String url = "http://shohoz.com";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        if (v==dashboard){
            startActivity(new Intent(this,Travel_freak.class));
        }

    }
}
