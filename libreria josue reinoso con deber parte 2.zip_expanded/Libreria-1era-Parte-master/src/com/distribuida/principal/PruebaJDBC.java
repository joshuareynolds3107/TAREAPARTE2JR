package com.distribuida.principal;

import org.springframework.context.ApplicationContext;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;
import java.sql.DriverManager;

public class PruebaJDBC {
	public static void main(String []args) {
		
		String jdbcURL= "jdbc:mysql://localhost:3306/dblibreria60";
		String user="root";
		String clave="root";
		
		try	{
			
			System.out.println("Estableciendo conexion a DB!!...");
			Connection connection = DriverManager.getConnection(jdbcURL, user, clave);
			
			System.out.println("Conexion establecida!!");
			
		}catch (Exception e) {
			
			e.printStackTrace();
		}
	}

}
