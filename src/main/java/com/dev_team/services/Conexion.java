package com.dev_team.services;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    
    
    private static final String DATA_BASE = "bd_sistemas_ventas";
    private static final String HOST = "localhost";
    private static final String USER= "root";
    private static final String PASSWORD = "";
    private static final String PUERTO = "3306";
    
    private static Connection cn;
    
    //conexion local
    public static Connection conectar()   {
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");   
            cn = DriverManager
                    .getConnection("jdbc:mysql://".concat(HOST).concat(":"+PUERTO+"/").concat(DATA_BASE+"?useSSL=true"), USER, PASSWORD);
            
        } catch (SQLException |ClassNotFoundException e) {
            System.out.println("Error en la conexion local " + e);
        }
        return cn;
    }
}