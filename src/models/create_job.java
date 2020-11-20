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
public class create_job {
    String jobtitle, degreename, qualification, score,salary, exp, loc, rec_tel , description = "";

    public create_job(String jobtitle, String degreename, String qualification, String score, String salary, String exp, String loc, String rec_tel, String description) {
        this.jobtitle = jobtitle;
        this.degreename = degreename;
        this.qualification = qualification;
        this.score = score;
        this.salary = salary;
        this.exp = exp;
        this.loc = loc;
        this.rec_tel = rec_tel;
        this.description = description;
    }
    
    public String getRec_tel() {
        return rec_tel;
    }
    
    public String getDescription() {
        return description;
    }
    
    public String getJobtitle() {
        return jobtitle;
    }

    public String getDegreename() {
        return degreename;
    }

    public String getQualification() {
        return qualification;
    }

    public String getScore() {
        return score;
    }

    public String getSalary() {
        return salary;
    }

    public String getExp() {
        return exp;
    }

    public String getLoc() {
        return loc;
    }
    
}
