package com.masai.problem1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;




public class employeeDetails {

	public static void main(String[] args) {	
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
		String url="jdbc:mysql://localhost:3306/db2";
		 try(Connection conn =DriverManager.getConnection(url,"root", "Deorazz@95")) {
			
			PreparedStatement ps=conn.prepareStatement("Select * from employee2");
			ResultSet rs=ps.executeQuery();
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
