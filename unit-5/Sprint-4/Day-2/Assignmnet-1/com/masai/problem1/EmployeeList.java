package com.masai.problem1;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployeeList {

	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		String url="jdbc:mysql://localhost:3306/db2";
		try (Connection conn= DriverManager.getConnection(url,"root","Deorazz@95")){
			
			
			List<EmployeeDemo>  employee=new ArrayList<>();
		
		System.out.println(employee);
		PreparedStatement ps2=conn.prepareStatement("Select * from employee2 where salary<80000");
		ResultSet rs=ps2.executeQuery();
		while(rs.next()) {
			int eid=rs.getInt("eid");
			String name=rs.getString("name");
			String address=rs.getString("address");
			int salary=rs.getInt("salary");
			
			EmployeeDemo emp=new EmployeeDemo(eid, name, address, salary);
			employee.add(emp);
		}
			employee.forEach(s -> System.out.println(s));
				
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		

	}

}
