package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class DeleteData {
	public static void main(String[] args) {
		String dbURL = "jdbc:mysql://localhost:3306/sriindu";
		String username = "root";
		String password = "root";
		 
		try {
		 
		    Connection conn = DriverManager.getConnection(dbURL, username, password);
		    String sql = "DELETE FROM Users WHERE username=?";
		    
		    PreparedStatement statement = conn.prepareStatement(sql);
		    statement.setString(1, "suresh");
		     
		    int rowsDeleted = statement.executeUpdate();
		    if (rowsDeleted > 0) {
		        System.out.println("A user was deleted successfully!");
		    }
		    else 
		    {
		    	System.out.println("no records found!");
		    }
		} catch (SQLException ex) {
		    ex.printStackTrace();
		}
	}

	

}
