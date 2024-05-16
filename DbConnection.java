/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Informatica7
 */
public class DbConnection {

    private Connection connection;
    //url de la db
    private String url="jdbc:mysql://Localhost:3306/sales_db";
    private String user="root";
    private String password="";
 
    public Connection getConnection(){
        
        try {
            connection = DriverManager.getConnection(url, user, password);
            System.out.println("salio bien");

        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
        
        return connection;
    }
    
}
