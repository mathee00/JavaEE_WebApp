package database;

import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;

import beans.BeautifulThing;

public class DatabaseServices {
	
	//Connect
	String dbURL = "jdbc:mysql://localhost:3308/beautifulthings";
	String user = "root";
	String password = "";

	//four crud operations
	public int deleteOne(int id) throws SQLException {
		int numberOfRowsAffected = 0;
		
		Connection c = null;
		PreparedStatement stmt = null;
		//int rowsAffected = 0;
		
		c = DriverManager.getConnection(dbURL, user, password);
		System.out.println("Connection is successful"+dbURL);
		
		//create a SQL statement
		stmt = c.prepareStatement("delete from beautifulthings.thingstable where id = ?");
		//number 1 means number of parameters in the prepared statement.
		//What happens is that, the below code assigns the ? mark to an id value
		// which is sent through the method.
		stmt.setInt(1, id);
		
		//execute the statement
		numberOfRowsAffected = stmt.executeUpdate();
		
		//success message
		System.out.println("Rows affected "+numberOfRowsAffected);
		
		stmt.close();
		
		c.close();
		
		return numberOfRowsAffected;
	}
	
	public int insertOne(BeautifulThing b) throws SQLException {
		int numberOfRowsAffected = 0;

		Connection c = null;
		PreparedStatement stmt = null;
		//int rowsAffected = 0;
		
		c = DriverManager.getConnection(dbURL, user, password);
		System.out.println("Connection is successful"+dbURL);
		
		//create a SQL statement
		stmt = c.prepareStatement("insert into beautifulthings.thingstable (id, thing_title, thing_description, thing_value) values (null, ?, ?, ?)");
		
		stmt.setString(1, b.getThingTitle());
		stmt.setString(2, b.getThingDescription());
		stmt.setInt(3, b.getRating());

		//execute the statement
		numberOfRowsAffected = stmt.executeUpdate();
		
		//success message
		System.out.println("Rows inserted "+numberOfRowsAffected);
		
		stmt.close();
		
		c.close();
		
		return numberOfRowsAffected;
	}
	
	public ArrayList<BeautifulThing> readAll() throws SQLException {
		ArrayList<BeautifulThing> everyone = new ArrayList<>();
		BeautifulThing b;
		
		Connection c = null;
		Statement stmt = null;
		ResultSet rs = null;
		
		c = DriverManager.getConnection(dbURL, user, password);
		System.out.println("Connection is successful"+dbURL+"  User: "+user);
		
		//create a SQL statement
		stmt = c.createStatement();

		//execute the statement
		rs = stmt.executeQuery("select * from beautifulthings.thingstable");
		
		//process the rows in the result set
		while(rs.next()) {
			System.out.println("ID = "+rs.getInt("id")+" Title = "+rs.getString("thing_title")+" Description = "+rs.getString("thing_description")+" Rating = "+rs.getInt("thing_value"));
			
			b = new BeautifulThing(rs.getInt("id"), rs.getString("thing_title"), rs.getString("thing_description"), rs.getInt("thing_value"));
			everyone.add(b);
		}
		
		rs.close();
		
		stmt.close();
		
		c.close();
		
		return everyone;
		
	}
	
	public int updateOne(int id, BeautifulThing b) throws SQLException {
		int numberOfRowsAffected = 0;
		
		Connection c = null;
		PreparedStatement stmt = null;
		//int rowsAffected = 0;
		
		c = DriverManager.getConnection(dbURL, user, password);
		System.out.println("Connection is successful"+dbURL);
		
		//create a SQL statement
		stmt = c.prepareStatement("update beautifulthings.thingstable set thing_title = ?, thing_description = ?, thing_value = ? where id = ?");
		
		stmt.setString(1, b.getThingTitle());
		stmt.setString(2, b.getThingDescription());
		stmt.setInt(3, b.getRating());
		stmt.setInt(4, id);
//		stmt.setInt(4, b.getId());

		//execute the statement
		numberOfRowsAffected = stmt.executeUpdate();
		
		//success message
		System.out.println("Rows effected "+numberOfRowsAffected);
		
		stmt.close();
		
		c.close();
		
		return numberOfRowsAffected;
	}
}
