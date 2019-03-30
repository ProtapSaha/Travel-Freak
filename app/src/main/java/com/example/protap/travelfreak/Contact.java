package com.example.protap.travelfreak;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class Contact extends AppCompatActivity implements View.OnClickListener {
    private ImageView ivfb;
    private ImageView ivinsta;
    private ImageView ivemail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_contact);

        ivfb=findViewById(R.id.ivfb);
        ivinsta=findViewById(R.id.ivinsta);
        ivemail=findViewById(R.id.ivemail);

        ivfb.setOnClickListener(this);
        ivemail.setOnClickListener(this);
        ivinsta.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v==ivfb){
            String url = "http://www.facebook.com/protap.k.saha";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        if (v==ivinsta){
            String url = "http://www.instagram.com/protap_k_saha";
            Intent i = new Intent(Intent.ACTION_VIEW);
            i.setData(Uri.parse(url));
            startActivity(i);
        }
        if (v==ivemail){
            Intent intent = new Intent(Intent.ACTION_SEND);
            intent.setType("text/html");
            intent.putExtra(Intent.EXTRA_EMAIL, "protap.k.saha@gmail.com");
            intent.putExtra(Intent.EXTRA_SUBJECT, "");
            intent.putExtra(Intent.EXTRA_TEXT, "");

            startActivity(Intent.createChooser(intent, "Send Email"));
        }
    }
}
