package com.example.pc.codedelta;

import android.content.Intent;
import android.provider.Telephony;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SentActivity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sent);

        bt1 = (Button) findViewById(R.id.button7);
        bt2 = (Button) findViewById(R.id.button8);

        bt1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent register = new Intent(SentActivity.this, AppointmentsTestActivity.class);
                SentActivity.this.startActivity(register);
            }
        });

        bt2.setOnClickListener(new View.OnClickListener(){



            public void onClick (View v) {
                Intent register = new Intent(SentActivity.this, ProfileActivity.class);
                SentActivity.this.startActivity(register);
            }

        });
    }
}
