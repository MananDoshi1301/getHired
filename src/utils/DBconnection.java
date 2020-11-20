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
public class DBconnection {
    public Connection createConnection(){
        try{
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/gethired?user=root&password=root");
            return conn;
        } catch(SQLException e){
            System.err.println(e);
            return null;
        }
    }
}
