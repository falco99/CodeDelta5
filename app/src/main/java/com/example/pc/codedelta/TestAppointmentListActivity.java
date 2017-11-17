package com.example.pc.codedelta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ListView;

public class TestAppointmentListActivity extends AppCompatActivity {
    private static final String TAG = "TestAppointmentListActi";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_appointment_list);
        Log.d(TAG,"onCreate: Started.");
        ListView mListView = (ListView) findViewById(R.id.listview);

        //Create the appointment object);
    }
}
