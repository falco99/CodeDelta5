package com.example.pc.codedelta;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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
    }
}
