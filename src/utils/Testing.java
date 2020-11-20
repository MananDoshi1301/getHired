/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package utils;

import java.sql.*;

/**
 *
 * @author USER
 */
public class Testing {
    public static void main(String[] args) throws SQLException {
        try{
            DBconnection connect = new DBconnection();
            Connection conn = connect.createConnection(); 
            Statement stmt = conn.createStatement();
//            stmt.executeUpdate("");  Inserting data
            ResultSet rs = stmt.executeQuery("Select * from employeedetails");
            while(rs.next()){
                System.out.println(rs.getString(2)+" "+rs.getString(3));
            } 
        }catch(SQLException e){
            System.err.println(e);
        }
        
    }
}
