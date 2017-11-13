package com.example.pc.codedelta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class TutoringCategories extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tutoring_categories);

        btn = (Button) findViewById(R.id.findtutor);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {

                Intent intent = new Intent(TutoringCategories.this,TutorList.class);
                startActivity(intent);
            }
        });

        // Spinner values 1,2,3
        Spinner mySpinner1 = (Spinner) findViewById(R.id.spinner1);
        Spinner mySpinner2 = (Spinner) findViewById(R.id.spinner2);
        Spinner mySpinner3 = (Spinner) findViewById(R.id.spinner3);

        // Code for Spinner 1
        ArrayAdapter<String> myAdapter1 = new ArrayAdapter<String>(TutoringCategories.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.location));

        myAdapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner1.setAdapter(myAdapter1);

        // Code for Spinner 2
        ArrayAdapter<String> myAdapter2 = new ArrayAdapter<String>(TutoringCategories.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.level));

        myAdapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner2.setAdapter(myAdapter2);

        // Code for Spinner 3
        ArrayAdapter<String> myAdapter3 = new ArrayAdapter<String>(TutoringCategories.this,
                android.R.layout.simple_list_item_1, getResources().getStringArray(R.array.category));

        myAdapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        mySpinner3.setAdapter(myAdapter3);

    }
}
