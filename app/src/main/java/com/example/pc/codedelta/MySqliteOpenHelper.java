package com.example.pc.codedelta;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by z on 11/17/17.
 */

public class MySqliteOpenHelper extends SQLiteOpenHelper
{
    private static final String database_name ="tutorapp.db";
    private String table_name = "people";
    private static final int database_version = 1;

    private String column_id = "id",column_Fname ="Fname",column_Lname ="LName",column_Dob = "Dob",
    column_phone ="Phone",column_username ="username",column_password = "password";

   private String database_create_statement =
           "create table"+ table_name+"("+column_id +" integer primary key autoincrement"+column_Fname+"text not null" +column_Lname+"text not null"+
           column_Dob+"text not null"+column_phone+"text not null"+column_username+"text not null" +column_password+ "text not null";


   public MySqliteOpenHelper(Context context){
       super(context,database_name,null,database_version);

   }


    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
     sqLiteDatabase.execSQL(database_create_statement);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {

    }
}
