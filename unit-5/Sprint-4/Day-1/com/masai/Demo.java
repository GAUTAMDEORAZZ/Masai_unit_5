package com.masai;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Demo {

	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String url= "jdbc:mysql://localhost:3306/db1";
		
		try {
			Connection conn=DriverManager.getConnection(url, "root","Deorazz@95");
			
			if(conn !=null) {
				System.out.println("Connected.....");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
}
