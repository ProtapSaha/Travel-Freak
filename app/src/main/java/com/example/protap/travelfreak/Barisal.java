package com.example.protap.travelfreak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

public class Barisal extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout shorupkathi;
    private LinearLayout shapla_gram;
    private LinearLayout kuakata;
    private LinearLayout dashboard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_barisal);

        shorupkathi=findViewById(R.id.shorupkathi);
        shapla_gram=findViewById(R.id.shapla_gram);
        kuakata=findViewById(R.id.kuakata);
        dashboard=findViewById(R.id.dashboard);

        shorupkathi.setOnClickListener(this);
        shapla_gram.setOnClickListener(this);
        kuakata.setOnClickListener(this);
        dashboard.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==shorupkathi){
            startActivity(new Intent(this,Shorupkathi.class));
        }
        if (v==shapla_gram){
            startActivity(new Intent(this,Shapla_gram.class));
        }
        if (v==kuakata){
            startActivity(new Intent(this,Kuakata.class));
        }
        if (v==dashboard){
            startActivity(new Intent(this,Travel_freak.class));
        }
    }
}
