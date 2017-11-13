package com.example.pc.codedelta;

import android.content.Intent;
import android.graphics.Color;
import android.os.CountDownTimer;
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
        final String invalid_pmnt = "Error: Invalid amount entered.";
        final String pay_prompt = "Enter dollar amount:";
        final String empty_holder = "";
        final String bad_card = "Error: Invalid payment information.";

        // Capture the layout's TextView and set the string as its text
        TextView textView = findViewById(R.id.textView);
        textView.setText(message);

        final EditText editText = findViewById(R.id.editText2);
        Button btn = findViewById(R.id.button2);
        Button btn2 = findViewById(R.id.button3);

        btn2.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        editText.setText(empty_holder);
                        new CountDownTimer(5000, 1000) {
                            TextView textView2 = findViewById(R.id.textView4);
                            @Override
                            public void onTick(long millisUntilFinished) {
                                textView2.setTextColor(Color.RED);
                                textView2.setText(bad_card);
                            }

                            @Override
                            public void onFinish() {
                                textView2.setTextColor(Color.BLACK);
                                textView2.setText(pay_prompt);
                            }

                        }.start();



                    }
                });


        btn.setOnClickListener(
                new View.OnClickListener() {
                    public void onClick(View view) {
                        boolean validPay = true;
                        try {
                            String fieldVal = editText.getText().toString();
                            String numberOnly = fieldVal.replaceAll("[^0-9,.]", "");
                            double fieldValDbl = Double.parseDouble(numberOnly);
                        }
                        catch(Exception e){
                            validPay = false;
                            editText.setText(empty_holder);
                            new CountDownTimer(5000, 1000) {
                                TextView textView2 = (TextView) findViewById(R.id.textView4);
                                @Override
                                public void onTick(long millisUntilFinished) {
                                    textView2.setTextColor(Color.RED);
                                    textView2.setText(invalid_pmnt);
                                }

                                @Override
                                public void onFinish() {
                                    textView2.setTextColor(Color.BLACK);
                                    textView2.setText(pay_prompt);
                                }

                            }.start();

                        }
                        if(validPay)
                        {
                            finish();
                        }
                    }
                });
    }


}
