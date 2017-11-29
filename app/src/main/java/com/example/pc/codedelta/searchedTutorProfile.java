package com.example.pc.codedelta;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.ViewGroup;

public class searchedTutorProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searched_tutor_profile);

        Intent i = getIntent();

        String imageLocation = i.getStringExtra("imageLocation");
        String firstName = i.getStringExtra("name");
        String lastName = i.getStringExtra("last");
        Toast.makeText(this, imageLocation,
                Toast.LENGTH_LONG).show();

        /*
        double location = 0;
        int exactLocation = 0;
       //location = Integer.parseInt(imageLocation);
        try {
            location = Double.parseDouble(imageLocation);
        } catch(NumberFormatException nfe){}

        try {
            exactLocation = Integer.parseInt(imageLocation);
        } catch(NumberFormatException nfe){} */

      //  Toast.makeText(this, location,
       //         Toast.LENGTH_LONG).show();
        TextView textFirst = findViewById(R.id.first);
        TextView textLast = (TextView) findViewById(R.id.last);


        View view = getLayoutInflater().inflate(R.layout.activity_searched_tutor_profile, null);
      //  ImageView view = (ImageView) getLayoutInflater().inflate(R.layout.activity_searched_tutor_profile, null);
        ImageView tutorImage =  view.findViewById(R.id.imageView4);
        //tutorImage.setImageResource(((CodeDelta5)getApplicationContext()).images[exactLocation]);

        textFirst.setText(firstName);
        textLast.setText(lastName);


        final TextView comLink = findViewById(R.id.textView14);

        comLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent app1 = new Intent(searchedTutorProfile.this,Communicate2Activity.class);
                searchedTutorProfile.this.startActivity(app1);
            }
        });

        final TextView apptLink = findViewById(R.id.textView12);

        apptLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent app1 = new Intent(searchedTutorProfile.this,Appointment_Request_Activity.class);
                searchedTutorProfile.this.startActivity(app1);
            }
        });


    }

}
