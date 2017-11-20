package com.example.pc.codedelta;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class payment_cc_entry extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_cc_entry);
    }
    public void returnToMsg(View view)
    {
        Intent intent = new Intent();
        setResult(Activity.RESULT_CANCELED, intent);
        finish();
    }

    /** Called when the user taps the Send button */
    public void verifyPayment(View view) {
        EditText et1 = findViewById(R.id.editText);
        EditText et4 = findViewById(R.id.editText4);
        EditText et6 = findViewById(R.id.editText6);
        EditText et7 = findViewById(R.id.editText7);

        String ccno = et1.getText().toString();
        String ccmo = et4.getText().toString();
        String ccyear = et6.getText().toString();
        String ccSec = et7.getText().toString();

        int ccnoTest = ccno.compareTo(((CodeDelta5)getApplicationContext()).ccNumber);
        int ccmoTest = ccmo.compareTo(((CodeDelta5)getApplicationContext()).ccMonth);
        int ccyearTest = ccyear.compareTo(((CodeDelta5)getApplicationContext()).ccYear);
        int ccsecTest = ccSec.compareTo(((CodeDelta5)getApplicationContext()).security_No);

        if(ccnoTest == 0)
        {
            if(ccmoTest == 0 || ccmo.compareTo("08") == 0)
            {
                if(ccyearTest == 0)
                {
                    if(ccsecTest == 0)
                    {
                        Intent intent = new Intent();
                        intent.putExtra("res", true);
                        setResult(Activity.RESULT_OK, intent);
                        finish();
                    }
                }
            }
        }
        else
        {
            et1.setText("");
            et4.setText("");
            et6.setText("");
            et7.setText("");
            Toast.makeText(this, "Invalid credit card data entered!",
                    Toast.LENGTH_LONG).show();
        }
    }
}
