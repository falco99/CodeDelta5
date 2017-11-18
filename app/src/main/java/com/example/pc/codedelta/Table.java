package com.example.pc.codedelta;

import android.widget.EditText;

/**
 * Created by z on 11/18/17.
 */

public class Table {
    private String Fname,Lname,Dob,Phone,username,password;




public Table(EditText etFname, EditText etLname, EditText etPhone, EditText etDob, EditText etUsername, EditText etPassword){
    this.Fname = etFname.getText().toString();
    this.Lname = etLname.getText().toString();
    this.Dob=etDob.getText().toString() ;
    this.Phone =etPhone.getText().toString() ;
    this.username =etUsername.getText().toString() ;
    this.password = etPassword.getText().toString();
}

    public String getFname() {
        return Fname;
    }

    public void setFname(String fname) {
        Fname = fname;
    }

    public String getLname() {
        return Lname;
    }

    public void setLname(String lname) {
        Lname = lname;
    }

    public String getDob() {
        return Dob;
    }

    public void setDob(String dob) {
        Dob = dob;
    }

    public void setPhone(String phone) {
        Phone = phone;
    }

    public String getPhone() {
        return Phone;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }
}


