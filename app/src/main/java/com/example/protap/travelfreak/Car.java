package com.example.protap.travelfreak;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class Car extends AppCompatActivity implements View.OnClickListener {
    private Button btnsubmit;
    private EditText phone;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_car);

        Spinner dropdown5 = findViewById(R.id.time);
        String[] items5 = new String[]{"Departure Time(ছাড়ার সময়):","8.00AM", "9.00AM","10.00AM","11.00AM","12.00PM","3.00PM","4.00PM","5.00PM","6.00PM","7.00PM","8.00PM"};
        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items5);
        dropdown5.setAdapter(adapter5);


        Spinner dropdown6 = findViewById(R.id.passenger);
        String[] items6 = new String[]{"1","2", "3","4","5","6","7","7+"};
        ArrayAdapter<String> adapter6 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items6);
        dropdown6.setAdapter(adapter6);

        btnsubmit=findViewById(R.id.btnsubmit);
        phone=findViewById(R.id.phone);

        btnsubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v==btnsubmit){
            String s = phone.getText().toString();
            if(s.length() >= 11 ) {
                startActivity(new Intent(this, Submitsuccess.class));
            }
            else{
                Toast.makeText(Car.this,"Please enter 11 digit valid phone number",Toast.LENGTH_SHORT).show();

            }
        }
    }
}
