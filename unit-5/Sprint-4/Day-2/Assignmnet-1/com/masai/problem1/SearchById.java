package com.masai.problem1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;
public class SearchById {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter your emplyee id no");
		int empid=sc.nextInt();
		
		try {
//			Class.forName("com.mysql.cj.jdbc.Driver");
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:mysql://localhost:3306/db2";
		
		 
		try (Connection conn=DriverManager.getConnection(url, "root","Deorazz@95")){
			PreparedStatement ps=conn.prepareStatement("select * from employee2 where eid=?");
			ps.setInt(1,empid);
			ResultSet rs=ps.executeQuery();
			if(rs.next()) {
				int eid=rs.getInt("eid");
				String name=rs.getString("name");
				String address=rs.getString("address");
				int salary=rs.getInt("salary");
				
				System.out.println("Employee_id   : "+eid);
				System.out.println("Name   : "+name);
				System.out.println("Address   : " +address);
				System.out.println("Salary    : "+salary);
			}
			else {
				System.out.println("enployee id is invalid");
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
				

	}

}
