package com.example.pc.codedelta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Request_good_2Activity extends AppCompatActivity {
    Button bt1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_request_good_2);

        bt1 = (Button) findViewById(R.id.button11);

        bt1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent register = new Intent(Request_good_2Activity.this, AppointmentsTestActivity.class);
                Request_good_2Activity.this.startActivity(register);
            }
        });
    }
}
