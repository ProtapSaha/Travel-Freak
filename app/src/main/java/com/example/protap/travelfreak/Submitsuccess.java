package com.example.protap.travelfreak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;

import com.google.firebase.auth.FirebaseAuth;

public class Submitsuccess extends AppCompatActivity implements View.OnClickListener {
    private LinearLayout dashboard2;
    private LinearLayout logout2;
    FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_submitsuccess);

        firebaseAuth=FirebaseAuth.getInstance();

        dashboard2=findViewById(R.id.dashboard2);
        logout2=findViewById(R.id.logout2);

        dashboard2.setOnClickListener(this);
        logout2.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==dashboard2){
            startActivity(new Intent(this,Travel_freak.class));
        }
        if (v==logout2){
            firebaseAuth.signOut();
            finish();
            startActivity(new Intent(this,login.class));
        }
    }
}
