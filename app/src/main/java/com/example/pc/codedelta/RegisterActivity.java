package com.example.pc.codedelta;

import android.content.ContentValues;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {


    private SQLiteDatabase mDb;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        final SQLiteHelper dbHelper = new SQLiteHelper(this);

        final EditText etNname = findViewById(R.id.etFname);

        final EditText etPhone = findViewById(R.id.etPhone);
        final EditText etUsername = findViewById(R.id.etUsername);
        final EditText etPassword = findViewById(R.id.etPassword);
        final EditText etDob = findViewById(R.id.etDob);
        final Button bRegister = findViewById(R.id.bRegister);

        final TextView tvCancel = findViewById(R.id.tvCancel);

 // when the register button is clicked
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (etNname.getText().length() == 0 || etDob.getText().length() ==0
                        ||etPhone.getText().length() == 0 || etUsername.getText().length() ==0
                        ||etPassword.getText().length() == 0)
                {
                   // Toast.makeText(this, "You did not enter a username", Toast.LENGTH_SHORT).show();
                    return;

                }

                mDb = dbHelper.getWritableDatabase();



                addNewUser(etNname.getText().toString(),etDob.getText().toString(),etPhone.getText().toString(),
                        etUsername.getText().toString(), etPassword.getText().toString());


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
        String Dob   = etDob.getText().toString() ;
        String Phone = etPhone.getText().toString() ;
        String username =etUsername.getText().toString() ;
        String password = etPassword.getText().toString();



}
    private long addNewUser (String name, String Dob, String phone, String username, String password)
    {
        ContentValues cv = new ContentValues();
        cv.put(RegisterContract.RegisterEntry.COLUMN_NAME,name);
        cv.put(RegisterContract.RegisterEntry.COLUMN_D0B,Dob);
        cv.put(RegisterContract.RegisterEntry.COLUMN_PHONE,phone);
        cv.put(RegisterContract.RegisterEntry.COLUMN_USERNAME,username);
        cv.put(RegisterContract.RegisterEntry.COLUMN_PASSWORD, password);
        return mDb.insert(RegisterContract.RegisterEntry.TABLE_NAME,null,cv);





    }

  }




