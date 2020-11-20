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
public class EmployeeSignUp3_db {
    String orgname, jobloc, jobtitle, workexp;

    public String getOrgname() {
        return orgname;
    }

    public String getJobloc() {
        return jobloc;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public String getWorkexp() {
        return workexp;
    }

    public EmployeeSignUp3_db(String orgname, String jobloc, String jobtitle, String workexp) {
        this.orgname = orgname;
        this.jobloc = jobloc;
        this.jobtitle = jobtitle;
        this.workexp = workexp;
    }
}
