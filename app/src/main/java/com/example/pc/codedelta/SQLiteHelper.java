package com.example.pc.codedelta;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by z on 11/17/17.
 */

public class SQLiteHelper extends SQLiteOpenHelper
{
    static String DATABASE_NAME ="tutorapp.db";
    public static final String TABLE_NAME = "people";
    public static final String TABLE_COL_ID="id";
    public static final String COLUMN_NAME ="name";

    public static final String COLUMN_PHONE ="PHONE";
    public static final String COLUMN_D0B = "DOB";
    public static final String COLUMN_USERNAME = "USERNAME";
    public static final String COLUMN_PASSWORD = "PASSWORD";

    private static final int DATABASE_VERSION = 1;

   public SQLiteHelper(Context context){
       super(context,DATABASE_NAME,null,DATABASE_VERSION);

   }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        String SQL_CREATE_TABLE ="CREATE TABLE " +
                TABLE_NAME + "(" + TABLE_COL_ID +" INTEGER PRIMARY KEY AUTOINCREMENT, " +
                COLUMN_NAME + "VARCHAR," +

                COLUMN_D0B + "VARCHAR," +
                COLUMN_PHONE +"VARCHAR," +
                COLUMN_USERNAME +"VARCHAR,"+
                COLUMN_PASSWORD + "VARCHAR" +");";

     sqLiteDatabase.execSQL(SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
