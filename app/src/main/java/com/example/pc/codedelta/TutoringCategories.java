package com.example.pc.codedelta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

public class TutoringCategories extends AppCompatActivity {

    Button btn;
    String text1, text2, text3;

    //Intent intent = new Intent(TutoringCategories.this, TutorList.class);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutoring_categories);

        // Spinner values 1,2,3
        final Spinner mySpinner1 = findViewById(R.id.spinner1);
        final Spinner mySpinner2 = findViewById(R.id.spinner2);
        final Spinner mySpinner3 = findViewById(R.id.spinner3);

        // Spinner mySpinner=(Spinner) findViewById(R.id.your_spinner);
        // String text = mySpinner.getSelectedItem().toString();

        // Code for Spinner 1
        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(TutoringCategories.this,
                android.R.layout.simple_list_item_1, ((CodeDelta5) getApplicationContext()).locations);

        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner1.setAdapter(myAdapter1);

        mySpinner1.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String spinner1Text = mySpinner1.getSelectedItem().toString();
                text1 = spinner1Text;
                Toast.makeText(getApplicationContext(), text1,
                        Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        // Code for Spinner 2
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(TutoringCategories.this,
                android.R.layout.simple_list_item_1, ((CodeDelta5) getApplicationContext()).level);

        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner2.setAdapter(myAdapter2);

        mySpinner2.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String spinner2Text = mySpinner2.getSelectedItem().toString();
                text2 = spinner2Text;
                Toast.makeText(getApplicationContext(), text2,
                        Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        // Code for Spinner 3
        ArrayAdapter<String> myAdapter3 = new ArrayAdapter<String>(TutoringCategories.this,
                android.R.layout.simple_list_item_1, ((CodeDelta5) getApplicationContext()).category);

        myAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner3.setAdapter(myAdapter3);

        mySpinner3.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String spinner3Text = mySpinner3.getSelectedItem().toString();
                text3 = spinner3Text;
                Toast.makeText(getApplicationContext(), text3,
                        Toast.LENGTH_LONG).show();
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {
            }
        });

        btn = findViewById(R.id.findtutor);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(TutoringCategories.this, TutorList.class);
                intent.putExtra("firstField", text1);
                intent.putExtra("secondField", text2);
                intent.putExtra("thirdField", text3);
                startActivity(intent);
            }
        });

        final TextView searchLink = findViewById(R.id.textView21);

        searchLink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent app1 = new Intent(TutoringCategories.this,Search.class);
                TutoringCategories.this.startActivity(app1);
            }
        });

        /* What needs to be done:
        * Need to take the spinner data, convert it to a string,
        * then pass the string data into TutorList.java.
        *
        * In TutorList.java, take the passed data, and check to see if
        * the values are found in the global arrays tutorLocations, tutorLevels, and tutorCategories.
        *
        * If the the spinner values from locations, levels, and categories equal
        * any of the values in all of these arrays then display the tutors with these fields. */

    }


}

