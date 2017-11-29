package com.example.pc.codedelta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Communicate2Activity extends AppCompatActivity {
    Button bt1,bt2,bt3,bt4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_communicate2);

        bt1 = (Button) findViewById(R.id.button5);

        bt1.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                Intent register = new Intent(Communicate2Activity.this, SentActivity.class);
                Communicate2Activity.this.startActivity(register);
            }
        });
    }
}
