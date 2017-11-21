package com.example.pc.codedelta;

import android.provider.BaseColumns;

/**
 * Created by z on 11/20/17.
 */

public class RegisterContract
{
    private RegisterContract(){}
    public static class RegisterEntry implements BaseColumns {
    public static final String TABLE_NAME = "people";
    public static final String COLUMN_NAME ="name";

    public static final String COLUMN_PHONE ="PHONE";
    public static final String COLUMN_D0B = "DOB";
    public static final String COLUMN_USERNAME = "USERNAME";
    public static final String COLUMN_PASSWORD = "PASSWORD";
    }
}
