package com.example.pc.codedelta;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {

    private MySqliteOpenHelper mySqliteOpenHelper;
    private SQLiteDatabase mDatabase;
    Table data;

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

        data(etFname, etLname, etPhone, etDob, etUsername, etPassword);
        final TextView tvCancel = findViewById(R.id.tvCancel);


        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mySqliteOpenHelper = new MySqliteOpenHelper(getApplicationContext());
                mDatabase = mySqliteOpenHelper.getWritableDatabase();

                ContentValues values = new ContentValues();
                values.put("Fname", data.getFname());
                values.put("Lname", data.getLname());
                values.put("Phone", data.getPhone());
                values.put("Dob",data.getDob());
                values.put("Username",data.getUsername());
                values.put("Password",data.getPassword());


                mDatabase.insert("table_Name", null, values);


                Intent Reg = new Intent(RegisterActivity.this, LoginActivity.class);
                RegisterActivity.this.startActivity(Reg);

            }
        });
        tvCancel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cancel = new Intent(RegisterActivity.this, LoginActivity.class);
                RegisterActivity.this.startActivity(cancel);
            }
        });
    }

    private void data(EditText etFname, EditText etLname, EditText etPhone, EditText etDob, EditText etUsername, EditText etPassword) {

        String Fname = etFname.getText().toString();
        String Lname = etLname.getText().toString();
        String Dob=etDob.getText().toString() ;
        String Phone =etPhone.getText().toString() ;
        String username =etUsername.getText().toString() ;
        String password = etPassword.getText().toString();



}

  }




