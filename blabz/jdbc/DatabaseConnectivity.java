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
				System.out.println("6.Batch Processing with statement");
				System.out.println("7.Batch processing with prepared statement");
				System.out.println("8.Commit");
				System.out.println("9.Rollback");
				choice = scanner.nextInt();
				String url = "jdbc:mysql://localhost:3306/demo";
				// System.out.println("connection established");
				String uname = "root";
				String pass = "password";
				Class.forName("com.mysql.cj.jdbc.Driver");
				Connection con = DriverManager.getConnection(url, uname, pass);
				Statement st = con.createStatement();
				con.setAutoCommit(false);
				PreparedStatement stmt = con.prepareStatement("insert into studentinfo values(?,?)");

				switch (choice) {
				case 1:

					String query = "select * from studentinfo ";
					ResultSet rs = st.executeQuery(query);
					while (rs.next()) {
						String udata = rs.getInt(1) + " " + rs.getString(2);
						System.out.println(udata);

					}
					break;

				case 2:

					String query1 = "insert into studentinfo values(22,'dipak')";
					int count = stmt.executeUpdate(query1);
					
					System.out.println(count + " rows affected");
					con.commit();
					break;

				case 3:
					String query2 = "delete from studentinfo where(sname = 'qwee	')";

					int count1 = stmt.executeUpdate(query2);
					System.out.println(count1 + "rows affected");
					con.commit();
					break;

				case 4:
					String query3 = "UPDATE studentinfo SET sname = 'qwerty' where sid=4";
					int count2 = stmt.executeUpdate(query3);
					System.out.println(count2 + "rows affected");
					break;

				case 5:
					String query4 = "CREATE TABLE demo.studentinfo(eid VARCHAR(10),ename VARCHAR(20))";
					stmt.executeUpdate(query4);
					System.out.println("Tabel Created");
					break;

				case 6:
					String query5 = "insert into studentinfo values(23,'asdfghf')";
					st.addBatch(query5);

					String queryr = "UPDATE studentinfo SET sname = 'qweee' where sid=1";
					st.addBatch(queryr);

					int count3[] = st.executeBatch();
					con.commit();
					System.out.println("Applied");
					break;

				case 7:
					int ch;
					do
					{	
					System.out.println("Enter sid");
					int sid = scanner.nextInt();
					System.out.println("Enter sname");
					String sname = scanner.next();
					stmt.setInt(1, sid);
					stmt.setString(2, sname);
					stmt.addBatch();
					int count4[]=stmt.executeBatch();
					con.commit();					
					System.out.println("record saved");
					System.out.println("Want to add more record press 1");
					 ch=scanner.nextInt();
					}while(ch!=0);
					
					break;

				case 8:
					con.commit();
					System.out.println("commiting here");
					break;
					
				case 9:
					String query6 = "delete from studentinfo where(sname = 'asddaQW')";
					int count9=stmt.executeUpdate(query6);
					System.out.println(count9+"rows affected");
					if(con!=null)
					{
						con.rollback();
						System.out.println("rollbacked");
					}
					
						
					
				}
				System.out.println();
				stmt.close();
				con.close();
			} while (choice != 11);
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
}
