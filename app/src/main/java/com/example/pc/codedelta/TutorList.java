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
import android.widget.AdapterView;
import android.content.Intent;
import android.widget.Toast;

public class TutorList extends AppCompatActivity {
    private static final String TAG = "Tutorlist";

    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_list);

        Intent i = getIntent();

        String firstField = i.getStringExtra("firstField");
        Toast.makeText(this, firstField,
                Toast.LENGTH_LONG).show();

        String secondField = i.getStringExtra("secondField");
        Toast.makeText(this, secondField,
                Toast.LENGTH_LONG).show();

        String thirdField = i.getStringExtra("thirdField");
        Toast.makeText(this, thirdField,
                Toast.LENGTH_LONG).show();


        Log.d(TAG, "onCreate: Started.");
        list = findViewById(R.id.listview);
        CustomAdapter customAdapter = new CustomAdapter();
        list.setAdapter(customAdapter);

        // testing on click listener
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
                Intent intent = new Intent(TutorList.this, searchedTutorProfile.class);
                intent.putExtra("name", ((CodeDelta5)getApplicationContext()).firstNames[position]);
                intent.putExtra("last", ((CodeDelta5)getApplicationContext()).lastNames[position]);
                String location = Integer.toString(position);
                intent.putExtra("imageLocation", location);
                startActivity(intent);
            }
        });

    }

    class CustomAdapter extends BaseAdapter{

        @Override
        public int getCount() {
            return ((CodeDelta5)getApplicationContext()).images.length;
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

            View view = getLayoutInflater().inflate(R.layout.tutorlist_listview_layout, null);

            ImageView mImageView = view.findViewById(R.id.imageViewTutorList);//.imageView2);
            TextView mNameView = view.findViewById(R.id.tutorFName);
            TextView mDateView = view.findViewById(R.id.tutorLName);

            mImageView.setImageResource(((CodeDelta5)getApplicationContext()).images[position]); // change to global images
            mNameView.setText(((CodeDelta5)getApplicationContext()).firstNames[position]); // change to firstNames
            mDateView.setText(((CodeDelta5)getApplicationContext()).lastNames[position]); // change to lastNames


            return view;
        }
    }





}

