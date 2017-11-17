package com.example.pc.codedelta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class TestAppointmentListActivity extends AppCompatActivity {
    private static final String TAG = "TestAppointmentListActi";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_appointment_list);
        Log.d(TAG,"onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listview);

        //Create the appointment object)

        AppList john = new AppList("John","Monday 12:00pm","Arlington");
        AppList chris = new AppList("Chris","Tueday 1:00pm","Arlington");
        AppList steve = new AppList("Steve","Wednesday 8:00pm","Arlington");


        //Add the appointments to an array list

        ArrayList<AppList> AppointmentList = new ArrayList<>();
        AppointmentList.add(john);
        AppointmentList.add(chris);
        AppointmentList.add(steve);

        AppiontmentListAdapter adapter = new AppiontmentListAdapter(this, R.layout.adapter_view_layout,AppointmentList);


    }
}
