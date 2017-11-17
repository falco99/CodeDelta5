package com.example.pc.codedelta;

import android.app.ListActivity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;

public class appointment_view_Activity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointment_view_);


        String[] appointments = {"Monday 12:00 pm Arlington", "Tuesday 3:30 pm Arlington","Thursday 11:00 am Mansfield","Saterday 8:00 pm Arlington"};

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getListView().getContext(), android.R.layout.simple_list_item_1,appointments);

    }
}
