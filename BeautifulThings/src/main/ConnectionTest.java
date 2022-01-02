package main;

import java.sql.*;

public class ConnectionTest {

	public static void main(String[] args) throws SQLException {
		
		//connect
		String dbURL = "jdbc:mysql://localhost:3308/beautifulthings";
		String user = "root";
		String password = "";
		
		
		Connection c = null;
		
		c = DriverManager.getConnection(dbURL, user, password);
		System.out.println("Connection is successful "+dbURL);

	}

}
