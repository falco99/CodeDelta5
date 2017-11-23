package com.example.pc.codedelta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

import static android.R.id.message;


public class PaymentActivity extends AppCompatActivity {
     Button bFinish;
    public static final String EXTRA_MESSAGE = "com.example.pc.codedelta.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
        bFinish = findViewById(R.id.bFinish);

        bFinish.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent finish = new Intent(PaymentActivity.this,ProfileActivity.class);
                PaymentActivity.this.startActivity(finish);
            }
        });
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, ((CodeDelta5)getApplicationContext()).myGlobalArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner =  findViewById(R.id.spinner);
        spinner.setAdapter(adapter);
    }

    @Override
    public void onResume(){
        super.onResume();
        ArrayAdapter<String> adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, ((CodeDelta5)getApplicationContext()).myGlobalArray);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        Spinner spinner =  findViewById(R.id.spinner);
        spinner.setAdapter(null);
        spinner.setAdapter(adapter);


    }



    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        if(((CodeDelta5)getApplicationContext()).myGlobalArray.isEmpty())
        {
            Toast.makeText(this, "No payments to process!",
                    Toast.LENGTH_LONG).show();
        }
        else {
            Intent intent = new Intent(this, PaymentMsgActivity.class);
            Spinner spinner1 = findViewById(R.id.spinner);
            String spinnerVal = spinner1.getSelectedItem().toString();
            String numberOnly = spinnerVal.replaceAll("[^0-9,.]", "");
            double value = Double.parseDouble(numberOnly);
            String total_val = String.valueOf(value);
            intent.putExtra(EXTRA_MESSAGE, total_val);
            startActivity(intent);
        }
    }
}
