package com.revature.pixott.Dao;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;


public class Signupdao {
	public static String insertdetails(String name,String number,String password ) {
		String sql = "insert into username (name,number,password) values (?,?,?)";
		try (
				Connection connection = Util.getConnection();
				PreparedStatement stmt = connection.prepareStatement(sql);
			) {
				stmt.setString(1,name);
				stmt.setString(2,number);
				stmt.setString(3,password);
				stmt.executeUpdate();
			} catch (SQLException e) {
				Util.displayMessage(e);
			}
			return "you have been signed in succesfully" ;
		
	} 

}
