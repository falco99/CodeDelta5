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

public class TutorList extends AppCompatActivity {
    private static final String TAG = "Tutorlist";

    int[] images = {R.drawable.chrisprofile,R.drawable.trevorcartoonprofile,R.drawable.shelly,R.drawable.chrisprofile};
    String[] names = {"Chris","Trevor","Shelly","Chris"};
    String[] dates = {"Sparks","Tuesday 12:00pm Arlington","Wednesday 12:00pm Arlington","Thursday 12:00pm Arlington"};// last name
    ListView list;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_list);
        Log.d(TAG, "onCreate: Started.");
        list = findViewById(R.id.listview);

        CustomAdapter customAdapter = new CustomAdapter();

        list.setAdapter(customAdapter);

        // testing on click listener
        list.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
                Intent intent = new Intent(TutorList.this, searchedTutorProfile.class);
               // TextView temp = list.findViewById(R.id.tutorFName);
               // String tempFName = (String)temp.getText();
                intent.putExtra("name", names[position]);
                intent.putExtra("last", dates[position]);
                startActivity(intent);
            }
        });

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

            View view = getLayoutInflater().inflate(R.layout.tutorlist_listview_layout, null);

            ImageView mImageView = view.findViewById(R.id.imageViewTutorList);//.imageView2);
            TextView mNameView = view.findViewById(R.id.tutorFName);
            TextView mDateView = view.findViewById(R.id.tutorLName);

            mImageView.setImageResource(images[position]);
            mNameView.setText(names[position]);
            mDateView.setText(dates[position]);
            return view;
        }
    }





}

