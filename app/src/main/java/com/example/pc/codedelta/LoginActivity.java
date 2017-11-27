package com.example.pc.codedelta;

import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity
{
    EditText etUsername,etPassword;
    TextView tvRegisterLink, tvForgot, tvGuest;
    String username,password = "bbb", tempPassword="aaaaaaaaaa";
    Button bLogin;
    SQLiteDatabase sqLiteDatabaseObj;
    Boolean Field;
    Cursor cursor;
    SQLiteHelper sqLiteHelper;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

     etUsername = (EditText)findViewById(R.id.etUsername);
    etPassword = (EditText)findViewById(R.id.etPassword);
    bLogin = (Button)findViewById(R.id.bLogin);
    tvRegisterLink = (TextView)findViewById(R.id.tvRegisterLink);
    tvForgot = (TextView)findViewById(R.id.tvForgot);
    tvGuest = (TextView)findViewById(R.id.tvGuest);

    sqLiteHelper = new SQLiteHelper(this);

    //register button leads to the register page
    tvRegisterLink.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            Intent register = new Intent(LoginActivity.this,RegisterActivity.class);
            LoginActivity.this.startActivity(register);

        }
    });

    // Login button if pressed
    bLogin.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        //First check whether the fields are empty
        checkField();
        //Once the field is determined not empty

        LoginFunction();

CheckFinal();


        /*Intent profile = new Intent(LoginActivity.this,ProfileActivity.class);
        LoginActivity.this.startActivity(profile);*/
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

    public void checkField()
    {
         username = etUsername.getText().toString();
         password = etPassword.getText().toString();

        if(TextUtils.isEmpty(username) || TextUtils.isEmpty(password))
        {
            Field = false;
        }
        else {
            Field = true;
        }
    }

    public void LoginFunction()
    {
      if(Field)
      {
        sqLiteDatabaseObj = sqLiteHelper.getWritableDatabase();
        cursor = sqLiteDatabaseObj.query(sqLiteHelper.TABLE_NAME,null," "+
                sqLiteHelper.COLUMN_USERNAME +"=?", new String[]{username},null,null,null);

        while(cursor.moveToNext()){
            if(cursor.isFirst()){
                cursor.moveToFirst();
                tempPassword = cursor.getString(cursor.getColumnIndex(SQLiteHelper.COLUMN_PASSWORD));

                cursor.close();
            }
        }
        CheckFinal();

      }else {
          Toast.makeText(LoginActivity.this,"Please Enter UserName or Password.",Toast.LENGTH_LONG).show();
      }
    }


public void CheckFinal(){
    if(tempPassword.equalsIgnoreCase(password))
    {

        Toast.makeText(LoginActivity.this,"Login Successfully",Toast.LENGTH_LONG).show();


        Intent intent = new Intent(LoginActivity.this, ProfileActivity.class);


        startActivity(intent);


    }
    else {


        Toast.makeText(LoginActivity.this,"UserName or Password is Wrong, Please Try Again.",Toast.LENGTH_LONG).show();

    }
    tempPassword = "NOT_FOUND" ;
}


}

