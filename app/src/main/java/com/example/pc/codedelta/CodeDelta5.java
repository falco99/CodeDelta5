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

    // used in tutoring categories
    public String[] locations = {"Arlington TX", "Dallas TX", "Tyler TX", "Test Location"};
    public String[] level = {"Elementary","Middle School","High School","University", "Test Level"};
    public String[] category = {"Math","Science","Language","Art","History","Writing", "Test Category"};

    public String[] tutorLocations = {"Arlington TX", "Arlington TX", "Dallas Tx", "Dallas TX" };
    public String[][] tutorLevels = {{"Elementary", "Middle School", "High School"}, {"University"}, {"Middle School", "High School", "University"},
                                      {"High School", "University"}};
    public String[][] tutorCategories = {{"Math", "Science"}, {"Math", "Science", "History"},
                                         {"History", "Writing"}, {"Writing", "Language"}};

    // used in TutorList
    public int[] images = {R.drawable.chrisprofile,R.drawable.trevorcartoonprofile,R.drawable.shelly,R.drawable.chrisprofile};
    public String[] firstNames = {"Chris","Trevor","Shelly","Tyler"};
    public String[] lastNames = {"Sparks","Willson","Pots","Turner"};// last name

    public CodeDelta5() {
        myGlobalArray = new ArrayList<>();
        {
            myGlobalArray.add("Bobby Gerbil $28.15");
            myGlobalArray.add("Steven Spielberg $15.30");
            myGlobalArray.add("John Johnson $105.50");
        }
        ccNumber = 	"4012888888881881";
        security_No = "302";
        ccMonth = "8";
        ccYear = "17";



    }
}