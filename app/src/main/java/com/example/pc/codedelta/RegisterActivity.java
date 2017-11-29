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
import android.widget.Toast;
import android.content.Context;
import android.database.Cursor;

public class RegisterActivity extends AppCompatActivity {

    EditText etName, etPhone,etUsername,etPassword,etDob;
    SQLiteDatabase sqLiteDatabaseObj;
    String username,password,name,dob,phone,Result = "Found";
    Button bRegister;
    Boolean Field;
    SQLiteHelper sqLiteHelper;
    Cursor cursor;
    String SQLiteDataBaseQueryHolder;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        sqLiteHelper = new SQLiteHelper(this);

        etName = findViewById(R.id.etName);

        etPhone = findViewById(R.id.etPhone);
        etUsername = findViewById(R.id.etUsername);
        etPassword = findViewById(R.id.etPassword);
        etDob = findViewById(R.id.etDob);
        bRegister = findViewById(R.id.bRegister);

        final TextView tvCancel = findViewById(R.id.tvCancel);

 // when the register button is clicked
        bRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                SQLiteDatabaseBuild();

                SQLiteTableBuild();

                CheckField();

               Checkingusername();
                //EmptyField();

                /*addNewUser(etName.getText().toString(),etDob.getText().toString(),etPhone.getText().toString(),
                        etUsername.getText().toString(), etPassword.getText().toString());
                    */



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


    public void SQLiteDatabaseBuild(){

        sqLiteDatabaseObj = openOrCreateDatabase(sqLiteHelper.DATABASE_NAME, Context.MODE_PRIVATE, null);

    }
    public void SQLiteTableBuild(){
        sqLiteDatabaseObj.execSQL("CREATE TABLE IF NOT EXISTS " + sqLiteHelper.TABLE_NAME
                + "(" + sqLiteHelper.TABLE_COL_ID +
                " INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, " + sqLiteHelper.COLUMN_NAME + " VARCHAR, " +
                sqLiteHelper.COLUMN_PHONE + " VARCHAR, " + sqLiteHelper.COLUMN_D0B + " VARCHAR," +
                sqLiteHelper.COLUMN_USERNAME + " VARCHAR," + sqLiteHelper.COLUMN_PASSWORD + " VARCHAR);");
    }
    public void CheckField(){

        if (etName.getText().length() == 0 || etDob.getText().length() ==0
                ||etPhone.getText().length() == 0 || etUsername.getText().length() ==0
                ||etPassword.getText().length() == 0)
        {
            Field = false;
        }else{
            Field = true;
        }
    }
    public void Checkingusername(){

        username = etUsername.getText().toString();
        password = etPassword.getText().toString();
        dob = etDob.getText().toString();
        phone = etPhone.getText().toString();
        sqLiteDatabaseObj = sqLiteHelper.getWritableDatabase();
        cursor = sqLiteDatabaseObj.query(sqLiteHelper.TABLE_NAME,null," "+
                sqLiteHelper.COLUMN_USERNAME +"=?", new String[]{username},null,null,null);

        while(cursor.moveToNext()){
            if(cursor.isFirst()){
                cursor.moveToFirst();
                Result = "Found";

                //cursor.close();
            }

        }
        cursor.close();

        CheckFinal();
    }

    public void CheckFinal()
    {
       /* if(Result.equalsIgnoreCase("Found"))
        {

            // If username already exists then toast msg will display.
            Toast.makeText(RegisterActivity.this,"username Already Exists",Toast.LENGTH_LONG).show();

        }
        else {*/

            // If username doesn't exist then user registration details will entered to SQLite database.
            InsertDataInDatabase();

       // }

        Result = "Not_Found" ;

    }
    public void InsertDataInDatabase(){
        if (Field )
        {
            SQLiteDataBaseQueryHolder = "INSERT INTO "+ sqLiteHelper.TABLE_NAME+" " +
                    "(Name,Phone,Dob,username,password) VALUES('"+name+"', '"+phone+"','"+dob+"','"+username+"', '"+password+"');";


            sqLiteDatabaseObj.execSQL(SQLiteDataBaseQueryHolder);


            sqLiteDatabaseObj.close();
            EmptyField();
            // Printing toast message after done inserting.
            Toast.makeText(RegisterActivity.this,"User Registered Successfully", Toast.LENGTH_LONG).show();
        } else{
            Toast.makeText(RegisterActivity.this,"All the fields are required", Toast.LENGTH_LONG).show();
        }
    }
    public void EmptyField(){

        etName.getText().clear();

        etDob.getText().clear();

        etPhone.getText().clear();
        etUsername.getText().clear();
        etPassword.getText().clear();
        //Going back to Login Page
        Intent Reg = new Intent(RegisterActivity.this, LoginActivity.class);
        RegisterActivity.this.startActivity(Reg);

    }





  }




