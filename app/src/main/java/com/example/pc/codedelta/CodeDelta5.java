package com.example.pc.codedelta;

import android.app.Application;

import java.util.ArrayList;

/**
 * Created by Jared on 11/14/2017.
 */

public class CodeDelta5 extends Application {
    public ArrayList<String> myGlobalArray = null;
    public String ccNumber;
    public String security_No;
    public String ccMonth;
    public String ccYear;


    public CodeDelta5() {
        myGlobalArray = new ArrayList<>();
        {
            myGlobalArray.add("Chris $28.15");
            myGlobalArray.add("Trevor $15.30");
            myGlobalArray.add("Shelly $105.50");
        }
        ccNumber = 	"4012888888881881";
        security_No = "302";
        ccMonth = "8";
        ccYear = "17";



    }
}