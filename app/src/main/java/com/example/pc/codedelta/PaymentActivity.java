package com.example.pc.codedelta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import static android.R.id.message;

public class PaymentActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.example.pc.codedelta.MESSAGE";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment);
    }



    /** Called when the user taps the Send button */
    public void sendMessage(View view) {
        // Do something in response to button
        Intent intent = new Intent(this, PaymentMsgActivity.class);
        Spinner spinner1 = (Spinner) findViewById(R.id.spinner);
        String spinnerVal = spinner1.getSelectedItem().toString();
        String numberOnly= spinnerVal.replaceAll("[^0-9,.]", "");
        double value = Double.parseDouble(numberOnly);
        String total_val = String.valueOf(value);
        intent.putExtra(EXTRA_MESSAGE, total_val);
        startActivity(intent);
    }
}
