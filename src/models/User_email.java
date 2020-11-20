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
public class User_email {
    private String User_email="";
    private String User_password=""; 
    private int employee_0_employer_1;
    
    public String getUser_employee_0_employer_1(){
        if(employee_0_employer_1 == 1)return "Employer";
        else return "Employee";
    }
    
    public void setUser_employee_0_employer_1(String emp){
        if(emp == "Employer") this.employee_0_employer_1 = 1;
        else this.employee_0_employer_1 = 0;
//        System.out.println(employee_0_employer_1);
    }

    public String getUser_email() {
        return User_email;
    }

    public void setUser_email(String User_email) {
        this.User_email = User_email;
//        System.out.println(this.User_email);
    }

    public String getUser_password() {
        return User_password;
    }

    public void setUser_password(String User_password) {
        this.User_password = User_password;
//        System.out.println(this.User_password);
    }

}
