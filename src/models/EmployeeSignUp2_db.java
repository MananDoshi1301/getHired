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
public class EmployeeSignUp2_db {
    String qualification, institute, degreename, year, score;

    public EmployeeSignUp2_db(String qualification, String institute, String degreename, String year, String score) {
        this.qualification = qualification;
        this.institute = institute;
        this.degreename = degreename;
        this.year = year;
        this.score = score;
    }

    public String getQualification() {
        return qualification;
    }

    public String getInstitute() {
        return institute;
    }

    public String getDegreename() {
        return degreename;
    }

    public String getYear() {
        return year;
    }

    public String getScore() {
        return score;
    }
}
