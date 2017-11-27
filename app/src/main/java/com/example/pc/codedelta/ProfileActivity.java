package com.example.pc.codedelta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ProfileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        final Button bLogout = findViewById(R.id.bLogout);
        final TextView tvRequest =findViewById(R.id.tvRequest);
        final TextView tvPayment = findViewById(R.id.tvPayment);

        tvRequest.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent app1 = new Intent(ProfileActivity.this,AppointmentsTestActivity.class);
                ProfileActivity.this.startActivity(app1);
            }
        });

        bLogout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logout = new Intent(ProfileActivity.this,LoginActivity.class);
                ProfileActivity.this.startActivity(logout);
            }
        });

        tvPayment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent logout = new Intent(ProfileActivity.this,PaymentActivity.class);
                ProfileActivity.this.startActivity(logout);
            }
        });





    }





}
