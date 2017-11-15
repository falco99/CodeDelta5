package com.example.pc.codedelta;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.ListView;

public class CurrentAppointmentActivity extends AppCompatActivity {

    Button btn, btn2;



ListView lst;
String[] tutorname = {"James","Chris"};
    String[] Appt = {"Monday 12pm Arlington","Tusday 2:30 Arlington"};
    Integer[] imgid={R.drawable.trevorcartoonprofile,R.drawable.chrisprofile};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_appointment);

        lst = (ListView) findViewById(R.id.listview);
        CustomListview customListview = new CustomListview(this,tutorname,Appt,imgid);

        btn = (Button) findViewById(R.id.NewAppt);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(CurrentAppointmentActivity.this, TutoringCategories.class);
                startActivity(intent);
            }
        });
    }
}
