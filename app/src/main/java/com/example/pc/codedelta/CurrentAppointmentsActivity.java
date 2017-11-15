package com.example.pc.codedelta;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;
import android.widget.SimpleAdapter;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class CurrentAppointmentsActivity extends AppCompatActivity {

    //Array of tutors
    String[] tutors = new String[]{"Chris", "Steve"};
    //Array of Ints point to images
    int[] pics = new int[]{R.drawable.trevorcartoonprofile, R.drawable.chrisprofile};
    //Array of appointments
    String[] appt = new String[]{"Mon 2pm Dallas", "Thurs 3:30pm Arlington"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_current_appointments);

        List<HashMap<String, String>> aList = new ArrayList<HashMap<String, String>>();

        for (int i = 0; i < 10; i++) {
            HashMap<String, String> hm = new HashMap<String, String>();
            hm.put("tut", "Country : " + tutors[i]);
            hm.put("appt", "Currency : " + appt[i]);
            hm.put("pic", Integer.toString(pics[i]));
            aList.add(hm);

            String[] from = {"tut", "appt", "pic"};

            int[] to = {R.id.pic, R.id.tut, R.id.appt};

            SimpleAdapter adapter = new SimpleAdapter(getBaseContext(), aList, R.layout.listview_layout, from, to);

            ListView listView = (ListView) findViewById(R.id.listview);

            listView.setAdapter(adapter);
        }
    }
}
