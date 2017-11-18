package com.example.pc.codedelta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class appointments_Activity extends AppCompatActivity {


    Button btn,btn2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointments_);

        btn = (Button) findViewById(R.id.view_schd);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent = new Intent(appointments_Activity.this,TestAppointmentListActivity.class);
                startActivity(intent);
            }
        });


    }
}
