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
public class EmployerSignUp2_dbclass {
//    String fname, lname, hireexp, jobtitle, tel, email;
    String fname, lname, hireexp, jobtitle, tel, email;

    public EmployerSignUp2_dbclass(String fname, String lname, String hireexp, String jobtitle, String tel, String email){
        this.email = email;
        this.fname = fname;
        this.hireexp = hireexp;
        this.lname = lname;
        this.tel = tel;
        this.jobtitle = jobtitle;
    }

    public String getFname() {
        return fname;
    }

    public String getLname() {
        return lname;
    }

    public String getHireexp() {
        return hireexp;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public String getTel() {
        return tel;
    }

    public String getEmail() {
        return email;
    }
}
