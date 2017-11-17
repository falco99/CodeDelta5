package com.example.pc.codedelta;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextSwitcher;
import android.widget.TextView;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    final EditText etUsername = findViewById(R.id.etUsername);
    final EditText etPassword = findViewById(R.id.etPassword);
    final Button bLogin = findViewById(R.id.bLogin);
    final TextView tvRegisterLink = findViewById(R.id.tvRegisterLink);
    final TextView tvForgot = findViewById(R.id.tvForgot);
    final TextView tvGuest = findViewById(R.id.tvGuest);

    tvRegisterLink.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent register = new Intent(LoginActivity.this,RegisterActivity.class);
            LoginActivity.this.startActivity(register);

        }
    });
bLogin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent profile = new Intent(LoginActivity.this,ProfileActivity.class);
        LoginActivity.this.startActivity(profile);
    }
});
tvForgot.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Intent forgotten = new Intent(LoginActivity.this,PasswordResetActivity.class);
        LoginActivity.this.startActivity(forgotten);
    }
});
   tvGuest.setOnClickListener(new View.OnClickListener() {
       @Override
       public void onClick(View v) {
           Intent guest = new Intent(LoginActivity.this,TutoringCategories.class);
           LoginActivity.this.startActivity(guest);
       }
   });

    }
    }

