package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnection {

	
	//parametros de conexion
	 private static final String URL = "jdbc:mysql://localhost:3306/webapp";
	 private static final String USER = "root";
	 private static final String PASS = "admin";

	 
   /**
    * metodo que genera la conexion de la bd
    * @return
    */
	 public static Connection getConnection() {
		 try {
	            Class.forName("com.mysql.cj.jdbc.Driver");
	            return DriverManager.getConnection(URL, USER, PASS);
	        } catch (ClassNotFoundException | SQLException e) {
	            e.printStackTrace();
	            throw new RuntimeException("Error en la conexión con la base de datos");
	        }
	    
	 }
}
