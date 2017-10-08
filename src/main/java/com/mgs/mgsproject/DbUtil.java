/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mgs.mgsproject;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author User HP
 */

public class DbUtil {
    private static Connection connection = null; 
    
    public static void main(String[] args) {
        getConnection();
        System.out.println("sukses");
    }
    
    public static Connection getConnection() {
        
        if (connection != null){
            
            return connection;
        }
        else {
            
            try {
            	
                String driver = "com.mysql.jdbc.Driver";
                String url = "jdbc:mysql://localhost:3306/akademik";
                String user = "root";
                String password = "";
                Class.forName(driver);
                connection = DriverManager.getConnection(url, user, password);
            } catch (ClassNotFoundException e) {
                e.printStackTrace();
            } catch (SQLException e) {
                e.printStackTrace();
            } 
            return connection;
        }

    }
}
