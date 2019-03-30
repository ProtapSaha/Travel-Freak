package com.example.protap.travelfreak;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class Travel_freak extends AppCompatActivity implements View.OnClickListener{

    private LinearLayout logout;
    private LinearLayout places;
    private LinearLayout ticket;
    private LinearLayout rating;
    private LinearLayout apps;
    private LinearLayout contact;
    private LinearLayout hotel;

    private FirebaseAuth firebaseAuth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_travel_freak);

        logout=findViewById(R.id.logout);
        places=findViewById(R.id.places);
        ticket=findViewById(R.id.ticket);
        rating=findViewById(R.id.rating);
        apps=findViewById(R.id.apps);
        contact=findViewById(R.id.contact);
        hotel=findViewById(R.id.hotel);

        firebaseAuth=FirebaseAuth.getInstance();
        if (firebaseAuth.getCurrentUser()== null){
            finish();
            startActivity(new Intent(this, login.class));
        }
        FirebaseUser user= firebaseAuth.getCurrentUser();
        logout.setOnClickListener(this);
        places.setOnClickListener(this);
        ticket.setOnClickListener(this);
        rating.setOnClickListener(this);
        apps.setOnClickListener(this);
        contact.setOnClickListener(this);
        hotel.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if (view==logout){
            firebaseAuth.signOut();
            finish();
            startActivity(new Intent(this,login.class));
        }
        if (view==places){
            startActivity(new Intent(this,Places.class));
        }
        if (view==ticket){
            startActivity(new Intent(this,Ticket.class));
        }
        if (view==rating){
            String url = "http://play.google.com";

            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
            }
        if (view==apps){
            String url = "http://play.google.com";

            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        if (view==contact){
            startActivity(new Intent(this,Contact.class));
        }
        if (view==hotel){
            startActivity(new Intent(this,Hotel.class));
        }

    }
}
