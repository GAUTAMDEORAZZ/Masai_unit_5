package com.masai.problem1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Employee {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the employee id");
		int id=sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/db2";
		
		try(Connection conn=DriverManager.getConnection(url, "root", "Deorazz@95")) {
			
			PreparedStatement ps= conn.prepareStatement("select salary from employee2 where eid=?");
			ps.setInt(1, id);
			
			ResultSet x=ps.executeQuery();
			if(x.next()) {
				int salary=x.getInt("Salary");
				System.out.println("The salary is "+salary);
			}
			else {
				System.out.println("invalid employee id");
			}
			
			
		} catch (SQLException e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}

	}

}
