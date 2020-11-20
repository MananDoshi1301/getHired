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
public class EmployerSignUp1_dbclass {
    //    String name, gst, add1, add2, city, state, tel, pin, error = "";
    String name, gst, add1, add2, city, state, tel, pin;
    public EmployerSignUp1_dbclass(String name, String gst, String add1, String add2, String city, String state, String tel, String pin){
        this.name = name;
        this.gst = gst;
        this.add1 = add1;
        this.add2 = add2;
        this.city = city;
        this.state = state;
        this.tel = tel;
        this.pin = pin;
    }; 

    public String getName() {
        return name;
    }

    public String getGst() {
        return gst;
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

    public String getState() {
        return state;
    }

    public String getTel() {
        return tel;
    }

    public String getPin() {
        return pin;
    }
}
