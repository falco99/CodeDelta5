package com.example.pc.codedelta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.ImageButton;

public class Apppointments2Activity extends AppCompatActivity {

    ImageButton btn,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_apppointments2);

        btn = (ImageButton) findViewById(R.id.schdbttn);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

              Intent intent = new Intent(Apppointments2Activity.this,CurrentAppointmentsActivity.class);

                        startActivity(intent);
            }
        });
        btn2 = (ImageButton) findViewById(R.id.clndrbttn);
        btn2.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent = new Intent(Apppointments2Activity.this,CalendarActivity.class);
                startActivity(intent);
            }
        });
    }
}
