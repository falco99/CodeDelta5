package com.example.pc.codedelta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class searchedTutorProfile extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searched_tutor_profile);

        Intent i = getIntent();

        String firstName = i.getStringExtra("name");
        String lastName = i.getStringExtra("last");

        TextView textFirst = findViewById(R.id.first);
        TextView textLast = (TextView) findViewById(R.id.last);

        textFirst.setText(firstName);
        textLast.setText(lastName);

     /*   TextView myAwesomeTextView = (TextView)findViewById(R.id.myAwesomeTextView)
//in your OnCreate() method
        myAwesomeTextView.setText("My Awesome Text")  */


        Toast.makeText(this, firstName,
                Toast.LENGTH_LONG).show();

        Toast.makeText(this, lastName,
                Toast.LENGTH_LONG).show();

    }

}
