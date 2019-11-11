package com.blabz.jdbc;

import java.sql.*;
import java.util.Scanner;

public class DatabaseConnectivity {
	@SuppressWarnings("resource")
	public static void main(String[] args) throws Exception {
		try {
			Scanner scanner = new Scanner(System.in);
			int choice;
			do {
			System.out.println("1.Read data");
			System.out.println("2.Insert Value");
			System.out.println("3.Delete Value");
			System.out.println("4.Update Value");
			System.out.println("5.Create Table");
			choice = scanner.nextInt();
			String url = "jdbc:mysql://localhost:3306/demo";
			String uname = "root";
			String pass = "password";
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection(url, uname, pass);
			// Statement st = con.createStatement();
			PreparedStatement stmt = (PreparedStatement) con
					.prepareStatement("insert into studentinfo values(1,'abc')");
			switch (choice) 
			{
			case 1:

				String query = "select * from studentinfo ";
				ResultSet rs = stmt.executeQuery(query);
				while (rs.next()) {
					String udata = rs.getInt(1) + " " + rs.getString(2);
					System.out.println(udata);
					
				}
				break;
				
				
			case 2:
				
				String query1="insert into studentinfo values(4,'satish')";
				int count = stmt.executeUpdate(query1);
				System.out.println(count+" rows affected");
				break;
				
			case 3:
				String query2="delete from studentinfo where(sname = 'satish')";

				int count1=stmt.executeUpdate(query2);
				System.out.println(count1+ "rows affected");
				break;
				
				
			case 4:
				String query3="UPDATE studentinfo SET sname = 'mayur' where sid=4";
				int count2=stmt.executeUpdate(query3);
				System.out.println(count2 + "rows affected");
				break;
				
				
			case 5:
				String query4="CREATE TABLE demo.employee2(eid VARCHAR(10),ename VARCHAR(20))";              
				stmt.executeUpdate(query4);
				System.out.println("Tabel Created");
				break;
			}
			System.out.println();
			stmt.close();
			con.close();
			}while(choice!=6);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
