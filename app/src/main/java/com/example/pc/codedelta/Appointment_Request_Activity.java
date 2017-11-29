package com.example.pc.codedelta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class Appointment_Request_Activity extends AppCompatActivity {
    Button bt1;

    String[] dates = {"Monday December 4","Wednesday December 6", "Thursday December 7"};
    String[] times = {"10:00am","1:00pm","3:00pm"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment__request_);

        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, dates);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner =  findViewById(R.id.spinner4);
        spinner.setAdapter(adapter);

        ArrayAdapter<String> adapter2 = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, times);
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner2 =  findViewById(R.id.spinner5);
        spinner2.setAdapter(adapter2);
        //ddd
        bt1 = (Button) findViewById(R.id.button6);

        bt1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent register = new Intent(Appointment_Request_Activity.this, Request_good_2Activity.class);
                Appointment_Request_Activity.this.startActivity(register);
            }
        });
    }
}
