package com.example.pc.codedelta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class TestAppointmentListActivity extends AppCompatActivity {
    private static final String TAG = "TestAppointmentListActi";

    int[] images = {R.drawable.chrisprofile,R.drawable.trevorcartoonprofile,R.drawable.shelly,R.drawable.chrisprofile};
    String[] names = {"Chris","Trevor","Shelly","Chris"};
    String[] dates = {"Monday 12:00pm Arlington","Tuesday 12:00pm Arlington","Wednesday 12:00pm Arlington","Thursday 12:00pm Arlington"};
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test_appointment_list);
        Log.d(TAG, "onCreate: Started.");
        list = (ListView) findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();

        list.setAdapter(customAdapter);

    }

        class CustomAdapter extends BaseAdapter{

            @Override
            public int getCount() {
                return images.length;
            }

            @Override
            public Object getItem(int position) {
                return null;
            }

            @Override
            public long getItemId(int position) {
                return 0;
            }

            @Override
            public View getView(int position, View convertView, ViewGroup parent) {

                View view = getLayoutInflater().inflate(R.layout.customlayout, null);

                ImageView mImageView = view.findViewById(R.id.imageView2);
                TextView mNameView = view.findViewById(R.id.Name);
                TextView mDateView = view.findViewById(R.id.Date);

                mImageView.setImageResource(images[position]);
                mNameView.setText(names[position]);
                mDateView.setText(dates[position]);
                return view;
            }
        }




    }

