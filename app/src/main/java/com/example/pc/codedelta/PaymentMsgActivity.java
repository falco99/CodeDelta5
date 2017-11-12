package com.example.pc.codedelta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.NumberFormat;

public class PaymentMsgActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_payment_msg);
        // Get the Intent that started this activity and extract the string
        Intent intent = getIntent();

        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        String total_cost_str = String.valueOf(intent.getStringExtra(PaymentActivity.EXTRA_MESSAGE));
        final double cost = Double.parseDouble(total_cost_str);
        String message = "Amount due: " + formatter.format(cost);

        // Capture the layout's TextView and set the string as its text
        TextView textView = (TextView) findViewById(R.id.textView);
        textView.setText(message);

        final EditText editText = (EditText) findViewById(R.id.editText2);
        Button btn = (Button) findViewById(R.id.button2);
        btn.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        String fieldVal = editText.getText().toString();
                        String numberOnly = fieldVal.replaceAll("[^0-9,.]", "");
                        double fieldValDbl = Double.parseDouble(numberOnly);
                        if (fieldValDbl == cost) {
                            editText.setText("suhhhh");
                        } else {
                            editText.setText("");
                        }
                    }
                });
    }


}
