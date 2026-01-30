/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.distribuidora.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author LUIZVINICIUSCASSABON
 */
public class ConnectionFactory {
    
     private final static String URL = "jdbc:mysql://localhost:3306/distribuidora";
    private final static String USER = "root";
     private final static String PASSWORD = "root";
    
    public static Connection getConnection() throws SQLException{
    
         return DriverManager.getConnection(URL, USER, PASSWORD);
    }
    
}
