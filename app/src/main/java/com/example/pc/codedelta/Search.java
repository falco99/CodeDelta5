package com.example.pc.codedelta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

public class Search extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search);

        AutoCompleteTextView source = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
        String Source = source.getText().toString();

        btn = findViewById(R.id.button11);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AutoCompleteTextView source = (AutoCompleteTextView) findViewById(R.id.autoCompleteTextView);
                String Source = source.getText().toString();

                Intent intent = new Intent(Search.this, TutorList.class);
                intent.putExtra("searchedName",Source);
                intent.putExtra("searchOrCategory", "0");
                startActivity(intent); // button11
            }
        });

    }
}
