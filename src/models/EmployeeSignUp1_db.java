/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author USER
 */
public class EmployeeSignUp1_db {
    
    String fname, lname, dob, tel, add1, add2, city, gender, state, pin;
    
    public String getFname() {
        return fname;
    }
    
    public String getState() {
        return state;
    }
    
    public String getPin() {
        return pin;
    }

    public String getLname() {
        return lname;
    }

    public String getDob() {
        return dob;
    }

    public String getTel() {
        return tel;
    }

    public String getAdd1() {
        return add1;
    }

    public String getAdd2() {
        return add2;
    }

    public String getCity() {
        return city;
    }

    public String getGender() {
        return gender;
    }

    public EmployeeSignUp1_db(String fname, String lname, String dob, String tel, String add1, String add2, String city, String gender, String state, String pin ) {
        this.fname = fname;
        this.lname = lname;
        this.dob = dob;
        this.tel = tel;
        this.add1 = add1;
        this.add2 = add2;
        this.city = city;
        this.gender = gender;
        this.state = state;
        this.pin = pin;
    }
    
}
