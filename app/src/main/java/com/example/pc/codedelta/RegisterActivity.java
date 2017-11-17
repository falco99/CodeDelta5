package com.example.pc.codedelta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        final EditText etFname = findViewById(R.id.etFname);
        final EditText etLname = findViewById(R.id.etLname);
        final EditText etPhone = findViewById(R.id.etPhone);
        final EditText etUsername = findViewById(R.id.etUsername);
        final EditText etPassword = findViewById(R.id.etPassword);
        final EditText etDob = findViewById(R.id.etDob);
        final Button bRegister = findViewById(R.id.bRegister);

        final TextView tvCancel = findViewById(R.id.tvCancel);
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Reg = new Intent(RegisterActivity.this,LoginActivity.class);
                RegisterActivity.this.startActivity(Reg);

            }
        });
        tvCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancel = new Intent(RegisterActivity.this,LoginActivity.class);
                RegisterActivity.this.startActivity(cancel);
            }
        });
    }
}
