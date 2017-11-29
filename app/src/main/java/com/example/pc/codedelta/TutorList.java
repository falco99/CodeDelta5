package com.example.pc.codedelta;

import android.graphics.Color;
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
   // int count = 0;
   // boolean viewEmpty = false;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutor_list); // this is the actual listview

    /*    Intent i = getIntent();

        String firstField = i.getStringExtra("firstField");
        Toast.makeText(this, firstField,
                Toast.LENGTH_LONG).show();

        String secondField = i.getStringExtra("secondField");
        Toast.makeText(this, secondField,
                Toast.LENGTH_LONG).show();

        String thirdField = i.getStringExtra("thirdField");
        Toast.makeText(this, thirdField,
                Toast.LENGTH_LONG).show(); */

         /* Need to check passed in fields with tutor values
         *  Any tutor that has all three fields met, should be displayed.
         *  */


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
                String firstCategory = (((CodeDelta5)getApplicationContext()).tutorCategories[position][0]);
                String secondCategory = (((CodeDelta5)getApplicationContext()).tutorCategories[position][1]);
                intent.putExtra("categoriesTaught1", firstCategory);
                intent.putExtra("categoriesTaught2", secondCategory);
                startActivity(intent);
            }
        });

    }

    class CustomAdapter extends BaseAdapter{

        int count = 0;

        @Override
        public int getCount() {
            return ((CodeDelta5)getApplicationContext()).images.length;
        } // I think this is setting the size of the listview, i want this to be dynamic

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

            // Simply connects to the views
            ImageView mImageView = view.findViewById(R.id.imageViewTutorList);
            TextView mNameView = view.findViewById(R.id.tutorFName);
            TextView mDateView = view.findViewById(R.id.tutorLName);

            Intent i = getIntent();
            String firstField = i.getStringExtra("firstField");
            String secondField = i.getStringExtra("secondField");
            String thirdField = i.getStringExtra("thirdField");
            String searchedName = i.getStringExtra("searchedName");
            String searchOrCategory = i.getStringExtra("searchOrCategory");

           // String temp = imageLocation.replaceAll("[^0-9]","");
            //   try{
           // int location = Integer.parseInt(temp);


            if(searchOrCategory.equals("0"))
            {
                if(((CodeDelta5)getApplicationContext()).firstNames[position].equals(searchedName))
                {
                    mImageView.setImageResource(((CodeDelta5)getApplicationContext()).images[position]);
                    mNameView.setText(((CodeDelta5)getApplicationContext()).firstNames[position]);
                    mDateView.setText(((CodeDelta5)getApplicationContext()).lastNames[position]);
                }
                else{
                    mImageView.setImageResource(android.R.color.transparent);
                    mNameView.setText("");
                    mDateView.setText("");
                }
            }
            else{
                if(((CodeDelta5)getApplicationContext()).tutorLocations[position].equals(firstField)
                        && (((CodeDelta5)getApplicationContext()).tutorLevels[position][0].equals(secondField)
                        || ((CodeDelta5)getApplicationContext()).tutorLevels[position][1].equals(secondField) )
                        && (((CodeDelta5)getApplicationContext()).tutorCategories[position][0].equals(thirdField)
                        || ((CodeDelta5)getApplicationContext()).tutorCategories[position][1].equals(thirdField) )){

                    mImageView.setImageResource(((CodeDelta5)getApplicationContext()).images[position]);
                    mNameView.setText(((CodeDelta5)getApplicationContext()).firstNames[position]);
                    mDateView.setText(((CodeDelta5)getApplicationContext()).lastNames[position]);
                    this.count++;
                }
                else{
                    mImageView.setImageResource(android.R.color.transparent);
                    mNameView.setText("");
                    mDateView.setText("");
                }
            }

            // testing firstField = tutorLocations tutorList bring up
            /*if(((CodeDelta5)getApplicationContext()).tutorLocations[position].equals(firstField)
                    && (((CodeDelta5)getApplicationContext()).tutorLevels[position][0].equals(secondField)
                    || ((CodeDelta5)getApplicationContext()).tutorLevels[position][1].equals(secondField) )
                    && (((CodeDelta5)getApplicationContext()).tutorCategories[position][0].equals(thirdField)
                    || ((CodeDelta5)getApplicationContext()).tutorCategories[position][1].equals(thirdField) )){

                mImageView.setImageResource(((CodeDelta5)getApplicationContext()).images[position]);
                mNameView.setText(((CodeDelta5)getApplicationContext()).firstNames[position]);
                mDateView.setText(((CodeDelta5)getApplicationContext()).lastNames[position]);
                this.count++;
            }
            else{
                mImageView.setImageResource(android.R.color.transparent);
                mNameView.setText("");
                mDateView.setText("");
            } */




            return view;
        }
    }





}

