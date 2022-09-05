package com.masai.problem1;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class EmployeeInsert {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);

		System.out.println("Eneter employee id");
		int emplId=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter your name");
		String name=sc.nextLine();
		System.out.println("Enter your Salary");
		int salary=sc.nextInt();
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
		
      String url="jdbc:mysql://localhost:3306/db2";
		try (Connection conn= DriverManager.getConnection(url,"root","Deorazz@95")){
			
			PreparedStatement ps=conn.prepareStatement("insert into employee2 values(?,?,?,?)");
			ps.setInt(1, emplId);
			ps.setString(2, name);
			ps.setString(3, null);
			ps.setInt(4, salary);
			int x=ps.executeUpdate();
			
			if(x>0) {
				System.out.println("Insertion successfully done");
			}
			else {
				System.out.println("insertion falied");
			}
		}
			catch (SQLException e) {
				
				e.printStackTrace();
			}
		
		

	}

}
