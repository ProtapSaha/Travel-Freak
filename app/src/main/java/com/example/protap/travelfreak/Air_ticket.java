package com.example.protap.travelfreak;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;

public class Air_ticket extends AppCompatActivity implements View.OnClickListener {
    private Button btnsubmit;
    private EditText phone;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_air_ticket);

        btnsubmit=findViewById(R.id.btnsubmit);
        phone=findViewById(R.id.phone);


        btnsubmit.setOnClickListener(this);

        Spinner dropdown = findViewById(R.id.from);
        String[] items = new String[]{"From(থেকে):", "ঢাকা (Shahjalal International Airport)", "চট্টগ্রাম (Shah Amanat International Airport)", "রাজশাহী (Shah Makhdum Airport)", "সৈয়দপুর (Saidpur Airport)", "বগুড়া (Bogra Airport)", "যশোর (Jessore Airport)", "সিলেট (Osmani International Airport)", "কক্সবাজার (Cox's Bazar Airport)", "বরিশাল (Barisal Airport)"};
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items);
        dropdown.setAdapter(adapter);

        Spinner dropdown2 = findViewById(R.id.to);
        String[] items2 = new String[]{"To(পর্যন্ত):", "ঢাকা (Shahjalal International Airport)", "চট্টগ্রাম (Shah Amanat International Airport)", "রাজশাহী (Shah Makhdum Airport)", "সৈয়দপুর (Saidpur Airport)", "বগুড়া (Bogra Airport)", "যশোর (Jessore Airport)", "সিলেট (Osmani International Airport)", "কক্সবাজার (Cox's Bazar Airport)", "বরিশাল (Barisal Airport)"};
        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items2);
        dropdown2.setAdapter(adapter2);

        Spinner dropdown3 = findViewById(R.id.airlines);
        String[] items3 = new String[]{"Preferred Airlines(পছন্দের বিমান সংস্থা):", "Biman Bangladesh Airlines", "Hello Air (Bangladesh)", "NovoAir", "Regent Airways", "South Asian Airlines", "United Airways", "US-Bangla Airlines", "Easy Fly Express", "SkyAir"};
        ArrayAdapter<String> adapter3 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items3);
        dropdown3.setAdapter(adapter3);

        Spinner dropdown4 = findViewById(R.id.seat);
        String[] items4 = new String[]{"Favorite Seat(পছন্দসই আসন):", "জানলা(Window)", "করিডোর(Aisle)"};
        ArrayAdapter<String> adapter4 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items4);
        dropdown4.setAdapter(adapter4);

        Spinner dropdown5 = findViewById(R.id.time);
        String[] items5 = new String[]{"Time(সময়):", "10.45AM", "2.40PM","7.30PM"};
        ArrayAdapter<String> adapter5 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items5);
        dropdown5.setAdapter(adapter5);

        Spinner dropdown6 = findViewById(R.id.man);
        String[] items6 = new String[]{"প্রাপ্তবয়স্ক(১২+ বছর)", "১", "২","৩","৪","৫","৫+"};
        ArrayAdapter<String> adapter6 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items6);
        dropdown6.setAdapter(adapter6);

        Spinner dropdown7 = findViewById(R.id.child);
        String[] items7 = new String[]{"শিশু(০-১১ বছর):", "১", "২","৩","৩+"};
        ArrayAdapter<String> adapter7 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_dropdown_item, items7);
        dropdown7.setAdapter(adapter7);
    }

    @Override
    public void onClick(View v) {
        if (v==btnsubmit)
        {
            String s = phone.getText().toString();
            if(s.length() >= 11 ) {
                startActivity(new Intent(this, Submitsuccess.class));
            }
            else{
                Toast.makeText(Air_ticket.this,"Please enter 11 digit valid phone number",Toast.LENGTH_SHORT).show();

            }
        }
    }
}
