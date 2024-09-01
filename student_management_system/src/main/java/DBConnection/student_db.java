package DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;

import Models.student_models;

public class student_db {

	
	
private static Connection con =  null;
	
	private static String Driver="com.mysql.cj.jdbc.Driver";
	
	private static String URL="jdbc:mysql://localhost:3306/Student_management";
	
	private static String Username="root";
	
	private static String Password="root";
	
	public static Connection getConn() {
		
		try {
			
			Class.forName(Driver);
			
			con = DriverManager.getConnection(URL, Username, Password);
			
		}
		catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
	}

	
}
