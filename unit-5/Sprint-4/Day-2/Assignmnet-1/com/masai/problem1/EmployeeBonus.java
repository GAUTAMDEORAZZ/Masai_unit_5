package com.masai.problem1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeBonus {

	public static void main(String[] args) {
		
//		Scanner sc=new Scanner(System.in);
//		System.out.println("Enter the value of bonus");
//		int bonus=sc.nextInt();
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		String url="jdbc:mysql://localhost:3306/db2";
		try (Connection conn= DriverManager.getConnection(url,"root","Deorazz@95")){
			
			if(conn!=null) {
				System.out.println("Connected");
			}
			PreparedStatement ps=conn.prepareStatement("update employee2 set salary=salary+900");
		int x=	ps.executeUpdate();
		if(x>0) {
			System.out.println("update sucessfully");
//			ResultSet rs=ps.executeQuery();
//			while(rs.next()) {
				
			}
		
		PreparedStatement ps2=conn.prepareStatement("Select * from employee2");
		ResultSet rs=ps2.executeQuery();
		while(rs.next()) {
			int eid=rs.getInt("eid");
			String name=rs.getString("name");
			String address=rs.getString("address");
			int salary=rs.getInt("salary");
			
			System.out.println("eid   : "+eid);
			System.out.println("name   : "+name);
			System.out.println("address   : " +address);
			System.out.println("salary    : "+salary);
			System.out.println("---------------------*******--------");
		}
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
