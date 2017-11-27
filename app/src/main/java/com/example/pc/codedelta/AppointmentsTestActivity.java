package com.example.pc.codedelta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AppointmentsTestActivity extends AppCompatActivity {
    Button bt1,bt2,bt3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_appointments_test);

        bt1 = (Button) findViewById(R.id.current_app);
        bt2 = (Button) findViewById(R.id.clndr);
        bt3 = (Button) findViewById(R.id.Add_app);

//erer22
                bt1.setOnClickListener(new View.OnClickListener() {

                    public void onClick(View v) {
                        Intent register = new Intent(AppointmentsTestActivity.this, TestAppointmentListActivity.class);
                        AppointmentsTestActivity.this.startActivity(register);
                    }
                    });

                        bt2.setOnClickListener(new View.OnClickListener(){



                        public void onClick (View v) {
                            Intent register = new Intent(AppointmentsTestActivity.this, TestCalendarActivity.class);
                            AppointmentsTestActivity.this.startActivity(register);
                        }

                    });
        bt3.setOnClickListener(new View.OnClickListener(){



            public void onClick (View v) {
                Intent register = new Intent(AppointmentsTestActivity.this, TutoringCategories.class);
                AppointmentsTestActivity.this.startActivity(register);
            }

        });






}}