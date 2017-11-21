package com.example.pc.codedelta;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

/**
 * Created by z on 11/17/17.
 */

public class SQLiteHelper extends SQLiteOpenHelper
{
    private static final String DATABASE_NAME ="tutorapp.db";

    private static final int DATABASE_VERSION = 1;

   public SQLiteHelper(Context context){
       super(context,DATABASE_NAME,null,DATABASE_VERSION);

   }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase)
    {
        final String SQL_CREATE_TABLE ="CREATE TABLE " +
                RegisterContract.RegisterEntry.TABLE_NAME + "(" +
                RegisterContract.RegisterEntry._ID +"INTEGER PRIMARY KEY AUTOINCREMENT, " +
                RegisterContract.RegisterEntry.COLUMN_NAME + "TEXT NOT NULL," +

                RegisterContract.RegisterEntry.COLUMN_D0B + "TEXT NOT NULL," +
                RegisterContract.RegisterEntry.COLUMN_PHONE +"TEXT NOT NULL," +
                RegisterContract.RegisterEntry.COLUMN_USERNAME +"TEXT NOT NULL,"+
                RegisterContract.RegisterEntry.COLUMN_PASSWORD + "TEXT NOT NULL" +");";

     sqLiteDatabase.execSQL(SQL_CREATE_TABLE);
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int oldVersion, int newVersion) {
        sqLiteDatabase.execSQL("DROP TABLE IF EXISTS " + RegisterContract.RegisterEntry.TABLE_NAME);
        onCreate(sqLiteDatabase);
    }
}
