package com.example.pc.codedelta;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by Jared on 11/14/2017.
 */

public class CodeDelta5 extends Application {
    public ArrayList<String> myGlobalArray = null;

    public CodeDelta5() {
        myGlobalArray = new ArrayList<>();
        {
            myGlobalArray.add("Bobby Gerbil $28.15");
            myGlobalArray.add("Steven Spielberg $15.30");
            myGlobalArray.add("John Johnson $105.50");
        }
    }
}