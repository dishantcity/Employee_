package com.conn;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnect {
	
	private static Connection conn = null;
	
	public static Connection getConn() {
		try {
			
			Class.forName("com.mysql.cj.jdbc.Driver");
				conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/employee_db", "root", "root123");
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	

}
