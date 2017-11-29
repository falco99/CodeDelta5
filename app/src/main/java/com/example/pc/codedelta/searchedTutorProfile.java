package com.example.pc.codedelta;

import android.content.Intent;
import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import android.view.View;
import android.view.ViewGroup;

import org.w3c.dom.Text;

public class searchedTutorProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searched_tutor_profile);

        Intent i = getIntent();

        String imageLocation = i.getStringExtra("imageLocation");
        String firstName = i.getStringExtra("name");
        String lastName = i.getStringExtra("last");
        String firstCategory = i.getStringExtra("categoriesTaught1");
        String secondCategory = i.getStringExtra("categoriesTaught2");
      //  Toast.makeText(this, imageLocation,
       //         Toast.LENGTH_LONG).show();


        String temp = imageLocation.replaceAll("[^0-9]","");
     //   try{
            int location = Integer.parseInt(temp);
       // }catch(Exception e){
     //   }
       // int location = Integer.parseInt(temp);

        Toast.makeText(this, temp,
                Toast.LENGTH_LONG).show();


        TextView textFirst = findViewById(R.id.first);
        TextView textLast = (TextView) findViewById(R.id.last);
        TextView category1 = (TextView) findViewById(R.id.textView22);
        TextView category2 = (TextView) findViewById(R.id.textView23);


       // View view = getLayoutInflater().inflate(R.layout.activity_searched_tutor_profile, null);
        ImageView tutorImage =  (ImageView) findViewById(R.id.imageView4);
        tutorImage.setImageResource(((CodeDelta5)getApplicationContext()).images[location]);

        textFirst.setText(firstName);
        textLast.setText(lastName);
        category1.setText(firstCategory);
        category2.setText(secondCategory);

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
